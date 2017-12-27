package stream_aggregation;

import stream_operations.Employee;

import java.util.Comparator;
import java.util.Optional;

public class Example2 {
    public static void main(String[] args) {
        Optional<Employee> person = Employee.persons().stream()
                .max(Comparator.comparingDouble(Employee::getIncome));

        if (person.isPresent()) {
            System.out.println("Highest earner: " + person.get());
        } else {
            System.out.println("Could not  get   the   highest earner.");
        }
    }
}
