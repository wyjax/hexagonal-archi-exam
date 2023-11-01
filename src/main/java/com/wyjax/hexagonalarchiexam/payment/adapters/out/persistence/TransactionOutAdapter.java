package com.wyjax.hexagonalarchiexam.payment.adapters.out.persistence;

import com.wyjax.hexagonalarchiexam.payment.application.port.out.InquiryOutPort;
import com.wyjax.hexagonalarchiexam.payment.domain.Transaction;
import org.springframework.stereotype.Repository;

@Repository
public class TransactionOutAdapter implements InquiryOutPort {

    @Override
    public Transaction findTransaction() {

        return null;
    }
}
