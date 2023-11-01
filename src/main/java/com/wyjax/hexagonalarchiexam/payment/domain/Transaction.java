package com.wyjax.hexagonalarchiexam.payment.domain;

import lombok.Builder;
import lombok.NoArgsConstructor;

// domain이 따로 있고 영속성을 관리하기 위한 entity class가 따로 있음
@NoArgsConstructor
public class Transaction {

    private String cardNum;
    private Long price;
    private Long vat;

    @Builder
    public Transaction(String cardNum, Long price, Long vat) {
        this.cardNum = cardNum;
        this.price = price;
        this.vat = vat;
    }
}
