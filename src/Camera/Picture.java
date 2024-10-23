package Camera;

public class Picture {
    private int size;
    private String name;

    public Picture(int size, String name)
    {
        this.size = size;
        this.name = name;
    } 

    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }
}