package io.gdfbarbosa.patterns.structural.bridge.source;

public class CardPayment implements PaymentSource {
    @Override
    public boolean authorize(double value) {
        return false;
    }

    @Override
    public boolean pay() {
        return false;
    }

    @Override
    public String getPaymentMethod() {
        return "Credit Card";
    }
}
