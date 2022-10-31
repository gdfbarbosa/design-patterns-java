package io.gdfbarbosa.patterns.structural.bridge;

import io.gdfbarbosa.patterns.structural.bridge.source.CardPayment;
import io.gdfbarbosa.patterns.structural.bridge.source.PaymentSource;
import io.gdfbarbosa.patterns.structural.bridge.source.PaypalPayment;
import io.gdfbarbosa.patterns.structural.bridge.source.PixPayment;

public class PaymentAbstraction implements PaymentSource {
    private PaymentSource paymentSource;

    public PaymentAbstraction(String type) {
        if (type.equals("paypal")) {
            this.paymentSource = new PaypalPayment();
        } else if (type.equals("pix")) {
            this.paymentSource = new PixPayment();
        } else if (type.equals("card")) {
            this.paymentSource = new CardPayment();
        }
    }

    @Override
    public boolean authorize(double value) {
        return paymentSource.authorize(value);
    }

    @Override
    public boolean pay() {
        return paymentSource.pay();
    }

    @Override
    public String getPaymentMethod() {
        return paymentSource.getPaymentMethod();
    }
}
