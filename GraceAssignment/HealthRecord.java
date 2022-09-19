package Chap3;
/*(Computerization of Health Records) A health-care issue that has been in the news lately is
        the computerization of health records. This possibility is being approached cautiously because of
        sensitive privacy and security concerns, among others. [We address such concerns in later exercises.]
        Computerizing health records could make it easier for patients to share their health profiles and
         histories among their various health-care professionals. This could improve the quality of health care,
        help avoid drug conflicts and erroneous drug prescriptions, reduce costs and, in emergencies, could
        save lives. In this exercise, you’ll design a “starter” HealthProfile class for a person.
        The class attributes should include the person’s first name, last name, gender, date of birth (consisting of separate
        attributes for the month, day and year of birth), height (in inches) and weight (in pounds). Your class
should have a constructor that receives this data. For each attribute, provide set and get methods.
        The class also should include methods that calculate and return the user’s age in years, maximum
        heart rate and target-heart-rate range (see Exercise 3.16), and body mass index (BMI; see
        Exercise 2.33). Write a Java app that prompts for the person’s information, instantiates an object of
class HealthProfile for that person and prints the information from that object—including the person’s first name, last name, gender, date of birth, height and weight—then calculates and prints the
        person’s age in years, BMI, maximum heart rate and target-heart-rate range. It should also display
        the BMI values chart from Exercise 2.33
        BMI weightInPounds × 703
heightInInches heightInInches × = ------------------------------------------------------------------------------------
BMI weightInKi rams log
heightInMeters heightInMeters
 */

import java.time.LocalDate;
import java.util.Objects;

public class HealthRecord {




        private String firstName;
        private String lastName;

        private int day;
        private int month;
        private int year;
        private double height;
        private double weight;
        private String gender;


        public HealthRecord(String firstName, String lastName, int day, int month, int year, double heigth, double weight ){
            this.firstName=firstName;
            this.lastName = lastName;
            this.day = day;
            this.month = month;
            this.year = year;
            this.height = heigth;
            this.weight= weight ;
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

            if (month < 1 || month > 12){
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
            public void calculateBMI(){
            double BMI = getWeight() * 703 / (getHeight() * getHeight());

                System.out.printf("The Body Mass Index : %.2f",BMI);
       }

    public void setWeight(double weight) {

        this.weight = weight;
    }
    public double getWeight(){

            return weight;
    }

    public void setHeight(double height){

            this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }
}


