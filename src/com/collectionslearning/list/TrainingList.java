package com.collectionslearning.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TrainingList {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Juliana");
        names.add("Pedro");
        names.add("Carlos");
        names.add("Larissa");
        names.add("João");

        for (String name: names) {
            System.out.println(name);
        }

        int carlosPosition = names.indexOf("Carlos");
        names.set(carlosPosition, "Roberto");

        System.out.println("Name in position 1: " + names.get(1));

        System.out.println(names);

        names.remove(4);
        names.remove("João");

        System.out.println(names);

        System.out.println("Quantity of items: " + names.size());

        System.out.println("Is Juliana on the list? " + names.contains("Juliana"));

        List<String> anotherList = new ArrayList<>() {{
            add("Ismael");
            add("Rodrigo");
        }};

        names.addAll(anotherList);

        System.out.println(names);

        Collections.sort(names);

        System.out.println(names);

        System.out.println("Is the list empty? " + names.isEmpty());
    }
}
