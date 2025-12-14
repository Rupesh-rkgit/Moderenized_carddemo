package com.carddemo.api.controller;

import com.carddemo.api.dto.AccountViewDto;
import com.carddemo.api.service.AccountViewService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/accounts")
@RequiredArgsConstructor
public class AccountViewController {

    private final AccountViewService accountViewService;

    @GetMapping("/{id}/details")
    public ResponseEntity<AccountViewDto> getAccountDetails(@PathVariable Long id) {
        return accountViewService.getAccountDetails(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
