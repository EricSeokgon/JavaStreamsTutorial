package stream_create;

import java.util.stream.Stream;

/**
 * Created by hadeslee on 2017-10-02.
 */
public class Example3 {
    public static void main(String[] args) {
        String[] names = {"XML", "Java", "SQL", "CSS"};
        Stream<String> stream = Stream.of(names);
        stream.forEach(System.out::println);
    }
}
