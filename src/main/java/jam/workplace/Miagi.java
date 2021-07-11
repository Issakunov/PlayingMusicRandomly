package jam.workplace;

import java.util.ArrayList;
import java.util.List;

public class Miagi implements Music {
    @Override
    public List<String> getSong() {
        List<String> list = new ArrayList<>();
        list.add("Patron");
        list.add("Tam Reveli Gory");
        list.add("Liubi Menya");
        return list;
    }
}
