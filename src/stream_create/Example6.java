package stream_create;

import java.util.Random;
import java.util.stream.IntStream;

/**
 * Created by hadeslee on 2017-10-28.
 */
public class Example6 {
    public static void main(String[] args) {
        IntStream.generate(new Random()::nextInt)
                .limit(5)
                .forEach(System.out::println);
    }
}
