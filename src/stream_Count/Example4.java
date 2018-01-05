package stream_Count;

import stream_operations.Employee;

public class Example4 {
    public static void main(String[] args) {
        long personCount = Employee.persons()
                .stream()
                .reduce(0L, (partialCount, person) -> partialCount + 1L, Long::sum);
        System.out.println(personCount);
    }
}
