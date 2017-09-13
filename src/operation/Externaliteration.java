package operation;

import java.util.Arrays;
import java.util.List;

/**
 * Created by hadeslee on 2017-09-13.
 */
public class Externaliteration {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = 0;
        for (int n : numbers) {
            if (n % 2 == 1) {
                int square = n * n;
                sum = sum + square;
            }
        }
        System.out.println(sum);
    }
}
