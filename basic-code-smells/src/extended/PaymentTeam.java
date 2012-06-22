package extended;

public class PaymentTeam {

    public PaymentTeam(CurrencyConverter converter) {
    }

    public String printPayslipForAEmployee(Employee employee, Salary salary){
        return String.format("Employee Details: %s; %s", employee.provideEmployeeName(),
                 salary.generateSalaryDetails());
    }

    public String printPayslipForAEmployeeInGivenCurrency(Employee employee, Salary salaryInBaseCurrency, Currency currencyInPayment) {

        return "";
    }
}
