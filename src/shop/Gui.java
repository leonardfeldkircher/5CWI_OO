package shop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Gui {
  private List<Product> products = new ArrayList<Product>();

    private Scanner scanner = new Scanner(System.in);

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public void run() {
        while (true) {
            System.out.println("1 Show Products");
            System.out.println("2 Show Stock value");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    showProducts();
                    break;
                case 2:
                    showStockValue();
                    break;
                default:
                    break;
            }

        }
    }

    private void showProducts() {
        System.out.println("show Products");
        for (Product product : products) {
            System.out.println("Name: " + product.getName());
        }

    }  

    void showStockValue() {
        double totalValue = 0;
        for (Product product : products) {
            totalValue += product.getPrice();
        }
        System.out.println("Total stock value: " + totalValue);
    }

}