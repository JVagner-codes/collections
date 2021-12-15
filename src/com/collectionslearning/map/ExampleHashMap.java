package com.collectionslearning.map;

import java.util.HashMap;
import java.util.Map;

public class ExampleHashMap {

    public static void main(String[] args) {

        Map<String, Integer> fifaWorldChampions = new HashMap<>();

        // adicionar chave e elemento no Map
        fifaWorldChampions.put("Brasil", 5);
        fifaWorldChampions.put("Alemanha", 4);
        fifaWorldChampions.put("Itália", 4);
        fifaWorldChampions.put("Uruguai", 2);
        fifaWorldChampions.put("Argentina", 2);
        fifaWorldChampions.put("França", 2);
        fifaWorldChampions.put("Inglaterra", 1);
        fifaWorldChampions.put("Espanha", 1);

        System.out.println(fifaWorldChampions);

        // atualiza o valor de uma localidade, passando a chave e o novo valor
        fifaWorldChampions.put("Brasil", 6);
        System.out.println(fifaWorldChampions);

        // retorna o valor que está ligado a chave passada
        System.out.println(fifaWorldChampions.get("Argentina"));

        // retorna se existe ou não uma chave com o nome passado
        System.out.println(fifaWorldChampions.containsKey("França"));

        fifaWorldChampions.remove("França");
        System.out.println(fifaWorldChampions);

        // retorna se existe ou não uma chave igual a passado
        System.out.println(fifaWorldChampions.containsKey("França"));

        // retorna se existe ou não um valor igual a passado
        System.out.println(fifaWorldChampions.containsValue(6));

        // retorna o tamanho do Map
        System.out.println(fifaWorldChampions.size());

        // navega nos registros do Map
        for (Map.Entry<String, Integer> entry: fifaWorldChampions.entrySet()) {
            System.out.println(entry.getKey() + " -- " + entry.getValue());
        }

        // navega também nos registros do Map
        for (String key: fifaWorldChampions.keySet()) {
            System.out.println(key + " -- " + fifaWorldChampions.get(key));
        }

        System.out.println(fifaWorldChampions);

        // verifica se o Map contém a chave passada
        System.out.println(fifaWorldChampions.containsKey("Estados Unidos"));

        // verifica se o Map contém um value igual ao passado
        System.out.println(fifaWorldChampions.containsValue(5));

        System.out.println(fifaWorldChampions.size());

        fifaWorldChampions.clear();

        System.out.println(fifaWorldChampions.size());
    }
}
