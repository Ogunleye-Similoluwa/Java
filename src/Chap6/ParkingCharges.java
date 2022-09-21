package Chap6;
/*(Parking Charges) A parking garage charges a $2.00 minimum fee to park for up to three
hours. The garage charges an additional $0.50 per hour for each hour or part thereof in excess of three
hours. The maximum charge for any given 24-hour period is $10.00. Assume that no car parks for
longer than 24 hours at a time. Write an application that calculates and displays the parking charges
for each customer who parked in the garage yesterday. You should enter the hours parked for each
customer. The program should display the charge for the current customer and should calculate and
display the running total of yesterday’s receipts.
 It should use the method calculateCharges to determine the charge for each customer.
 */

public class ParkingCharges {
    private double charges;
    private double duration ;
    private String name;
    private double sum;
    public ParkingCharges(double charges, double duration,String name){
        this.name =name;
        if (charges > 0.0){
            this.charges = charges;
        }
        if (duration < 0.0 || duration > 24){

            System.out.println("invalid duration");
        }
            this.duration = duration;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }



    public void setDuration(double duration) {
        if (duration < 0 || duration > 24){
            System.out.println("invalid duration");
        }

        this.duration = duration;
    }
    public double calculateCharges() {
        if (duration <= 3) {
            duration = 2.0;
        }
            else if (duration == 24) {
                duration = 10.0;
            }
          else if (duration > 3) {
            duration = duration * 0.5;
        }
        return duration;
    }


}
