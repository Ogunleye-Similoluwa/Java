package chap8;

public class Time {
    private int hour;
    private int minute;
    private int second;


    public Time(int hour, int minute, int second) {
        validateTime();
        validateMinute();
        validateSecond();
        validateTime();
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public Time(){}

    public Time(int hour){
        this(0,0,0);
    }
    public void validateTime(){
        if (hour < 0 || hour > 23) {
            throw new IllegalArgumentException("Hour must be between 0 and 23");
        }
        if (minute < 0 || minute > 59) {
            throw new IllegalArgumentException("Hour must be between 0 and 23");
        }
        if (second < 0 || second > 59) {
            throw new IllegalArgumentException("Hour must be between 0 and 23");
        }
    }
    public void  validateHour() {

        if (hour < 0 || hour > 23) {
            throw new IllegalArgumentException("Hour must be between 0 and 23");
        }
    }
    public void  validateMinute() {
        if (minute < 0 || minute > 59) {
            throw new IllegalArgumentException("Hour must be between 0 and 23");
        }
    }
    public void  validateSecond() {
        if (second < 0 || second > 59) {
            throw new IllegalArgumentException("Hour must be between 0 and 23");
        }
    }


    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        validateSecond();
        this.second = second;
    }
    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        validateMinute();
        this.minute = minute;
    }

    public void setHour(int hour) {
        validateHour();
        this.hour = hour;
    }
}
