package org.example.context;

import org.example.state.Televition;

public class TelevitionContext {
    private static TelevitionContext instance;

    private Televition televition;

    private TelevitionContext() {

    }

    public static TelevitionContext getInstance() {
        if(instance == null)
            instance = new TelevitionContext();
        return instance;
    }

    public void setState(Televition televition) {

        this.televition = televition;
    }

    public void applyState() {
        if(televition != null)
            televition.handleRequest();
    }

}
