package io.gdfbarbosa.patterns.creational.factory;

import io.gdfbarbosa.patterns.creational.factory.logistics.Logistics;
import io.gdfbarbosa.patterns.creational.factory.logistics.RoadLogistics;
import io.gdfbarbosa.patterns.creational.factory.logistics.SeaLogistics;

public class FactoryClient {
    public static void main(String[] args) {
        String transportType = args[0];
        Logistics logistics = null;
        if (transportType.equals("road")) {
            logistics = new RoadLogistics();
        } else {
            logistics = new SeaLogistics();
        }
        System.out.println("Delivery days: " + logistics.calculateDeliveryDays());
    }
}
