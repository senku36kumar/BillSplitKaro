package com.senku36.billsplitkaro;

import java.math.BigDecimal;

public class Balance {
    public String name;
    BigDecimal balance;

    Balance(BigDecimal balance,String name) {
        this.name = name;
        this.balance = balance;
    }
}
