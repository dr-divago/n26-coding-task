package com.n26.model;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Transaction {

    @NotNull
    private BigDecimal amount;

    @NotNull
    private LocalDateTime timestamp;

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

}
