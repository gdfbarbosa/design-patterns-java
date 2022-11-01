package io.gdfbarbosa.patterns.structural.adapter;

public class AdapterClient {
    public static void main(String[] args) {
        // client code only understand temperature in Celsus
        TemperatureCelsius weatherService = new CelsiusTemperatureAdapter(new WeatherService());
        double temperatureCelsius = weatherService.getTemperature();
        System.out.println("Celsius = " + temperatureCelsius);
    }
}
