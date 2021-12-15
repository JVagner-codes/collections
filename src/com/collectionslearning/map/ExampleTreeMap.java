package com.collectionslearning.map;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ExampleTreeMap {

    public static void main(String[] args) {

        TreeMap<String, String> treeCapitals = new TreeMap<>();

        // adicionando na árvore as chaves com os seus valores
        treeCapitals.put("RS", "Porto Alegre");
        treeCapitals.put("SC", "Florianópolis");
        treeCapitals.put("PR", "Curitiba");
        treeCapitals.put("SP", "São Paulo");
        treeCapitals.put("RJ", "Rio de Janeiro");
        treeCapitals.put("MG", "Belo Horizonte");

        System.out.println(treeCapitals);

        // retorna a primeira capital no topo da árvore
        System.out.println(treeCapitals.firstKey());

        // retorna a ultima capital no final da árvore
        System.out.println(treeCapitals.lastKey());

        // retorna a primeira capital abaixo da capital passada
        System.out.println(treeCapitals.lowerKey("SC"));

        // retorna a primeira capital abaixo da capital passada
        System.out.println(treeCapitals.higherKey("SC"));

        System.out.println(treeCapitals);

        // retorna a primeira capital no topo da árvore, mostrando o seu value
        System.out.println(treeCapitals.firstEntry().getKey() + " -- " + treeCapitals.firstEntry().getValue());

        // retorna a ultima capital no final da árvore, mostrando o seu value
        System.out.println(treeCapitals.lastEntry().getKey() + " -- " + treeCapitals.lastEntry().getValue());

        // retorna a primeira capital abaixo da capital passada, mostrando o seu value
        System.out.println(treeCapitals.lowerEntry("SC").getKey() + " -- " + treeCapitals.lowerEntry("SC").getValue());

        // retorna a primeira capital acima da capital passada, mostrando o seu value
        System.out.println(treeCapitals.higherEntry("SC").getKey() + " -- " + treeCapitals.higherEntry("SC").getValue());

        System.out.println(treeCapitals);

        Map.Entry<String, String> firstEntry = treeCapitals.pollFirstEntry();
        Map.Entry<String, String> lastEntry = treeCapitals.pollLastEntry();

        // retorna a primeira capital da árvore, removendo a mesma da árvore
        System.out.println(firstEntry.getKey() + " -- " + firstEntry.getValue());

        // retorna a ultima capital da árvore, removendo a mesma da árvore
        System.out.println(lastEntry.getKey() + " -- " + lastEntry.getValue());

        System.out.println(treeCapitals);

        // navegar em todas as chaves através de um iterator
        Iterator<String> iterator = treeCapitals.keySet().iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            System.out.println(key + " -- " + treeCapitals.get(key));
        }

        System.out.println("------------------");

        for (String capital: treeCapitals.keySet()) {
            System.out.println(capital + " -- " + treeCapitals.get(capital));
        }

        System.out.println("------------------");

        for (Map.Entry<String, String> capital : treeCapitals.entrySet()) {
            System.out.println(capital.getKey() + " -- " + capital.getValue());
        }
    }
}
