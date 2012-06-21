package extended;

public class PaymentTeam {

    public String printPayslipForAEmployee(Employee employee, Salary salary){
        return String.format("Employee Details: First name: %s; Sure name: %s; Payment Type: Base; Salary in Dollar: %.1f", employee.getFirstName(),
                employee.getSureName(), salary.calculateSalary());
    }
}
