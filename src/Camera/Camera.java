package Camera;

import java.util.Random;

public class Camera {
    private int pixels;

    private SD sd;
    private Random random = new Random();

    public Camera(int pixels, int weight, SD sd)
    {
        this.pixels = pixels;
        this.sd = sd;
    }

    public void takePicture()
    {
        Picture newPicture = new Picture(pixels, "" + random.nextInt() + ".jpg");
        System.out.println("Picture Taken: " + newPicture.getName());
    
    }

    public void printAllPictures()
    {
        for (Picture picture : sd.GetAllFiles()) {
            System.out.println(picture.getName());
        }
    }
}