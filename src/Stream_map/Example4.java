package Stream_map;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by hadeslee on 2017-12-16.
 */
public class Example4 {
    public static void main(String[] args) {
        Stream.of("XML", "Java",  "CSS")
                .flatMap(name ->  IntStream.range(0, name.length())
                        .mapToObj(name::charAt))
                .forEach(System.out::println);
    }
}
