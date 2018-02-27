package Stream_Match;

import Stream_Collections.Employee;

import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<Employee> persons = Employee.persons();

        // Check if all persons are males
        boolean allMales = persons.stream().allMatch(Employee::isMale);
        System.out.println("All  males: " + allMales);

        // Check if any person was born in 1971
        boolean anyoneBornIn1971 = persons.stream().anyMatch(p -> p.getDob().getYear() == 1971);
        System.out.println("Anyone born  in 1971:  " + anyoneBornIn1971);
    }
}

