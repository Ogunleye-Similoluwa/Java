package Chap3;

/* Making a Difference 155
the American Heart Association (AHA) (http://bit.ly/TargetHeartRates), the formula for calculating your
 maximum heart rate in beats per minute is 220 minus your age in years. Your target
heart rate is a range that’s 50–85% of your maximum heart rate. [Note: These formulas are estimates
provided by the AHA. Maximum and target heart rates may vary based on the health, fitness and
gender of the individual. Always consult a physician or qualified health-care professional before
beginning or modifying an exercise program.] Create a class called HeartRates. The class attributes
should include the person’s first name, last name and date of birth (consisting of separate attributes
for the month, day and year of birth). Your class should have a constructor that receives this data as
parameters. For each attribute provide set and get methods. The class also should include a method
that calculates and returns the person’s age (in years),
 a method that calculates and returns the person’s maximum heart rate and
 a method that calculates and returns the person’s target heart rate.
Write a Java app that prompts for the person’s information, instantiates an object of class Heart Rates and
prints the information from that object—including the person’s first name, last name and
date of birth—then calculates and prints the person’s age in (years), maximum heart rate and target heart-rate range.*/


import java.time.LocalDate;


public class    HeartRateCalculate {

    private String firstName;
     private String lastName;

    private int day;
    private int month;
    private int year;

    public HeartRateCalculate(String firstName, String lastName, int day,int month, int year){
        this.firstName=firstName;
        this.lastName = lastName;
        this.day = day;
        this.month = month;
        this.year = year;
    }

    int age;
    LocalDate date = LocalDate.now();
    int nu = date.getYear();


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public  void setDateOfBirth(int dateOfBirth) {



    }


    public void dayOfBirth( int day){

        if (day >= 0){
        }
        else if (day <= 31){
        }
        else {
            System.out.println("Invalid day");
        }

            this.day = day;
    }
    public int getDayOfBirth(){
        return day;
    }

    public void monthOfBirth(int month){

        if (month >= 1 && month<= 12){

        }
        else {
            System.out.println("invalid month");
        }
        this.month = month;

    }

    public int getMonthOfBirth(){

     return month;
    }

    public void yearOfBirth( int year){


        this.year = year;

    }
    public  int getYearOfBirth(){
        return year;
    }

    public int calculateAge(){
        age = date.getYear() - getYearOfBirth();

        return age;
    }

    public int CalculateMaximumHeartRate(){

        return 220 -( date.getYear() - getYearOfBirth());
    }

    public void calculateTargetRangeHeartRate(){

        int target = (int) (0.50 * CalculateMaximumHeartRate());
        int range = (int) (0.85 * CalculateMaximumHeartRate());

        System.out.printf("The target heart range is %d - %d bpm", target, range);

    }


}
