package com.collectionslearning.set;

import java.util.LinkedHashSet;

public class TrainingLinkedHashSet {

    public static void main(String[] args) {

        LinkedHashSet<Integer> numbers = new LinkedHashSet<>() {{
            add(3);
            add(88);
            add(20);
            add(44);
        }};

        numbers.add(3);

        for (Integer number: numbers) {
            System.out.println(number);
        }

        numbers.remove(3);
        System.out.println(numbers);

        numbers.add(23);
        System.out.println(numbers);

        System.out.println("Set size: " + numbers.size());

        System.out.println("Set isEmpty? " + numbers.isEmpty());
    }
}
