package com.carddemo.api.controller;

import com.carddemo.api.dto.CardUpdateDto;
import com.carddemo.api.service.CardService;
import com.carddemo.core.domain.Card;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/cards")
@RequiredArgsConstructor
public class CardController {

    private final CardService cardService;

    @GetMapping("/{cardNumber}")
    public ResponseEntity<Card> getCard(@PathVariable String cardNumber) {
        return cardService.getCard(cardNumber)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{cardNumber}")
    public ResponseEntity<Card> updateCard(@PathVariable String cardNumber, @RequestBody CardUpdateDto updateDto) {
        return cardService.updateCard(cardNumber, updateDto)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
