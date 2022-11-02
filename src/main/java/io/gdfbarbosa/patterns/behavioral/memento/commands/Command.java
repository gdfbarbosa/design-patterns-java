package io.gdfbarbosa.patterns.behavioral.memento.commands;

public interface Command {
    String getName();
    void execute();
}