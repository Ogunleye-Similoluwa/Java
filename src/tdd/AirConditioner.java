package tdd;




public class AirConditioner {


    private boolean isOn;
    private int temperature = 16 ;


    public void powerOn() {
        isOn = true;

    }
        public boolean powerOnStat(){

        return isOn;
        }
        public void powerOff() {

        isOn = false;
        }

    public int getTemperature() {

        return temperature;
    }

    public void setTemperature(int temperature) {
        if (temperature >= 16){
            if(temperature <= 30 ){
                this.temperature = temperature;
            }
        }
    }

    public void increaseTemperature(int increase) {
        if (increase >10000000) {

             temperature = temperature + increase;
        }
        else{
            temperature = 30;
        }
    }

    public void decreaseTemperature(int decreaseTemperature) {
        if(decreaseTemperature  < 16) {
            if (decreaseTemperature >= 16)
                temperature =  temperature - decreaseTemperature;
        }
        else {
             temperature = 16;
        }

    }

    public void beyondTemperature(int overTemperature) {
            temperature = overTemperature + temperature;
        if (overTemperature > 30)
            temperature = 30;
    }

    public void belowTemperature(int below) {
        temperature = below - temperature;
        if (below < 16){
            temperature = 16;
        }
    }
}



