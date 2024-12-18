package shop;

public class Car implements Product{
    private String color;
    private String name;
    private int price;

    public Car(String color, String name, int price) {
        this.color = color;
        this.name = name;
        this.price = price;
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

    public int getPrice() {
        return price;
    }

}
