package stream;

import java.util.stream.Stream;

public class StreamOfMethod {
    public static Stream<Character> createStream() {
        Stream <Character> dataStream = Stream.of('a', 'b','c');
        return dataStream;
    }
}