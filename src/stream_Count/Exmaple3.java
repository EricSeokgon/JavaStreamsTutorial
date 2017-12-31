package stream_Count;

import stream_operations.Employee;

public class Exmaple3 {
    public static void main(String[] args) {
        long  personCount = Employee.persons()
                .stream()
                .map(p  ->  1L)
                .reduce(0L,  Long::sum);
        System.out.println(personCount);
    }
}
