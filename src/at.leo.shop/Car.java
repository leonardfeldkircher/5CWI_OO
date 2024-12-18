package at.leo.shop;

import at.leo.shop.Product.Product;
import at.leo.shop.Product.Products;

public class Car implements Products {
    private String color;
    private String name;

    public Car(String color, String name) {
        this.color = color;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
