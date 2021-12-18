package com.collectionslearning.optional;

import java.util.Optional;

public class ExampleOptional {

    public static void main(String[] args) {

        Optional<String> optionalString = Optional.of("Optional value");

        System.out.println(optionalString.isPresent());

        optionalString.ifPresent(System.out::println);

        optionalString.ifPresentOrElse(System.out::println, () -> System.out.println("Value is not present"));

        if (optionalString.isPresent()) {
            String value = optionalString.get();
            System.out.println(value);
        }

        optionalString.map((value) -> value.concat("****")).ifPresent(System.out::println);

        optionalString.orElseThrow(IllegalStateException::new);
    }
}
