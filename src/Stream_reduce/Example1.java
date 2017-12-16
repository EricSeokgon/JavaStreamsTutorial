package Stream_reduce;

import java.util.Arrays;
import java.util.List;

/**
 * Created by hadeslee on 2017-12-17.
 */
public class Example1 {
    public static void main(String[] args) {
        List<Integer> numbers  = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers.stream()
                .reduce(0, Integer::sum);
        System.out.println(sum);
    }
}
