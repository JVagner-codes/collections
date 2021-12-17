package com.collectionslearning.comparators.training;

import java.util.Collections;
import java.util.TreeSet;

public class TrainingComparatorsTreeSetAndTreeMap {

    public static void main(String[] args) {

        TreeSet<Person> myGuestList = new TreeSet<>() {{
            add(new Person("Maria", 22));
            add(new Person("Carlos", 25));
            add(new Person("Aline", 20));
            add(new Person("Arthur", 18));
            add(new Person("Ana", 32));
            add(new Person("Lucas", 30));
            add(new Person("John", 15));
        }};

        System.out.println(myGuestList + "\n");
    }
}
