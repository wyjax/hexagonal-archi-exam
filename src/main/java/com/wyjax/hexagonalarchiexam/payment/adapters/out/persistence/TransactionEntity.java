package com.wyjax.hexagonalarchiexam.payment.adapters.out.persistence;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class TransactionEntity {

    @Id
    private String id;

    private String cardNum;

    private Long price;

    private Long vat;
}
