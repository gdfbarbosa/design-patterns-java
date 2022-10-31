package io.gdfbarbosa.patterns.structural.adapter;

/**
 * Adapter to convert service value from Fahrenheit to Celsius.
 * One option is to implement the Client Interface and handle transformations here.
 */
public class CelsiusTemperatureAdapter implements TemperatureCelsius {
    private final WeatherService weatherService;

    public CelsiusTemperatureAdapter(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    public double getTemperature() {
        double temperatureFahrenheit = this.weatherService.generateRandomTemperatureFahrenheit();
        System.out.println("Fahrenheit = " + temperatureFahrenheit);
        return (temperatureFahrenheit - 32)/1.8;
    }
}
