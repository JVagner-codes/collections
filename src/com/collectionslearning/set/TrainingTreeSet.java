package com.collectionslearning.set;

import java.util.TreeSet;

public class TrainingTreeSet {

    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>() {{
            add(3);
            add(88);
            add(20);
            add(44);
            add(3);
        }};
        System.out.println(numbers);

        for (Integer number: numbers) {
            System.out.println(number);
        }

        System.out.println("First element to leave: " + numbers.pollFirst());
        System.out.println(numbers);

        System.out.println("Add new number " + numbers.add(23));
        System.out.println(numbers);

        System.out.println("Set size: " + numbers.size());

        System.out.println("Set isEmpty? " + numbers.isEmpty());
    }
}
