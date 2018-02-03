package Stream_join;

import Stream_Collections.Employee;

import java.util.List;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args) {
        List<Employee> persons = Employee.persons();
        String names = persons.stream()
                .map(Employee::getName)
                .collect(Collectors.joining());

        String delimitedNames = persons.stream()
                .map(Employee::getName)
                .collect(Collectors.joining(", "));

        String prefixedNames = persons.stream()
                .map(Employee::getName)
                .collect(Collectors.joining(", ", "Hello ", ".  Goodbye."));

        System.out.println("Joined names:  " + names);
        System.out.println("Joined,  delimited names:  " + delimitedNames);
        System.out.println(prefixedNames);
    }
}
