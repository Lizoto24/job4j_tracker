package stream;

import java.util.List;

public class ReductionWithTwoArguments {
    public static Integer collect(List<Integer> list) {
        Integer multiplication = 5 * list.stream().reduce(1, (x,y) -> x*y);
        return multiplication;
    }

    public static void main(String[] args) {
        System.out.println(ReductionWithTwoArguments.collect(List.of(1, 2, 3)));
    }
}