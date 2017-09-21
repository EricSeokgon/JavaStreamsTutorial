package Optional;

import java.util.OptionalInt;

/**
 * Created by hadeslee on 2017-09-22.
 */
public class OptionalTest4 {
    public static void main(String[] args) {
        OptionalInt number = OptionalInt.of(2);

        if (number.isPresent()) {
            int value = number.getAsInt();
            System.out.println("number is " + value);
        } else {
            System.out.println("number is absent.");
        }
    }
}
