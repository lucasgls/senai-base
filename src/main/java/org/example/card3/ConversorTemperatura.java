package org.example.card3;

public class ConversorTemperatura {

    public static double FahrenheitToCelsius(double fahrenheit){
        double celsius = (fahrenheit - 32) * 5 / 9;

        return celsius;
    }

    public static double CelsiusToFahrenheit(double celsius){
        double fahrenheit = (celsius * 1.8) + 32;

        return fahrenheit;
    }

}
