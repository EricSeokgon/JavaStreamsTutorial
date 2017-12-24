package Stream_reduce;

import stream_operations.Employee;

import java.util.Optional;

public class Example5 {
    public static void main(String[] args) {
        Optional<Employee> person = Employee
                .persons()
                .stream()
                .reduce((p1, p2) -> p1.getIncome() > p2.getIncome() ? p1 : p2);
        if (person.isPresent()) {
            System.out.println("Highest earner: " + person.get());
        } else {
            System.out.println("Could not  get   the   highest earner.");
        }
    }
}
