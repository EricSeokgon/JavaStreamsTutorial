package Stream_map;

import java.util.stream.Stream;

/**
 * Created by hadeslee on 2017-12-15.
 */
public class Example3 {
    public static void main(String[] args) {
        Stream.of("XML", "Java",  "CSS")
                .map(name  ->  name.chars())
                .flatMap(intStream ->  intStream.mapToObj(n ->  (char)n))
                .forEach(System.out::println);

    }
}
