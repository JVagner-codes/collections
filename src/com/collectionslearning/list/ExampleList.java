package com.collectionslearning.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExampleList {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("Carlos");
        names.add("Pedro");
        names.add("Juh");
        names.add("Andrew");
        names.add("Marie");
        names.add("Jacob");

        names.set(2, "Luana"); // atualiza o dado na posição passada

        System.out.println(names);

        Collections.sort(names); // irá colocar a lista em ordem alfabética

        System.out.println(names);

        names.remove(4); // remove um item da lista através do índice

        System.out.println(names);

        names.remove("Jacob"); // remove um objeto da lista

        System.out.println(names);

        System.out.println(names.get(3)); // .get() retorna o valor no índice indicado

        System.out.println("List size: " + names.size()); // .size() retorna o tamanho da lista

        System.out.println(names.contains("Andrew")); // .contains() retorna se existe ou não tal objeto

        System.out.println("Index Luana: " + names.indexOf("Luana")); // .indexOf() retorna o índice que se encontra um objeto

        for (String name: names) {
            System.out.println(name);
        }

        Iterator<String> iterator = names.iterator(); // utilizando iterator para percorrer uma lista com While
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        names.clear(); // .clear() apaga todos os elementos da lista

        System.out.println(names.isEmpty()); // .isEmpty() retorna se a lista está vazia ou não

    }
}
