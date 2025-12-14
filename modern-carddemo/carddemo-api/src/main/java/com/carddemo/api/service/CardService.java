package com.carddemo.api.service;

import com.carddemo.api.dto.CardUpdateDto;
import com.carddemo.core.domain.Card;
import com.carddemo.core.repository.CardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CardService {

    private final CardRepository cardRepository;

    @Transactional(readOnly = true)
    public Optional<Card> getCard(String cardNumber) {
        return cardRepository.findById(cardNumber);
    }

    @Transactional
    public Optional<Card> updateCard(String cardNumber, CardUpdateDto updateDto) {
        return cardRepository.findById(cardNumber).map(card -> {
            if (updateDto.getEmbossedName() != null) card.setCardEmbossedName(updateDto.getEmbossedName());
            if (updateDto.getExpirationDate() != null) card.setCardExpirationDate(updateDto.getExpirationDate());
            if (updateDto.getActiveStatus() != null) card.setCardActiveStatus(updateDto.getActiveStatus());
            return cardRepository.save(card);
        });
    }
}
