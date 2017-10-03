package stream_create;

import java.util.stream.IntStream;

/**
 * Created by hadeslee on 2017-10-04.
 */
public class IntStreamRange {
    public static void main(String[] args) {
        IntStream oneToFive = IntStream.range(1, 6);
        //IntStream oneToFive  = IntStream.rangeClosed(1, 5);
        oneToFive.forEach(System.out::println);
    }
}
