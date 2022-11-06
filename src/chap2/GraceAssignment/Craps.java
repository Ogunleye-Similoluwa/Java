package chap2.GraceAssignment;

import java.security.SecureRandom;

public class Craps {
    public  Status status ;
    public int point;
    public int sum;


    public enum Status{WIN,CONTINUE, LOSE}
    SecureRandom randomNumbers= new SecureRandom();


    public void  win() {
        int die1 = 1 + randomNumbers.nextInt(6);
        int die2 = 1 + randomNumbers.nextInt(6);

        sum = die1 + die2;

        }

        public Status getStatus() {

            switch (sum) {
                case 7:
                case 11:
                    status = Status.WIN;
                    break;
                case 2:
                case 3:
                case 12:
                    status = Status.LOSE;
                    break;
                default: {
                    status = Status.CONTINUE;
                    point = sum;
                    break;
                }
            }
            return status;
        }

    public int getPoint() {
        return point;
    }
}


