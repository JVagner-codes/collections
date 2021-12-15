package com.collectionslearning.set;

import java.util.Iterator;
import java.util.TreeSet;

public class ExampleTreeSet {

    public static void main(String[] args) {

        TreeSet<String> treeCapitals = new TreeSet<>();

        treeCapitals.add("Porto Alegre");
        treeCapitals.add("Florianopolis");
        treeCapitals.add("Curitiba");
        treeCapitals.add("São Paulo");
        treeCapitals.add("Rio de Janeiro");
        treeCapitals.add("Belo Horizonte");

        System.out.println(treeCapitals);

        // retorna a primeira capital no topo da árvore
        System.out.println(treeCapitals.first());

        // retorna a última capital da árvore
        System.out.println(treeCapitals.last());

        // retorna o primeiro elemento abaixo do elemento passado por parâmetro (lembrando que a estrutura é árvore)
        System.out.println(treeCapitals.lower("Florianopolis"));

        // retorna o primeiro elemento acima do elemento passado por parâmetro (lembrando que a estrutura é árvore)
        System.out.println(treeCapitals.higher("Florianopolis"));

        System.out.println(treeCapitals);

        // retorna a primeira capital no topo da árvore, removendo do Set
        System.out.println(treeCapitals.pollFirst());

        // retorna a primeira capital no final da árvore, removendo do Set
        System.out.println(treeCapitals.pollLast());

        System.out.println(treeCapitals);

        // navega em todos os elementos so Set
        Iterator<String> iterator = treeCapitals.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        for (String capital: treeCapitals) {
            System.out.println("---> " + capital + " <---");
        }
    }
}
