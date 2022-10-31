package io.gdfbarbosa.patterns.structural.adapter;

/**
 * Weather service provides temperature in Fahrenheit.
 */
public class WeatherService implements TemperatureFahrenheit {
    public double generateRandomTemperatureFahrenheit() {
        return (Math.random() * 100.0);
    }
}
