package Stream_filter;

import stream_operations.Employee;

/**
 * Created by hadeslee on 2017-12-02.
 */
public class Example2 {
    public static void main(String[] args) {
        Employee.persons()
                .stream()
                .filter(Employee::isMale)
                .filter(p -> p.getIncome() > 5000.0)
                .map(Employee::getName)
                .forEach(System.out::println);
    }
}
