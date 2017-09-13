package stream_API;

import java.util.Arrays;
import java.util.List;

/**
 * Created by hadeslee on 2017-09-13.
 */
public class OrderedStreams {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 7, 4, 5, 2, 3, 4, 6, 7, 2, 3, 9, 8, 1);
        numbers.stream()
                .filter(n -> n % 2 == 1)
                .sorted()
                .forEach(System.out::println);
    }
}
