package io.gdfbarbosa.patterns.creational.abstractfactory.wine;

public interface Wine {
    void open();
    void serve(int quantity);
    int getVolume();
    String getLabel();
}
