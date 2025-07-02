package stream;

import java.util.List;

public class MinMethod {
    public static String min(List<String> list) {
        String min = list.stream().min((x,y) -> x.compareTo(y)).get();
        return min;
    }
}
