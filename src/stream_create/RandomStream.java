package stream_create;

import java.util.Random;

/**
 * Created by hadeslee on 2017-10-21.
 */
public class RandomStream {
    public static void main(String[] args) {
        new Random().ints()
                .limit(5)
                .forEach(System.out::println);
    }
}
