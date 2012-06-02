package opjj;

import java.util.ArrayList;
import java.util.List;

public class ListUtil {

    public static <T> List<T> reverse(List<T> list) {
        List<T> reversed = new ArrayList<T>(list.size());

        for (int i = list.size() - 1; i >= 0; i--) {
            reversed.add(list.get(i));
        }

        return reversed;
    }

}
