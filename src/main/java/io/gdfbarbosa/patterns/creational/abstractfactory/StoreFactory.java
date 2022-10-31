package io.gdfbarbosa.patterns.creational.abstractfactory;

import io.gdfbarbosa.patterns.creational.abstractfactory.chocolate.Chocolate;
import io.gdfbarbosa.patterns.creational.abstractfactory.whisky.Whisky;
import io.gdfbarbosa.patterns.creational.abstractfactory.wine.Wine;

public interface StoreFactory {
    Wine createWine();
    Whisky createWhisky();
    Chocolate createChocolate();
}
