package extended;

import org.junit.Test;

import java.math.BigDecimal;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MoneyTest {
    @Test
    public void testCanMultiplyMoneyWithDouble() throws Exception {
        Money money = new Money(new BigDecimal(50000.56), Currency.Dollar);
        assertThat(money.multiply(4.5), is(new Money(new BigDecimal(225002.52), Currency.Dollar)));
    }

    @Test
    public void testCanMultiplyMoneyWithDoubleForEvenResults() throws Exception {
        Money money = new Money(new BigDecimal(50000), Currency.Dollar);
        assertThat(money.multiply(4.5), is(new Money(new BigDecimal(225000.00), Currency.Dollar)));
    }

    @Test
    public void testDoesNeedToConvertToGivenCurrency() throws Exception {
        //Given
        Money money = new Money(new BigDecimal(3), Currency.Dollar);
        Currency differentCurrency = Currency.BritishPound;
        Currency sameCurrency = Currency.Dollar;

        //When
        boolean needToConvertForDifferent = money.isNeedToConvertCurrency(differentCurrency);
        boolean needToConvertForSame = money.isNeedToConvertCurrency(sameCurrency);

        //Then
        assertThat(needToConvertForDifferent, is(true));
        assertThat(needToConvertForSame, is(false));
    }
}
