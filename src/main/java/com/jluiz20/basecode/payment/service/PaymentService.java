package com.jluiz20.basecode.payment.service;

import com.jluiz20.basecode.payment.Payment;
import com.jluiz20.basecode.payment.payload.PaymentRequest;

import java.util.List;

public interface PaymentService {

    Payment create(PaymentRequest paymentRequest);

    void process(List<PaymentRequest> paymentsRequest);
}
