package com.wyjax.hexagonalarchiexam.payment.adapters.in.web;

import com.wyjax.hexagonalarchiexam.payment.adapters.in.web.dto.PaymentInquiryInput;
import com.wyjax.hexagonalarchiexam.payment.application.PaymentInquiryDto;
import com.wyjax.hexagonalarchiexam.payment.application.port.in.InquiryUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*
    Input Adapter(web)
 */
@RestController
@RequiredArgsConstructor
public class PaymentController {

    private final InquiryUseCase inquiryUseCase;

    @GetMapping("/api/pay")
    public ResponseEntity<PaymentInquiryDto> getPayment(PaymentInquiryInput input) {
        PaymentInquiryDto dto = inquiryUseCase.getPayment(input);
        return ResponseEntity.ok(dto);
    }
}
