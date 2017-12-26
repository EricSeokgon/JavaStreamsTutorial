package stream_aggregation;

import stream_operations.Employee;

public class Example1 {
    public static void main(String[] args) {
        double totalIncome = Employee.persons()
                .stream()
                .mapToDouble(Employee::getIncome)
                .sum();
        System.out.println("Total Income:  "  + totalIncome);
    }
}
