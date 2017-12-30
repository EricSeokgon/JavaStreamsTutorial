package stream_Count;

import stream_operations.Employee;

public class Example2 {
    public static void main(String[] args) {
        long  personCount = Employee.persons()
                .stream()
                .mapToLong(p ->  1L)
                .sum();
        System.out.println(personCount);
    }
}
