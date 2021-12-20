package com.collectionslearning.stream.training;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TrainingStreamAPI {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>() {{
            add(new Employee("João", 35));
            add(new Employee("Carla", 22));
            add(new Employee("Bruno", 27));
            add(new Employee("Claudio", 30));
            add(new Employee("Lucas", 17));
            add(new Employee("Thais", 16));
        }};

        System.out.println(employees.stream()
                .map(employee -> employee.toString())
                .collect(Collectors.joining(" ,")));

        System.out.println("Number of employees on the list: " + employees.stream().count());

        System.out.println("Employee >= 18: " + employees.stream()
                .filter(employee -> employee.getAge() >= 18)
                .collect(Collectors.toList()));

        System.out.println("All the employees");
        employees.forEach(System.out::println);

        System.out.println("Employee with the letter 'B'" + employees.stream()
                .filter(employee -> employee.getName().contains("B"))
                .collect(Collectors.toList()));


    }
}
