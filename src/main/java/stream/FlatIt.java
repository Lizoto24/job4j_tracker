package stream;

import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FlatIt {

    public static List<Integer> flatten(Iterator<Iterator<Integer>> it) {
        List<Integer> collectedList = iteratorToStream(it)
                .flatMap(innerIt -> iteratorToStream(innerIt))
                .collect(Collectors.toList());


        return collectedList;
    }

    private static <T> Stream<T> iteratorToStream(Iterator<T> it) {
        return StreamSupport.stream(
                Spliterators.spliteratorUnknownSize(it, Spliterator.ORDERED),
                false);
    }
}