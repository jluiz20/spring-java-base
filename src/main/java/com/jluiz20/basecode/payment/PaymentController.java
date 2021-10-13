package com.jluiz20.basecode.payment;

import com.jluiz20.basecode.payment.payload.PaymentRequest;
import com.jluiz20.basecode.payment.service.PaymentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@Controller
@RequestMapping("payments")
public class PaymentController {

    private PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping
    public ResponseEntity<Void> create(@Valid @RequestBody PaymentRequest paymentRequest) {
        Payment payment = paymentService.create(paymentRequest);

        return ResponseEntity.created(URI.create("/payments/" + paymentRequest.getId())).build();
    }


    @PostMapping("process")
    @ResponseStatus(HttpStatus.OK)
    public void process(@Valid @RequestBody List<PaymentRequest> paymentsRequest) {
        paymentService.process(paymentsRequest);
    }
}
