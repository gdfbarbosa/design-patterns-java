package io.gdfbarbosa.patterns.creational.abstractfactory.whisky;

public interface Whisky {
    void open();
    void serve(int quantity);
    int getVolume();
    String getLabel();
}
