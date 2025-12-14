package com.carddemo.api.controller;

import com.carddemo.api.dto.BillPaymentDto;
import com.carddemo.api.service.BillPaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/bills")
@RequiredArgsConstructor
public class BillPaymentController {

    private final BillPaymentService billPaymentService;

    @PostMapping("/pay")
    public ResponseEntity<String> payBill(@RequestBody BillPaymentDto paymentDto) {
        return billPaymentService.payBill(paymentDto)
                .map(tranId -> ResponseEntity.ok("Payment Successful. Transaction ID: " + tranId))
                .orElse(ResponseEntity.badRequest().body("Payment Failed. Account not found."));
    }
}
