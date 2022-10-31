package io.gdfbarbosa.patterns.creational.factory.transport;

public class BoatTransport implements Transport {
    @Override
    public int getDaysToDelivery() {
        return 5;
    }
}
