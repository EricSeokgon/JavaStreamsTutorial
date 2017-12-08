package Stream_map;

import stream_operations.Employee;

/**
 * Created by hadeslee on 2017-12-09.
 */
public class Example2 {
    public static void main(String[] args) {
        Employee.persons()
                .stream()
                .map(Employee::getName)
                .forEach(System.out::println);
    }
}
