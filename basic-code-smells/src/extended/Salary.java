package extended;

public class Salary {
    private final Money baseRate;
    private final double commissionRate;

    public Salary(Money baseRate, double commissionRate) {

        this.baseRate = baseRate;
        this.commissionRate = commissionRate;
    }

    public Money calculateSalary() {
        return baseRate.multiply(1 + commissionRate);
    }

    public String generateSalaryDetails() {
        return String.format("Payment Type: %s; %s", determinePaymentType(), calculateSalary().toString());
    }

    private String determinePaymentType() {
        if (commissionRate == 0)
            return "Base";
        return "Base and Commission";
    }
}
