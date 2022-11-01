package io.gdfbarbosa.patterns.structural.bridge.source;

public class PixPayment implements PaymentSource {
    @Override
    public boolean authorize(double value) {
        return value < 1000;
    }

    @Override
    public boolean pay() {
        return true;
    }

    @Override
    public String getPaymentMethod() {
        return "Brazilian Pix";
    }
}
