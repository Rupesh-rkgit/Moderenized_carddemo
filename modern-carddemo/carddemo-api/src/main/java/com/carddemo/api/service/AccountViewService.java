package com.carddemo.api.service;

import com.carddemo.api.dto.AccountViewDto;
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
public class AccountViewService {

    private final AccountRepository accountRepository;
    private final CardCrossReferenceRepository cardCrossReferenceRepository;
    private final CustomerRepository customerRepository;

    @Transactional(readOnly = true)
    public Optional<AccountViewDto> getAccountDetails(Long accountId) {
        Optional<Account> accountOpt = accountRepository.findById(accountId);
        if (accountOpt.isEmpty()) {
            return Optional.empty();
        }
        Account account = accountOpt.get();

        AccountViewDto dto = new AccountViewDto();
        dto.setAccountId(account.getAccountId());
        dto.setCurrentBalance(account.getAccountCurrentBalance());
        dto.setCreditLimit(account.getAccountCreditLimit());
        dto.setOpenDate(account.getAccountOpenDate());
        dto.setExpirationDate(account.getAccountExpirationDate());

        // Fetch Customer
        List<CardCrossReference> xrefs = cardCrossReferenceRepository.findByXrefAccountId(accountId);
        if (!xrefs.isEmpty()) {
            Optional<Customer> custOpt = customerRepository.findById(xrefs.get(0).getXrefCustomerId());
            if (custOpt.isPresent()) {
                Customer cust = custOpt.get();
                dto.setCustomerName(cust.getCustomerFirstName() + " " + cust.getCustomerLastName());
                dto.setCustomerAddress(cust.getCustomerAddressLine1() + ", " + cust.getCustomerAddressStateCode());
                dto.setCustomerPhone(cust.getCustomerPhoneNum1());
            }
        }

        return Optional.of(dto);
    }
}
