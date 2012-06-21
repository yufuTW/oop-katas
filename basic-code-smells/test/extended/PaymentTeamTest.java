package extended;

import org.junit.Test;

import java.math.BigDecimal;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class PaymentTeamTest {
    @Test
    public void testPaymentTeamCanCalculateSalaryForAnEmployee(){
        //Given
        Employee employee = new Employee("Felicity", "Brooks", 5, "", "Lemon Road", "Cantebury", "W5 C56");
        Salary salary = new Salary(new Money(new BigDecimal(30000), Currency.Dollar), 0.5);

        //WHEN
        String payslip = new PaymentTeam().printPayslipForAEmployee(employee, salary);

        //THEN
        assertThat(payslip, is("Employee Details: First Name: Felicity; Sure Name: Brooks; Payment Type: Base and Commission; Amount: 45000.00; Currency: Dollar"));
    }

}
