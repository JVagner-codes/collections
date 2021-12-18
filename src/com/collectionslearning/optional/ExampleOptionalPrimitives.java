package com.collectionslearning.optional;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

public class ExampleOptionalPrimitives {

    public static void main(String[] args) {

        System.out.println("*** Opcional int value ***");
        OptionalInt.of(12).ifPresent(System.out::println);

        System.out.println("*** Opcional decimal value ***");
        OptionalDouble.of(55.2).ifPresent(System.out::println);

        System.out.println("*** Opcional long value ***");
        OptionalLong.of(23L).ifPresent(System.out::println);
    }
}
