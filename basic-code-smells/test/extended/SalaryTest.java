package extended;

import org.junit.Test;

import java.math.BigDecimal;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class SalaryTest {
    @Test
    public void testCalculateSalary() throws Exception {
        //Given
        Money baseRate = new Money(new BigDecimal(1000), Currency.Dollar);
        double commissionRate = 0.2;
        Salary salary = new Salary(baseRate, commissionRate);

        //When & Then
        assertThat(salary.calculateSalaryInBaseCurrency(), is(new Money(new BigDecimal(1200.0),Currency.Dollar)));
    }

    @Test
    public void testCommissionRateCanBeZero() throws Exception {
        //Given
        Money baseRate = new Money(new BigDecimal(1000), Currency.Dollar);
        double commissionRate = 0;
        Salary salary = new Salary(baseRate, commissionRate);

        //When & Then
        assertThat(salary.calculateSalaryInBaseCurrency(), is(new Money(new BigDecimal(1000.0), Currency.Dollar)));
    }
}
