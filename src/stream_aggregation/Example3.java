package stream_aggregation;

import stream_operations.Employee;

import java.util.OptionalDouble;

public class Example3 {
    public static void main(String[] args) {
        OptionalDouble income =
                Employee.persons()
                        .stream()
                        .mapToDouble(Employee::getIncome).max();

        if (income.isPresent()) {
            System.out.println("Highest income:   " + income.getAsDouble());
        } else {
            System.out.println("Could not  get   the   highest income.");
        }
    }
}
