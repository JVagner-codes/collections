package com.collectionslearning.list;

import java.util.List;
import java.util.Vector;

public class ExampleVector {

    public static void main(String[] args) {

        List<String> sports = new Vector<>();

        sports.add("Football"); // .add() adiciona elemento a lista (Vector)
        sports.add("Basketball");
        sports.add("Table tennis");
        sports.add("Handball");

        System.out.println(sports);

        sports.set(2, "Ping pong"); // .set() atualiza o elemento do índice informado

        sports.remove(2); // .remove() remove o elemento através do índice informado

        sports.remove("Handball"); // .remove() remove através do objeto
        
        System.out.println(sports);

        System.out.println("Index element 0: " + sports.get(0)); // .get() retorna o elemento que está no índice informado

        for (String sport: sports) {
            System.out.println(sport);
        }
    }
}
