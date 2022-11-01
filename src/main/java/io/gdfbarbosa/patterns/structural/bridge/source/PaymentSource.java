package io.gdfbarbosa.patterns.structural.bridge.source;

public interface PaymentSource {
    boolean authorize(double value);
    boolean pay();
    String getPaymentMethod();
}
