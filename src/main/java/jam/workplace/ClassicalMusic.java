package jam.workplace;

import java.util.ArrayList;
import java.util.List;

public class ClassicalMusic implements Music{
    @Override
    public List<String> getSong() {
        List<String> list = new ArrayList<>();
        list.add("Zhalynam");
        list.add("Kuttum ai");
        list.add("Detstvo");
        return list;
    }
}
