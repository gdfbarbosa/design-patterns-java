package io.gdfbarbosa.patterns.creational.abstractfactory;

import io.gdfbarbosa.patterns.creational.abstractfactory.chocolate.Chocolate;
import io.gdfbarbosa.patterns.creational.abstractfactory.chocolate.MilkChocolate;
import io.gdfbarbosa.patterns.creational.abstractfactory.whisky.ScotchWhisky;
import io.gdfbarbosa.patterns.creational.abstractfactory.whisky.Whisky;
import io.gdfbarbosa.patterns.creational.abstractfactory.wine.WhiteWine;
import io.gdfbarbosa.patterns.creational.abstractfactory.wine.Wine;

public class MarketFactory implements StoreFactory {
    @Override
    public Wine createWine() {
        return new WhiteWine();
    }

    @Override
    public Whisky createWhisky() {
        return new ScotchWhisky();
    }

    @Override
    public Chocolate createChocolate() {
        return new MilkChocolate();
    }
}
