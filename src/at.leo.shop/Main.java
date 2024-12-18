package at.leo.shop;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        Gui gui = new Gui();
        gui.addProduct(new Car("red", "BMW"));
        gui.addProduct(new Bike("blue", "BMW"));
        gui.addProduct(new Cycle());

        gui.run();
    }
}
