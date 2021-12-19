package com.collectionslearning.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExampleStreamAPI {

    public static void main(String[] args) {

        List<String> students = new ArrayList<>();

        students.add("Pedro");
        students.add("Thayse");
        students.add("Marcelo");
        students.add("Carla");
        students.add("Juliana");
        students.add("Thiago");
        students.add("Rafael");

        // retorna a contagem de elementos
        System.out.println("Score: " + students.stream().count());

        // retorna o elemento com maior número de letras
        System.out.println("Highest number of letters: "
                + students.stream().max(Comparator.comparingInt(String::length)));

        // retorna o elemento com menor números de letras
        System.out.println("Lowest number of letters: "
                + students.stream().min(Comparator.comparingInt(String::length)));

        // retorna os elementos que tem a letra R no nome
        System.out.println("With the letter 'r' in the name: "
                + students.stream().filter((student) -> student.toLowerCase()
                .contains("r")).collect(Collectors.toList()));

        // retorna uma nova coleção, com os nomes concatenados a quantidade de letras de cada nome
        System.out.println("Returns a new collection with the number of letters: "
                + students.stream().map(student -> student.concat(" - ")
                .concat(String.valueOf(student.length()))).collect(Collectors.toList()));

        // retorna somente os 3 primeiros elementos da coleção
        System.out.println("Returns the first 3 elements: "
                + students.stream().limit(3).collect(Collectors.toList()));

        // exibe cada elemento no console, e depois retorna a mesma coleção
        System.out.println("Returns elements: "
                + students.stream().peek(System.out::println).collect(Collectors.toList()));

        // exibe cada elemento no console sem retorna outra coleção
        System.out.println("Return elements again:");
        students.stream().forEach(System.out::println);

        // retorna true se todos os elementos possuem letra "W" no nome
        System.out.println("Do all elements have W in the name? "
                + students.stream().allMatch((element) -> element.contains("W")));

        // retorna true se algum dos elementos possuem a letra "a" minúscula
        System.out.println("Is there any element with the lowercase letter 'a'? "
                + students.stream().anyMatch((element) -> element.contains("a")));

        // retorna true se todos os elementos NÃO contenha "a" minúscula
        System.out.println("Don't have any element with a lowercase 'a'? "
                + students.stream().noneMatch((element) -> element.contains("a")));

        // retorna o primeiro elemento da coleção, se existir exibe ele no console
        System.out.println("Returns the first element of the collection:");
        students.stream().findFirst().ifPresent(System.out::println);

        // exemplo de operação encadeada
        System.out.println("Threaded operation: ");
        System.out.println(students.stream()
                .peek(System.out::println)
                .map(student ->
                        student.concat(" - ").concat(String.valueOf(student.length())))
                .peek(System.out::println)
                .filter((student) -> student.toLowerCase().contains("r"))
                .collect(Collectors.toList()));
//                .collect(Collectors.joining(", ")));
//                .collect(Collectors.toSet()));
//                .collect(Collectors.groupingBy(student -> student.substring(student.indexOf("-") + 1)));

        
    }
}
