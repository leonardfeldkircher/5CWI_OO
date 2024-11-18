package Camera;

import java.util.ArrayList;
import java.util.List;

public class SD {
    private List<Picture> pictures = new ArrayList<Picture>();


    public SD(int capacity)
    {

    }


    public List<Picture> GetAllFiles()
    {
        return pictures;
    }

}
