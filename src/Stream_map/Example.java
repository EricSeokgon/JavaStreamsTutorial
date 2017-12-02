package Stream_map;

import java.util.stream.IntStream;

/**
 * Created by hadeslee on 2017-12-03.
 */
public class Example {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 5)
                .map(n -> n * n)
                .forEach(System.out::println);
    }
}
