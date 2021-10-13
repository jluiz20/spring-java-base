package com.jluiz20.basecode.payment.service;

import com.jluiz20.basecode.payment.Payment;
import com.jluiz20.basecode.payment.payload.PaymentRequest;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Override
    public Payment create(PaymentRequest paymentRequest) {

        return null;
    }

    @Override
    public void process(List<PaymentRequest> paymentsRequest) {
        BigDecimal sum = paymentsRequest.stream()
                .map(PaymentRequest::getAmount)
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        Map<Integer, PaymentRequest> map = paymentsRequest.stream()
                .collect(Collectors.toMap(PaymentRequest::getId, Function.identity()));

        System.out.println(map);

        IntStream.of(1)
                .parallel()

    }
}
