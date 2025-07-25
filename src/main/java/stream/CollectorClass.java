package stream;

import java.util.LinkedList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class CollectorClass {

    public static List<Integer> collect(List<Integer> list) {
        Supplier<List<Integer>> supplier = () -> new LinkedList<>();
        BiConsumer<List<Integer>, Integer> biConsumer = (data, element) -> data.add(element);
        BinaryOperator<List<Integer>> operator = (left, right) -> {
            left.addAll(right);
            return left;
        };
        return list.stream().collect(Collector.of(supplier, biConsumer, operator));
    }
}
