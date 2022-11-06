package Chap6;
/*(Temperature Conversions) Implement the following integer methods:
a) Method Kelvin returns the Kelvin equivalent of a Celsius temperature, using the calculation
Kelvin = Celsius + 273.15;
b) Method Celsius returns the Celsius equivalent of a Kelvin temperature, using the calculation
Celsius = Kelvin - 273.15;
c) Use the methods from parts (a) and (b) to write an application that enables the user to
enter a Kelvin temperature and display the Celsius equivalent, or, to enter a Celsius
temperature and display the Kelvin equivalent*/

public class Temperature {
    public static double kev(double celcius) {
        return celcius + 273.15;

    }
    public static double cel(double kelvin) {
        return kelvin - 273.15;
    }
}
