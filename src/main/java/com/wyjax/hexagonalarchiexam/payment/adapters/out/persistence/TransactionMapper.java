package com.wyjax.hexagonalarchiexam.payment.adapters.out.persistence;

import com.wyjax.hexagonalarchiexam.payment.domain.Transaction;
import org.springframework.stereotype.Component;

@Component
public class TransactionMapper {

    public Transaction toDomain(TransactionEntity entity) {
        return Transaction.builder()
            .cardNum(entity.getCardNum())
            .price(entity.getPrice())
            .vat(entity.getVat())
            .build();
    }
}
