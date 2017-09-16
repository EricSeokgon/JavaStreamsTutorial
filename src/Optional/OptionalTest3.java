package Optional;

import java.util.Optional;

/**
 * Created by hadeslee on 2017-09-17.
 */
public class OptionalTest3 {
    public static void main(String[] args) {
        Optional<String> stringOptional = Optional.of("hadeslee.tistory.com");

        stringOptional.ifPresent(value -> System.out.println("Optional contains " + value));
    }
}
