package com.collectionslearning.comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExampleComparatorsList {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student("Pedro", 19));
        students.add(new Student("Carlos", 23));
        students.add(new Student("Mariana", 21));
        students.add(new Student("João", 18));
        students.add(new Student("Thiago", 20));
        students.add(new Student("George", 22));
        students.add(new Student("Larissa", 21));

        System.out.println("--- Insertion order ---");
        System.out.println(students);

        students.sort((first, second) -> first.getAge() - second.getAge());
        System.out.println("--- Natural order of numbers - age ---");
        System.out.println(students);

        students.sort((first, second) -> second.getAge() - first.getAge());
        System.out.println("--- Reverse order of numbers - age ---");
        System.out.println(students);

        students.sort(Comparator.comparingInt(Student::getAge));
        System.out.println("--- Natural order of numbers - age (method reference) ---");
        System.out.println(students);

        students.sort(Comparator.comparingInt(Student::getAge).reversed());
        System.out.println("--- Reverse order of numbers - age (method reference) ---");
        System.out.println(students);

        // fazendo o método sort da classe Collections fazer a ordenação, mas é necessário o
        // Objeto implementar o Comparable
        Collections.sort(students);
        System.out.println("--- Natural order of numbers - age (interface Comparable) ---");
        System.out.println(students);

        // fazendo o método sort da classe Collections fazer a ordenação, neste caso
        // estamos passando outra regra de ordenação, que implementa a Interface Comparator
        Collections.sort(students, new StudentOrderReverseAgeComparator());
        System.out.println("--- Reverse order of numbers - age (interface Comparator) ---");
        System.out.println(students);
    }
}
