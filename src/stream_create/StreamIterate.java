package stream_create;

import java.util.stream.Stream;

/**
 * Created by hadeslee on 2017-10-06.
 */
public class StreamIterate {
    public static void main(String[] args) {
        Stream<Long> tenNaturalNumbers = Stream.iterate(1L, n  ->  n  + 1)
                .limit(10);

        tenNaturalNumbers.forEach(System.out::println);
    }
}
