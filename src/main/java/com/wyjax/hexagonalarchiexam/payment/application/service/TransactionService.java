package com.wyjax.hexagonalarchiexam.payment.application.service;

import com.wyjax.hexagonalarchiexam.payment.adapters.in.web.dto.PaymentInquiryInput;
import com.wyjax.hexagonalarchiexam.payment.application.PaymentInquiryDto;
import com.wyjax.hexagonalarchiexam.payment.application.port.in.InquiryUseCase;
import com.wyjax.hexagonalarchiexam.payment.application.port.out.InquiryOutPort;
import com.wyjax.hexagonalarchiexam.payment.domain.Transaction;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/*
    service라고 되어 있지만 usecase 라고도함, port.in

    input adapter -> port.in -> service -> port.out
 */
@Service
@RequiredArgsConstructor
public class TransactionService implements InquiryUseCase {

    private final InquiryOutPort inquiryOutPort;

    @Override
    public PaymentInquiryDto getPayment(PaymentInquiryInput input) {
        Transaction transaction = inquiryOutPort.findTransaction();
        return new PaymentInquiryDto();
    }
}
