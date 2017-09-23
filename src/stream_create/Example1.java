package stream_create;

import java.util.stream.Stream;

/**
 * Created by hadeslee on 2017-09-24.
 */
public class Example1 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("hadeslee.tistory.com");
        stream.forEach(System.out::println);
    }
}
