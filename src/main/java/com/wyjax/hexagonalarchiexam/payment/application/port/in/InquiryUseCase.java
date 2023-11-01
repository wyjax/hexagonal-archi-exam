package com.wyjax.hexagonalarchiexam.payment.application.port.in;

import com.wyjax.hexagonalarchiexam.payment.adapters.in.web.dto.PaymentInquiryInput;
import com.wyjax.hexagonalarchiexam.payment.application.PaymentInquiryDto;

public interface InquiryUseCase {
    PaymentInquiryDto getPayment(PaymentInquiryInput input);
}
