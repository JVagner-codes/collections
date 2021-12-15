package com.collectionslearning.set;

import java.util.HashSet;
import java.util.Set;

public class TrainingHashSet {

    public static void main(String[] args) {

        Set<Integer> numbers = new HashSet<>() {{
            add(3);
            add(88);
            add(20);
            add(44);
            add(3);
        }};

        for (Integer number: numbers) {
            System.out.println(number);
        }

        numbers.remove(3);
        System.out.println("Removing the first: " + numbers);

        numbers.add(23);

        System.out.println("HashSet size: " + numbers.size());

        System.out.println("HashSet isEmpty? " + numbers.isEmpty());
    }
}
