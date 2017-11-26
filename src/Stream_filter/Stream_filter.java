package Stream_filter;

import stream_operations.Employee;

/**
 * Created by hadeslee on 2017-11-26.
 */
public class Stream_filter {
    public static void main(String[] args) {
        Employee.persons()
                .stream()
                .filter(Employee::isFemale)
                .map(Employee::getName)
                .forEach(System.out::println);
    }
}
