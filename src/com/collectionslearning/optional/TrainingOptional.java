package com.collectionslearning.optional;

import java.util.Optional;

public class TrainingOptional {

    public static void main(String[] args) {

        Optional<String> optionalstring = Optional.of("Value");
        Optional<String> optionalNull = Optional.ofNullable(null);
        Optional<String> emptyOptional = Optional.empty();

        optionalstring.ifPresent(System.out::println);

//        optionalNull.orElseThrow(IllegalStateException::new);

        emptyOptional.ifPresentOrElse(System.out::println, () -> System.out.println("Optional empty"));

        optionalstring.map((value) -> value.concat(" modified").toUpperCase()).ifPresent(System.out::println);

        if (optionalstring.isPresent()) {
            String s = optionalstring.get().concat(" concatenating");
            System.out.println(s);
        }
    }
}