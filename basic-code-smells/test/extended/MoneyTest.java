package extended;

import org.junit.Test;

import java.math.BigDecimal;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MoneyTest {
    @Test
    public void testCanMultiplyMoneyWithDouble() throws Exception {
        Money money = new Money(new BigDecimal(50000.56), Currency.dollar);
        assertThat(money.multiply(4.5), is(new Money(new BigDecimal(225002.52), Currency.dollar)));
    }

    @Test
    public void testCanMultiplyMoneyWithDoubleForEvenResults() throws Exception {
        Money money = new Money(new BigDecimal(50000), Currency.dollar);
        assertThat(money.multiply(4.5), is(new Money(new BigDecimal(225000.00), Currency.dollar)));
    }


}
