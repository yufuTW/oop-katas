package extended;

import org.junit.Test;

import java.math.BigDecimal;
import java.util.Hashtable;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CurrencyConverterTest {
    @Test
    public void testConvertToRightMoneyBasedOnGivenExchangeRate() throws Exception {
        //Given
        Hashtable<String,Double> rateTable = new Hashtable<String, Double>();
        rateTable.put("Dollar To BritishPound", 0.5);
        CurrencyConverter converter = new CurrencyConverter(rateTable);
        Currency toCurrency = Currency.BritishPound;
        Money money = new Money(new BigDecimal(2.0),Currency.Dollar);

        //When
        Money convertedMoney = converter.convertMoneyToGivenCurrency(money, toCurrency);

        //Then
        assertThat(convertedMoney, is(new Money(new BigDecimal(1.0), Currency.BritishPound)));
    }
}
