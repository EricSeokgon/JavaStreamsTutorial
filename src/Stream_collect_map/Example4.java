package Stream_collect_map;

import stream_operations.Employee;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Example4 {
    public static void main(String[] args) {
        Map<Employee.Gender, Employee> highestEarnerByGender = Employee.persons()
                .stream()
                .collect(Collectors.toMap(Employee::getGender, Function.identity(),
                        (oldPerson, newPerson) -> newPerson.getIncome() > oldPerson.getIncome() ? newPerson : oldPerson));
        System.out.println(highestEarnerByGender);
    }
}
