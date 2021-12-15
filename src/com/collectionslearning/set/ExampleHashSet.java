package com.collectionslearning.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExampleHashSet {

    public static void main(String[] args) {

        Set<Double> studentsGrades = new HashSet<>() {{
            add(5.8);
            add(9.3);
            add(6.5);
            add(10.0);
            add(5.4);
            add(7.3);
            add(3.8);
            add(4.0);
        }};

        System.out.println(studentsGrades);

        // remove a nota no Set
        studentsGrades.remove(3.8);
        System.out.println(studentsGrades);

        // retorna a quantidade de itens do Set
        System.out.println(studentsGrades.size());

        // navegar em todos os itens através do iterator
        Iterator<Double> iterator = studentsGrades.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        for (Double gradle: studentsGrades) {
            System.out.println("---> " + gradle + " <---");
        }

        studentsGrades.clear();

        // verifica se o Set está vazio
        System.out.println(studentsGrades.isEmpty());
    }
}
