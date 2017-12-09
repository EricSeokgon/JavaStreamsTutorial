package Stream_map;

import java.util.stream.Stream;

/**
 * Created by hadeslee on 2017-12-10.
 */
public class Stream_flatMap {
    public static void main(String[] args) {
        Stream.of(1, 2, 3)
                .flatMap(n -> Stream.of(n, n+1))
                .forEach(System.out::println);
    }
}
