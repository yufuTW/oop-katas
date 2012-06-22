package extended;

import org.junit.Test;

import java.math.BigDecimal;
import java.util.Hashtable;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class PaymentTeamTest {
    @Test
    public void testPaymentTeamCanCalculateSalaryForAnEmployee(){
        //Given
        Employee employee = new Employee("Felicity", "Brooks", 5, "", "Lemon Road", "Cantebury", "W5 C56");
        Salary salary = new Salary(new Money(new BigDecimal(30000), Currency.Dollar), 0.5);

        PaymentTeam paymentTeam = new PaymentTeam(new CurrencyConverter(new Hashtable<String, Double>()));

        //WHEN
        String payslip = paymentTeam.printPayslipForAEmployee(employee, salary);

        //THEN
        assertThat(payslip, is("Employee Details: First Name: Felicity; Sure Name: Brooks; Payment Type: Base and Commission; Amount: 45000.00; Currency: Dollar"));
    }

    @Test
    public void testMakingPaymentInDifferentCurrency() throws Exception {
        //Given
        Currency paymentCurrency = Currency.BritishPound;
        Salary salary = new Salary(new Money(new BigDecimal(30000), Currency.Dollar), 0.5);
        Employee employee = new Employee("Felicity", "Brooks", 3, "Full House", "Lemon Road", "Roman","WC1");

        String expectedPayslip = String.format("Employee Details: First Name: Felicity; Sure Name: Brooks; Payment Type: Base and Commission; Amount: 22500.00; Currency: BritishPound");
        Hashtable<String, Double> rateTable = new Hashtable<String, Double>();
        rateTable.put("BritishPound To Dollar", 0.5);

        //When
        String payslip = new PaymentTeam(new CurrencyConverter(rateTable)).printPayslipForAEmployeeInGivenCurrency(employee, salary, paymentCurrency);

        //Then
        assertThat(payslip, is(expectedPayslip));
    }
}
