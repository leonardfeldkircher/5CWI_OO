package Camera;

import java.util.ArrayList;
import java.util.List;

public class SD {
    private int capacity;
    private List<Picture> pictures = new ArrayList<Picture>();


    public SD(int capacity)
    {
        this.capacity = capacity;

    }


    public List<Picture> GetAllFiles()
    {
        return pictures;
    }

}
