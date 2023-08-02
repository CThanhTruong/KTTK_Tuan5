package org.example.state;

public class Play  implements Televition{
    @Override
    public void handleRequest(){
        System.out.println("Televition play");
    }
}
