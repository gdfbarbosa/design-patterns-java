package io.gdfbarbosa.patterns.creational.factory.logistics;

import io.gdfbarbosa.patterns.creational.factory.transport.Transport;
import io.gdfbarbosa.patterns.creational.factory.transport.TruckTransport;

public class RoadLogistics extends Logistics {
    @Override
    public Transport createTransport() {
        return new TruckTransport();
    }
}
