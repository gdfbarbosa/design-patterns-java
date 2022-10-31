package io.gdfbarbosa.patterns.creational.factory.logistics;

import io.gdfbarbosa.patterns.creational.factory.transport.Transport;

public abstract class Logistics {
    public int calculateDeliveryDays() {
        Transport t = createTransport();
        return t.getDaysToDelivery();
    }

    /**
     * This is a factory method from the Design Pattern "Factory", a.k.a Factory Method.
     * @return the transport to use.
     */
    public abstract Transport createTransport();
}
