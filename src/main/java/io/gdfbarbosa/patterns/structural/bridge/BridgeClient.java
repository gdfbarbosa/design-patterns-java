package io.gdfbarbosa.patterns.structural.bridge;

public class BridgeClient {
    public static void main(String[] args) {
        String type = args[0];
        PaymentAbstraction payment = new PaymentAbstraction(type);
        double value = Math.random() * 500;
        if (payment.authorize(value)) {
            boolean successfulPayment = payment.pay();
            if (successfulPayment) {
                System.out.println("payed successfully using " + payment.getPaymentMethod());
            } else {
                System.err.println("could not pay using " + payment.getPaymentMethod());
            }
        } else {
            System.err.println("could not authorize pay using " + payment.getPaymentMethod());
        }
    }
}
