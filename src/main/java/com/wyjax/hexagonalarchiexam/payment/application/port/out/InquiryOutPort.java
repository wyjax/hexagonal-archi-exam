package com.wyjax.hexagonalarchiexam.payment.application.port.out;

import com.wyjax.hexagonalarchiexam.payment.domain.Transaction;

public interface InquiryOutPort {
    Transaction findTransaction();
}


/*
    adapter.in (controller) -> port.in (service
 */