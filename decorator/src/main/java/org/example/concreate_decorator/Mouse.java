package org.example.concreate_decorator;

import org.example.component.Computer;
import org.example.decorator.ComputerDecorator;

public class Mouse extends ComputerDecorator {
    public Mouse(Computer computer) {
        super(computer);
        // TODO Auto-generated constructor stub
    }

    @Override
    public long getPrice() {
        // TODO Auto-generated method stub
        return super.getPrice() + getPriceMouse();
    }

    public long getPriceMouse() {

        return 1000000l;
    }

}
