package io.gdfbarbosa.patterns.structural.bridge.source;

public class PaypalPayment implements PaymentSource {
    @Override
    public boolean authorize(double value) {
        return value < 100;
    }

    @Override
    public boolean pay() {
        return true;
    }

    @Override
    public String getPaymentMethod() {
        return "PayPal";
    }
}
