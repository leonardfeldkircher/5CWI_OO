package Camera;

public class Main {
    public static void main(String[] args) {
        SD sdCard = new SD(20);
        Camera cam = new Camera(1000, 2, sdCard);

        cam.takePicture();
        cam.printAllPictures();
    }
}
