package io.gdfbarbosa.patterns.creational.factory.transport;

public class TruckTransport implements Transport {
    @Override
    public int getDaysToDelivery() {
        return 10;
    }
}
