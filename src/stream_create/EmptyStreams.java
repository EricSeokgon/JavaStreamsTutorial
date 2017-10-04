package stream_create;

import java.util.stream.Stream;

/**
 * Created by hadeslee on 2017-10-05.
 */
public class EmptyStreams {
    public static void main(String[] args) {
        Stream<String> stream  = Stream.empty();
        stream.forEach(System.out::println);
    }
}
