package com.collectionslearning.map;

import java.util.HashMap;
import java.util.Map;

public class Training {

    public static void main(String[] args) {

        Map<String, String> brazilStates = new HashMap<>() {{
            put("AC", "Acre");
            put("AL", "Alagoas");
            put("AP", "Amapá");
            put("AM", "Amazonas");
            put("BA","Bahia");
            put("CE","Ceará");
            put("ES", "Espírito Santo");
            put("GO", "Goiás");
            put("MA", "Maranhão");
            put("MT", "Mato Grosso");
            put("MS", "Mato Grosso do Sul");
            put("MG", "Minas Gerais");
            put("PA", "Pará");
            put("PB", "Paraíba");
            put("PR", "Paraná");
            put("PE", "Pernambuco");
            put("PI", "Piauí");
            put("RJ", "Rio de Janeiro");
            put("RN", "Rio Grande do Norte");
            put("RS", "Rio Grande do Sul");
            put("RO", "Rondônia");
            put("RR", "Roraima");
            put("SC", "Santa Catarina");
            put("SP", "São Paulo");
            put("SE", "Sergipe");
            put("TO", "Tocantins");
        }};

        System.out.println(brazilStates);

        System.out.println("Removing the states from: " + brazilStates.remove("MG"));
        System.out.println(brazilStates);

        System.out.println("Map size: " + brazilStates.size());

        System.out.println("Removed the state Mato grosso do sul? " + brazilStates.remove("MS", "Mato Grosso do Sul"));

        for (String sigla: brazilStates.keySet()) {
            System.out.println(brazilStates.get(sigla) + "-" + sigla);
        }

        System.out.println("Is the state Santa Catarina on the Map? " + brazilStates.containsKey("SC"));

        System.out.println("Is the state Maranhão on the Map? " + brazilStates.containsValue("Maranhão"));
    }
}