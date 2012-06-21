package extended;

import java.math.BigDecimal;

public class Salary {
    private final double baseRate;
    private final double commissionRate;

    public Salary(double baseRate, double commissionRate) {

        this.baseRate = baseRate;
        this.commissionRate = commissionRate;
    }

    public double calculateSalary() {
        return baseRate * (1+ commissionRate);
    }
}
