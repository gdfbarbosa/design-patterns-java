package io.gdfbarbosa.patterns.creational.factory.logistics;

import io.gdfbarbosa.patterns.creational.factory.transport.BoatTransport;
import io.gdfbarbosa.patterns.creational.factory.transport.Transport;

public class SeaLogistics extends Logistics {
    @Override
    public Transport createTransport() {
        return new BoatTransport();
    }
}
