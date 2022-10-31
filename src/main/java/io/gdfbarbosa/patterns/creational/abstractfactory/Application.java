package io.gdfbarbosa.patterns.creational.abstractfactory;

import io.gdfbarbosa.patterns.creational.abstractfactory.chocolate.Chocolate;
import io.gdfbarbosa.patterns.creational.abstractfactory.whisky.Whisky;
import io.gdfbarbosa.patterns.creational.abstractfactory.wine.Wine;

public class Application {
    private StoreFactory storeFactory;
    private Chocolate chocolate;
    private Whisky whisky;
    private Wine wine;

    public Application(StoreFactory storeFactory) {
        this.storeFactory = storeFactory;
    }

    public void open() {
        this.chocolate = storeFactory.createChocolate();
        System.out.println("Chocolate flavour: " + this.chocolate.getFlavour());
        this.whisky = storeFactory.createWhisky();
        System.out.println("Whisky label: " + this.whisky.getLabel());
        this.wine = storeFactory.createWine();
        System.out.println("Wine label: " + this.wine.getLabel());
    }
}
