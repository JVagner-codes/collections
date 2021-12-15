package com.collectionslearning.set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class ExampleLinkedHashSet {

    public static void main(String[] args) {

        Set<Integer> numericalSequence = new LinkedHashSet<>();

        numericalSequence.add(1);
        numericalSequence.add(2);
        numericalSequence.add(4);
        numericalSequence.add(8);
        numericalSequence.add(16);

        System.out.println(numericalSequence);

        // remove o número que está no Set
        numericalSequence.remove(4);
        System.out.println(numericalSequence);

        // retorna a quantidade de itens do Set
        System.out.println(numericalSequence.size());

        // navegar em todos os elementos do Set
        Iterator<Integer> iterator = numericalSequence.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        for (Integer number: numericalSequence) {
            System.out.println("---> " + number + " <---");
        }

        // verifica se o Set está vazio
        System.out.println(numericalSequence.isEmpty());
    }
}
