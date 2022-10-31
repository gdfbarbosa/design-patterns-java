package io.gdfbarbosa.patterns.creational.abstractfactory;

import io.gdfbarbosa.patterns.creational.abstractfactory.chocolate.Chocolate;
import io.gdfbarbosa.patterns.creational.abstractfactory.chocolate.DarkChocolate;
import io.gdfbarbosa.patterns.creational.abstractfactory.whisky.BourbonWhisky;
import io.gdfbarbosa.patterns.creational.abstractfactory.whisky.Whisky;
import io.gdfbarbosa.patterns.creational.abstractfactory.wine.RedWine;
import io.gdfbarbosa.patterns.creational.abstractfactory.wine.Wine;

public class DutyFreeFactory implements StoreFactory {
    @Override
    public Wine createWine() {
        return new RedWine();
    }

    @Override
    public Whisky createWhisky() {
        return new BourbonWhisky();
    }

    @Override
    public Chocolate createChocolate() {
        return new DarkChocolate();
    }
}
