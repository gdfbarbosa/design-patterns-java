package io.gdfbarbosa.patterns.behavioral.interpreter;

import java.util.List;

interface Expression {
    List<String> interpret(Context ctx);
}