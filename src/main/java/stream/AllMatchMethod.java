package stream;

import java.util.List;

public class AllMatchMethod {
    public static boolean check(List<String> list) {
       return list.stream().allMatch(string -> string.length() > 3);
    }
}