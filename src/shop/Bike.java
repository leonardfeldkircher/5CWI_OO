package shop;

public class Bike implements Product {
    private String style;
    private String name;
    private int price;

    public Bike(String style, String name, int price) {
        this.style = style;
        this.name = name;
        this.price = price;
    }

    public String getStyle() {
        return style;
    }

    @Override
    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

}
