package Stream_Find;

import stream_operations.Employee;

import java.util.List;
import java.util.Optional;

public class Example {
    public static void main(String[] args) {
        List<Employee> persons = Employee.persons();
        // Find any male
        Optional<Employee> anyMale = persons.stream().filter(Employee::isMale).findAny();
        if (anyMale.isPresent()) {
            System.out.println("Any male:   " + anyMale.get());
        } else {
            System.out.println("No male  found.");
        }
        // Find the first male
        Optional<Employee> firstMale = persons.stream().filter(Employee::isMale).findFirst();
        if (firstMale.isPresent()) {
            System.out.println("First male:   " + anyMale.get());
        } else {
            System.out.println("No male  found.");
        }
    }
}
