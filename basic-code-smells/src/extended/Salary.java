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
}
