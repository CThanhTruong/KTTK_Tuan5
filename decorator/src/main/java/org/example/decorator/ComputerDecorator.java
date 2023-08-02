package org.example.decorator;

import org.example.component.Computer;

public class ComputerDecorator implements Computer {
    private Computer computer;

    public ComputerDecorator(Computer computer){
        this.computer =computer;
    }

    @Override
    public long getPrice() {
        // TODO Auto-generated method stub
        return computer.getPrice();
    }

}
