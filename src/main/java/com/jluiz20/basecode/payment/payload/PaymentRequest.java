package com.jluiz20.basecode.payment.payload;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Getter
@Setter
public class PaymentRequest {

    @NotNull(message = "id is required")
    private Integer id;

    @NotNull
    @Min(0)
    private BigDecimal amount;
}
