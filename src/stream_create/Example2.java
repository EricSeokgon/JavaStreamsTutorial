package stream_create;

import java.util.stream.Stream;

/**
 * Created by hadeslee on 2017-09-30.
 */
public class Example2 {
    public static void main(String[] args) {
        Stream<String> stream  = Stream.of("XML", "Java",  "CSS", "SQL");
        stream.forEach(System.out::println);
    }
}
