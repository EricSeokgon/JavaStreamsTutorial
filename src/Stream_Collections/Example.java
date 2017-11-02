package Stream_Collections;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

/**
 * Created by hadeslee on 2017-11-03.
 */
public class Example {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("XML");
        names.add("Java");

        Stream<String> sequentialStream = names.stream();
        sequentialStream.forEach(System.out::println);

        Stream<String> parallelStream = names.parallelStream();
        parallelStream.forEach(System.out::println);
    }
}
