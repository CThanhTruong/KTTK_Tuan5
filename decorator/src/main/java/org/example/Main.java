package org.example;

import org.example.component.Computer;
import org.example.concreate.BaseComputer;
import org.example.concreate_decorator.Card;
import org.example.concreate_decorator.Mouse;
import org.example.concreate_decorator.Screen;

public class Main {
    public static void main(String[] args) {

        Computer computer = new BaseComputer();
        System.out.println("Price base computer: " + computer.getPrice());

        Computer computerMouse = new Mouse(computer);
        System.out.println("Price computer + mouse: " + computerMouse.getPrice());

        Computer computerCardMouse = new Card(computerMouse);
        System.out.println("Price computer + card + mouse: " + computerCardMouse.getPrice());

        Computer computerCardMouseScreen = new Screen(computerCardMouse);
        System.out.println("Price computer + card + mouse + screen: " + computerCardMouseScreen.getPrice());

    }
}