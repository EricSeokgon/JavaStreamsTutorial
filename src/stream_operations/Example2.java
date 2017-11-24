package stream_operations;

import java.util.List;

/**
 * Created by hadeslee on 2017-11-25.
 */
public class Example2 {
    public static void main(String[] args) {
        List<Employee> persons = Employee.persons();
        System.out.println("Before increasing the   income:   " + persons);

        persons.stream()
                .filter(Employee::isFemale)
                .forEach(p -> p.setIncome(p.getIncome() * 1.10));

        System.out.println("After increasing the   income:   " + persons);
    }
}
