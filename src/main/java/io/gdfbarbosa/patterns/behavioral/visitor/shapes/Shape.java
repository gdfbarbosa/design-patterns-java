package io.gdfbarbosa.patterns.behavioral.visitor.shapes;

import io.gdfbarbosa.patterns.behavioral.visitor.Visitor;

public interface Shape {
    void move(int x, int y);
    void draw();
    String accept(Visitor visitor);
}