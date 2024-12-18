package shop;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car("red", "BMW", 10000);
        Car c2 = new Car("blue", "Audi", 20000);
        Car c3 = new Car("white", "Porsche", 30000);
        Bike b1 = new Bike("green", "KTM", 40000);
        Cycle cy1 = new Cycle("blue", "Trek", 50000);

        Gui gui = new Gui();
        gui.addProduct(c1);
        gui.addProduct(c2);
        gui.addProduct(c3);
        gui.addProduct(b1);
        gui.addProduct(cy1);

        gui.run();
        gui.showStockValue();
    }
}