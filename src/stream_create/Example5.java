package stream_create;

import java.util.Random;
import java.util.stream.Stream;

/**
 * Created by hadeslee on 2017-10-22.
 */
public class Example5 {
    public static void main(String[] args) {
        Stream.generate(new Random()::nextInt)
                .limit(5)
                .forEach(System.out::println);
    }
}
