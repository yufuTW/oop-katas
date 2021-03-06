package extended;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Money {
    private final BigDecimal amount;
    private final Currency currency;

    public Money(BigDecimal amount, Currency currency) {
        this.amount = amount.setScale(2, RoundingMode.HALF_EVEN);
        this.currency = currency;
    }

    public Money multiply(double multiplier) {
        return new Money(amount.multiply(new BigDecimal(multiplier)), currency);
    }

    @Override
    public String toString() {
        return "Amount: " + amount + "; Currency: " + currency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Money money = (Money) o;

        if (amount != null ? !amount.equals(money.amount) : money.amount != null) return false;
        if (currency != money.currency) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = amount != null ? amount.hashCode() : 0;
        result = 31 * result + (currency != null ? currency.hashCode() : 0);
        return result;
    }

    public boolean isNeedToConvertCurrency(Currency salaryCurrency) {
        return currency != salaryCurrency;
    }

    public Currency getCurrency() {
        return currency;
    }

    public Money changeCurrency(Currency toCurrency) {
        return new Money(amount,toCurrency);
    }
}
