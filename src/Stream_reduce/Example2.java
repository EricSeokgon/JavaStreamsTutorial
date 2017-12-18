package Stream_reduce;

import stream_operations.Employee;

/**
 * Created by hadeslee on 2017-12-18.
 */
public class Example2 {
    public static void main(String[] args) {
        double sum = Employee.persons()
                .stream()
                .map(Employee::getIncome)
                .reduce(0.0, Double::sum);
        System.out.println(sum);
    }
}
