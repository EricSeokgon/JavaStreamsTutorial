package Stream_Grouping;


import stream_operations.Employee;

import java.util.DoubleSummaryStatistics;
import java.util.Map;
import java.util.stream.Collectors;

public class Example5 {
    public static void main(String[] args) {
        Map<Employee.Gender, DoubleSummaryStatistics> incomeStatsByGender = Employee.persons()
                .stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.summarizingDouble(Employee::getIncome)));

        System.out.println(incomeStatsByGender);
    }
}
