package extended;

public class PaymentTeam {

    public String printPayslipForAEmployee(Employee employee, Salary salary){
        return String.format("Employee Details: %s; %s", employee.provideEmployeeName(),
                 salary.generateSalaryDetails());
    }
}
