package stream_create;

import java.util.stream.IntStream;

/**
 * Created by hadeslee on 2017-10-29.
 */
public class Example7 {
    public static void main(String[] args) {
        IntStream.generate(() -> 0)
                .limit(5)
                .forEach(System.out::println);
    }
}
