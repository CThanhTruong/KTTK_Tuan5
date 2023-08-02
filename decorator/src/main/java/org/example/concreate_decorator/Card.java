package org.example.concreate_decorator;

import org.example.component.Computer;
import org.example.decorator.ComputerDecorator;

public class Card  extends ComputerDecorator {

    public Card(Computer computer){
        super(computer);
    }
    @Override
    public long getPrice(){
        return super.getPrice() + getPriceCard();
    }

    public long getPriceCard(){
        return 20000l;
    }
}
