package at.leo.shop;

import at.leo.shop.Product.Products;

public class Bike implements Products {
    private String style;
    private String name;

    public Bike(String style, String name) {
        this.style = style;
        this.name = name;
    }

    public String getStyle() {
        return style;
    }

    @Override
    public String getName() {
        return name;
    }

}
