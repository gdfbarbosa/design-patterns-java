package io.gdfbarbosa.patterns.creational.abstractfactory;

public class AbstractFactoryClient {
    public static void main(String[] args) {
        Application app = configureApplication(args[0]);
        app.open();
    }

    private static Application configureApplication(String location) {
        if (location.equals("local")) {
            return new Application(new MarketFactory());
        } else {
            return new Application(new DutyFreeFactory());
        }
    }
}
