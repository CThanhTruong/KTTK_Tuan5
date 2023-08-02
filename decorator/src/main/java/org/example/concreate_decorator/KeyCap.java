package org.example.concreate_decorator;

import org.example.component.Computer;
import org.example.decorator.ComputerDecorator;

public class KeyCap extends ComputerDecorator {

    public KeyCap(Computer computer) {
        super(computer);
        // TODO Auto-generated constructor stub
    }

    @Override
    public long getPrice() {
        // TODO Auto-generated method stub
        return super.getPrice() + getPriceKeybroad();
    }

    public long getPriceKeybroad() {
        return 2500000l;
    }
}
