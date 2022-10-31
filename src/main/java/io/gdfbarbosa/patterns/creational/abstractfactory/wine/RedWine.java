package io.gdfbarbosa.patterns.creational.abstractfactory.wine;

public class RedWine implements Wine {
    @Override
    public void open() {

    }

    @Override
    public void serve(int quantity) {

    }

    @Override
    public int getVolume() {
        return 750;
    }

    @Override
    public String getLabel() {
        return "Pomerol";
    }
}
