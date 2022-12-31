package chap9.DietelWorks;

public class CommissionEmployee extends Object  {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(String firstName, String lastName,String socialSecurityNumber,
                                double grossSales,double commissionRate){
        validateGrossSales(grossSales);
        validateCommissionRate(commissionRate);
         this.commissionRate = commissionRate;
         this.firstName = firstName;
         this.lastName = lastName;
         this.socialSecurityNumber = socialSecurityNumber;
         this.grossSales = grossSales;
    }
 public void validateCommissionRate( double commissionRate){
        if (commissionRate <= 0.0 || commissionRate >=1.0){
            throw new IllegalArgumentException("Commission rate must be greater than  > 0.0 and less than 1.0");
        }
        this.commissionRate = commissionRate;
 }
    public void validateGrossSales( double grossSales){
        if (grossSales < 0.0){
            throw new IllegalArgumentException("Commission rate must be greater than  > 0.0");
        }
        this.grossSales = grossSales;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        validateGrossSales(grossSales);
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        validateCommissionRate(commissionRate );
        this.commissionRate = commissionRate;
    }
    public double earnings(){
        return this.commissionRate * this.grossSales;
    }

    @Override
    public String toString() {
        return "CommissionEmployee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", socialSecurityNumber='" + socialSecurityNumber + '\'' +
                ", grossSales=" + grossSales +
                ", commissionRate=" + commissionRate +
                '}';
    }
}
