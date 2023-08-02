package org.example;

import org.example.context.TelevitionContext;
import org.example.state.Play;
import org.example.state.Stop;

public class Main {
    public static void main(String[] args) {
        TelevitionContext context = TelevitionContext.getInstance();
        context.setState(new Play());
        System.out.println("State televition 1: ");
        context.applyState();


        context.setState(new Stop());
        System.out.println("State televition 1: ");
        context.applyState();


        TelevitionContext context2 = TelevitionContext.getInstance();
        System.out.println("State televition 2: ");
        context2.applyState();


        context.setState(new Play());
        System.out.println("State televition 1: ");
        context2.applyState();
    }
}