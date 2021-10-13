package com.jluiz20.basecode.payment;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class Payment {

    private Integer id;
    private BigDecimal amount;
}
