package stream_create;

import java.util.stream.Stream;

/**
 * Created by hadeslee on 2017-10-07.
 */
public class Streamiterate3 {
    public static void main(String[] args) {
        Stream.iterate(2L, n -> n + 1)
                .filter(StreamIterate2::isOdd)
                .skip(100)
                .limit(5)
                .forEach(System.out::println);
    }

    public static boolean isOdd(long number) {
        if (number % 2 == 0) {
            return false;
        }
        return true;
    }
}
