package jam.workplace;

import java.util.ArrayList;
import java.util.List;

public class RockMusic implements Music {

    public List<String> getSong() {
        List<String> list = new ArrayList<>();
        list.add("Oilorumda");
        list.add("Talastyk Kyz");
        list.add("Ne lei");
        return list;
    }
}
