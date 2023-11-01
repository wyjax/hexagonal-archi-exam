package com.wyjax.hexagonalarchiexam.payment.application;

import lombok.Getter;

@Getter
public class PaymentInquiryDto {

    private String cardNum;
    private Long price;
    private Long vat;
}
