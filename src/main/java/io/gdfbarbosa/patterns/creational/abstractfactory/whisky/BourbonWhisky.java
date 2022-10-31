package io.gdfbarbosa.patterns.creational.abstractfactory.whisky;

public class BourbonWhisky implements Whisky {
    @Override
    public void open() {

    }

    @Override
    public void serve(int quantity) {

    }

    @Override
    public int getVolume() {
        return 1000;
    }

    @Override
    public String getLabel() {
        return "Jack Daniels";
    }
}
