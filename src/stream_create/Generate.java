package stream_create;

import java.util.stream.Stream;

/**
 * Created by hadeslee on 2017-10-09.
 */
public class Generate {
    public static void main(String[] args) {
        Stream.generate(Math::random)
                .limit(5)
                .forEach(System.out::println);
    }
}
