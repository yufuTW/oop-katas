package extended;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class SalaryTest {
    @Test
    public void testCalculateSalary() throws Exception {
        //Given
        int baseRate = 1000;
        double commissionRate = 0.2;
        Salary salary = new Salary(baseRate, commissionRate);

        //When & Then
        assertThat(salary.calculateSalary(), is(1200.0));
    }

    @Test
    public void testCommissionRateCanBeZero() throws Exception {
        //Given
        int baseRate = 1000;
        double commissionRate = 0;
        Salary salary = new Salary(baseRate, commissionRate);

        //When & Then
        assertThat(salary.calculateSalary(), is(1000.0));
    }
}
