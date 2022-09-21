package tdd;

import javax.swing.*;

public class AutomaticBike {
    private boolean power;
    private int speed = 0;
    private int acceleration;


    public void powerOn() {
        power = true;

    }

    public boolean powerStat() {
        return power;
    }

    public void powerOff() {
        power = false;
    }


        public short getSpeed() {
            if (speed > 0) {

            }
            return (short) speed;

        }

    public void accelerateGear1(int gear1) {
        if (gear1 > 0 ) {
            if (gear1 <= 20){
                speed = gear1;
            }
        }
        acceleration = speed + 1;

        }




    public int getAcceleration() {
        return acceleration;
    }

    public void accelerateGear2(int gear2) {
        if (gear2 > 21 ) {
            if (gear2 <= 29){
                speed = gear2;
            }
        }
        acceleration = speed + 2;

    }

    public void accelerateGear3(int gear3) {
        if (gear3 > 31 ) {
            if (gear3 <= 40){
                speed = gear3;
            }
        }
        acceleration = speed + 3;
    }
    public void accelerateGear4(int gear4) {
        if (gear4> 40 ) {
                speed = gear4;
            }
        acceleration = speed + 4;
        }

    }




