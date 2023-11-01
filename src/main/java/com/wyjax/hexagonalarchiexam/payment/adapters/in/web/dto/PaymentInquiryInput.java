package com.wyjax.hexagonalarchiexam.payment.adapters.in.web.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PaymentInquiryInput {

    private String cardNum;
    private String cvc;
    private Long price;
    private Long vat;
}
