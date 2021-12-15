package com.collectionslearning.map;

import java.util.Hashtable;
import java.util.Map;

public class ExampleHashTable {

    public static void main(String[] args) {

        Hashtable<String, Integer> students = new Hashtable<>() {{
           put("Carlos", 21);
           put("Mariana", 33);
           put("Rafaela", 18);
           put("Pedro", 44);
        }};

        System.out.println(students);

        // utilizasse o mesmo método de inserção para modificar um dado dentro do Map
        students.put("Pedro", 55);

        System.out.println(students);

        // removendo o dado passando a sua chave
        students.remove("Pedro");
        System.out.println(students);

        // retorna o value através da sua chave
        int studentAge = students.get("Mariana");
        System.out.println(studentAge);

        // tamanho do Map
        System.out.println(students.size());

        // percorrer o Map através do Entry, que contem as chaves, e os valores do Map
        for (Map.Entry<String, Integer> entry: students.entrySet()) {
            System.out.println(entry.getKey() + " -- " + entry.getValue());
        }

        System.out.println("----------------------------");

        // percorrer o Map através do retorno de um Set das chaves
        for (String key: students.keySet()) {
            System.out.println(key + " -- " + students.get(key));
        }
    }
}
