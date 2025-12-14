package com.carddemo.api.controller;

import com.carddemo.api.dto.AccountDto;
import com.carddemo.api.dto.AccountUpdateDto;
import com.carddemo.api.service.AccountUpdateService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/accounts")
@RequiredArgsConstructor
public class AccountUpdateController {

    private final AccountUpdateService accountUpdateService;

    @PutMapping("/{id}")
    public ResponseEntity<AccountDto> updateAccount(@PathVariable Long id, @RequestBody AccountUpdateDto updateDto) {
        return accountUpdateService.updateAccount(id, updateDto)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
