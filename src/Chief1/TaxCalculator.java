package Chief1;

import java.math.BigDecimal;

public class TaxCalculator {
    private  static final double MINIMUM_EARNING = 30000;
    private static final double ADDITIONAL_TASK_RATE = 0.20;
    private static final double BASE_TASK_RATE = 0.15;
    public static double calculateTax(Citizen citizen) {
        double totalTax ;
        if (citizen.getEarnings()  > MINIMUM_EARNING) {
            double tax = (citizen.getEarnings() *BASE_TASK_RATE);
            double tax1 = tax * ADDITIONAL_TASK_RATE;
            totalTax = tax + tax1;
        }
      else {
            totalTax = (citizen.getEarnings() * BASE_TASK_RATE);
        }
        return totalTax;
    }
}
