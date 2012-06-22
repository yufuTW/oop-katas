package extended;

import java.util.Hashtable;

public class CurrencyConverter {
    private Hashtable<String, Double> exchangeRateTable = new Hashtable<String, Double>();

    public CurrencyConverter(Hashtable<String,Double> exchangeRateTable) {

        this.exchangeRateTable = exchangeRateTable;
    }

    public Money convertMoneyToGivenCurrency(Money money, Currency toCurrency) {
        String keyString = money.getCurrency() + " To " + toCurrency;
        double exchangeRate = exchangeRateTable.get(keyString);
        return money.multiply(exchangeRate).changeCurrency(toCurrency);
    }
}
