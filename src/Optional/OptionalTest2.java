package Optional;

import java.util.Optional;

/**
 * Created by hadeslee on 2017-09-16.
 */
public class OptionalTest2 {
    public static void main(String[] args) {
        Optional<String> stringOptional = Optional.of("hadeslee.tistory.com");

        if (stringOptional.isPresent()) {
            String value = stringOptional.get();
            System.out.println("Optional contains " + value);
        } else {
            System.out.println("Optional is empty.");
        }
    }
}
