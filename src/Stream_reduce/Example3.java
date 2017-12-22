package Stream_reduce;

import stream_operations.Employee;

public class Example3 {
    public static void main(String[] args) {
        double sum = Employee.persons()
                .stream()
                .reduce(0.0, (partialSum, person) -> partialSum + person.getIncome(), Double::sum);
        System.out.println(sum);
    }
}
