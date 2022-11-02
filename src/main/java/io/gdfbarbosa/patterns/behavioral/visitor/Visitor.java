package io.gdfbarbosa.patterns.behavioral.visitor;

import io.gdfbarbosa.patterns.behavioral.visitor.shapes.Circle;
import io.gdfbarbosa.patterns.behavioral.visitor.shapes.CompoundShape;
import io.gdfbarbosa.patterns.behavioral.visitor.shapes.Dot;
import io.gdfbarbosa.patterns.behavioral.visitor.shapes.Rectangle;

public interface Visitor {
    String visitDot(Dot dot);

    String visitCircle(Circle circle);

    String visitRectangle(Rectangle rectangle);

    String visitCompoundGraphic(CompoundShape cg);
}