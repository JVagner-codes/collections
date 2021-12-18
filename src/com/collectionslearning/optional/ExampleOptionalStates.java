package com.collectionslearning.optional;

import java.util.Optional;

public class ExampleOptionalStates {

    public static void main(String[] args) {

        Optional<String> optionalString = Optional.of("Present value");

        System.out.println("Optional value that is present");
        optionalString.ifPresentOrElse(System.out::println, () -> System.out.println("is not present"));

        Optional<String> optionalNull = Optional.ofNullable(null);

        System.out.println("Optional value that is not present");
        optionalNull.ifPresentOrElse(System.out::println, () -> System.out.println("null = is not present"));

        Optional<String> emptyOptional = Optional.empty();

        System.out.println("Optional value that is not present");
        emptyOptional.ifPresentOrElse(System.out::println, () -> System.out.println("empty = is not present"));

        Optional<String> optionalNullErro = Optional.of(null);

        System.out.println("optional value that throws NullPointerException error");
        optionalNullErro.ifPresentOrElse(System.out::println, () -> System.out.println("erro = is not present"));
    }
}