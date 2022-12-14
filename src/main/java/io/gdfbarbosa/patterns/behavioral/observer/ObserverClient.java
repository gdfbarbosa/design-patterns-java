package io.gdfbarbosa.patterns.behavioral.observer;

import io.gdfbarbosa.patterns.behavioral.observer.editor.Editor;
import io.gdfbarbosa.patterns.behavioral.observer.listeners.EmailNotificationListener;
import io.gdfbarbosa.patterns.behavioral.observer.listeners.LogOpenListener;

public class ObserverClient {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.events.subscribe("open", new LogOpenListener("/path/to/log/file.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}