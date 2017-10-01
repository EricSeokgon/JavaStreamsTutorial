package stream_create;

import java.util.stream.Stream;

/**
 * Created by hadeslee on 2017-10-02.
 */
public class Example3 {
    public static void main(String[] args) {
        Stream<String> stream  = Stream.<String>builder()
                .add("XML")
                .add("Java")
                .add("CSS")
                .add("SQL")
                .build();
        stream.forEach(System.out::println);
    }
}
