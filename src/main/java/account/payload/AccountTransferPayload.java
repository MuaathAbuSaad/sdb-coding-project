package account.payload;


import java.math.BigDecimal;

public class AccountTransferPayload {
    private Long toAccountNumber;
    private BigDecimal amount;

    public Long getToAccountNumber() {
        return toAccountNumber;
    }

    public void setToAccountNumber(Long toAccountNumber) {
        this.toAccountNumber = toAccountNumber;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
