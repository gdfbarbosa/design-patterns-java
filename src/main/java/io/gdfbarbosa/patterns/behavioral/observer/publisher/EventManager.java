package io.gdfbarbosa.patterns.behavioral.observer.publisher;

import io.gdfbarbosa.patterns.behavioral.observer.listeners.EventListener;

import java.io.File;
import java.util.*;

public class EventManager {
    Map<String, List<io.gdfbarbosa.patterns.behavioral.observer.listeners.EventListener>> listeners = new HashMap<>();

    public EventManager(String... operations) {
        for (String operation : operations) {
            this.listeners.put(operation, new ArrayList<>());
        }
    }

    public void subscribe(String eventType, io.gdfbarbosa.patterns.behavioral.observer.listeners.EventListener listener) {
        List<io.gdfbarbosa.patterns.behavioral.observer.listeners.EventListener> users = listeners.get(eventType);
        users.add(listener);
    }

    public void unsubscribe(String eventType, EventListener listener) {
        List<io.gdfbarbosa.patterns.behavioral.observer.listeners.EventListener> users = listeners.get(eventType);
        users.remove(listener);
    }

    public void notify(String eventType, File file) {
        List<io.gdfbarbosa.patterns.behavioral.observer.listeners.EventListener> users = listeners.get(eventType);
        for (io.gdfbarbosa.patterns.behavioral.observer.listeners.EventListener listener : users) {
            listener.update(eventType, file);
        }
    }
}