package Chief1;

import java.math.BigDecimal;

public class Citizen {
        private  String firstName;
        private String surname;
        private double earnings;

        public  Citizen(){
        }
        public Citizen(String firstName, String lastName){
            this.firstName = firstName;
            surname = lastName;
        }
        public Citizen(String firstName, String lastName, double amount){
            this(firstName, lastName);
            earnings = amount;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getSurname() {
            return surname;
        }

        public void setSurname(String surname) {
            this.surname = surname;
        }

        public double getEarnings() {
            return earnings;
        }

        public void setEarnings(double earnings) {
            this.earnings = earnings;
        }

}
