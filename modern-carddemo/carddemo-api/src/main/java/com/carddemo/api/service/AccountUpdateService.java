package com.carddemo.api.service;

import com.carddemo.api.dto.AccountDto;
import com.carddemo.api.dto.AccountUpdateDto;
import com.carddemo.core.domain.Account;
import com.carddemo.core.domain.Customer;
import com.carddemo.core.domain.CardCrossReference;
import com.carddemo.core.repository.AccountRepository;
import com.carddemo.core.repository.CardCrossReferenceRepository;
import com.carddemo.core.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AccountUpdateService {

    private final AccountRepository accountRepository;
    private final CardCrossReferenceRepository cardCrossReferenceRepository;
    private final CustomerRepository customerRepository;

    @Transactional
    public Optional<AccountDto> updateAccount(Long accountId, AccountUpdateDto updateData) {
        // 1. Fetch Account
        Optional<Account> accountOpt = accountRepository.findById(accountId);
        if (accountOpt.isEmpty()) {
            return Optional.empty();
        }
        Account account = accountOpt.get();

        // 2. Update Account Fields (Validation logic would go here - e.g. check limits)
        if (updateData.getCreditLimit() != null) {
            account.setAccountCreditLimit(updateData.getCreditLimit());
        }
        if (updateData.getCashCreditLimit() != null) {
            account.setAccountCashCreditLimit(updateData.getCashCreditLimit());
        }
        if (updateData.getExpirationDate() != null) {
            account.setAccountExpirationDate(updateData.getExpirationDate());
        }
        if (updateData.getReissueDate() != null) {
            account.setAccountReissueDate(updateData.getReissueDate());
        }

        accountRepository.save(account);

        // 3. Update Customer Address (Complex Logic: Account -> XREF -> Customer)
        List<CardCrossReference> xrefs = cardCrossReferenceRepository.findByXrefAccountId(accountId);
        if (!xrefs.isEmpty()) {
            Integer customerId = xrefs.get(0).getXrefCustomerId();
            Optional<Customer> custOpt = customerRepository.findById(customerId);
            if (custOpt.isPresent()) {
                Customer customer = custOpt.get();
                if (updateData.getAddressLine1() != null) customer.setCustomerAddressLine1(updateData.getAddressLine1());
                if (updateData.getAddressLine2() != null) customer.setCustomerAddressLine2(updateData.getAddressLine2());
                if (updateData.getAddressLine3() != null) customer.setCustomerAddressLine3(updateData.getAddressLine3());
                if (updateData.getAddressStateCode() != null) customer.setCustomerAddressStateCode(updateData.getAddressStateCode());
                if (updateData.getAddressZip() != null) customer.setCustomerAddressZip(updateData.getAddressZip());
                if (updateData.getPhoneNum1() != null) customer.setCustomerPhoneNum1(updateData.getPhoneNum1());
                if (updateData.getPhoneNum2() != null) customer.setCustomerPhoneNum2(updateData.getPhoneNum2());

                customerRepository.save(customer);
            }
        }

        return Optional.of(toDto(account));
    }

    private AccountDto toDto(Account account) {
        AccountDto dto = new AccountDto();
        dto.setAccountId(account.getAccountId());
        dto.setBalance(account.getAccountCurrentBalance());
        dto.setCreditLimit(account.getAccountCreditLimit());
        return dto;
    }
}
