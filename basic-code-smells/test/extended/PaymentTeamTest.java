package extended;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class PaymentTeamTest {
    @Test
    public void testPaymentTeamCanCalculateSalaryForAnEmployee(){
        //Given
        Employee employee = new Employee("Felicity", "Brooks", 5, "", "Lemon Road", "Cantebury", "W5 C56");
        Salary salary = new Salary(30000, 0.5);

        //WHEN
        String payslip = new PaymentTeam().printPayslipForAEmployee(employee, salary);

        //THEN
        assertThat(payslip, is("Employee Details: First name: Felicity; Sure name: Brooks; Payment Type: Base; Salary in Dollar: 45000.0"));
    }

}
