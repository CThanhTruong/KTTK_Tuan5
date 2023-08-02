package org.example.concreate_decorator;

import org.example.component.Computer;
import org.example.decorator.ComputerDecorator;

public class Screen extends ComputerDecorator {

    public Screen(Computer computer) {
        super(computer);
        // TODO Auto-generated constructor stub
    }

    @Override
    public long getPrice() {
        // TODO Auto-generated method stub
        return super.getPrice() + getPriceScreen();
    }

    public long getPriceScreen() {
        return 4000000l;
    }
}
