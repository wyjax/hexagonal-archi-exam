package com.wyjax.hexagonalarchiexam.payment.adapters.out.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<TransactionEntity, Long> {

}
