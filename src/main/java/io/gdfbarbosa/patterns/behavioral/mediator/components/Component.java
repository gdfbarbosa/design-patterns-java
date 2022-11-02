package io.gdfbarbosa.patterns.behavioral.mediator.components;

import io.gdfbarbosa.patterns.behavioral.mediator.Mediator;

/**
 * Common component interface.
 */
public interface Component {
    void setMediator(Mediator mediator);
    String getName();
}