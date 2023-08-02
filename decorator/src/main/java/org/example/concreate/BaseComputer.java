package org.example.concreate;

import org.example.component.Computer;

public class BaseComputer implements Computer {

    @Override
    public long getPrice() {
        return 2000000l;
    }
}
