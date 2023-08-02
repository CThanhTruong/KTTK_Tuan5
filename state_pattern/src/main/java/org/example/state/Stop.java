package org.example.state;

public class Stop implements Televition{
    @Override
    public void handleRequest() {
        // TODO Auto-generated method stub
        System.out.println("Televition stopped");

    }
}
