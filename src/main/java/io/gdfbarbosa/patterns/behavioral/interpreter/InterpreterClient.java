package io.gdfbarbosa.patterns.behavioral.interpreter;

import java.util.List;

/**
 * Interpreter design pattern implementation in Java taken from
 * <a href="https://www.baeldung.com/java-interpreter-pattern">Interpreter Design Pattern in Java</a>
 * by Baeldung.
 */
public class InterpreterClient {
    public static void main(String[] args) {

        Expression query = new Select("name", new From("people"));
        Context ctx = new Context();
        List<String> result = query.interpret(ctx);
        System.out.println(result);

        Expression query2 = new Select("*", new From("people"));
        List<String> result2 = query2.interpret(ctx);
        System.out.println(result2);

        Expression query3 = new Select("name", new From("people", new Where(name -> name.toLowerCase().startsWith("d"))));
        List<String> result3 = query3.interpret(ctx);
        System.out.println(result3);
    }
}