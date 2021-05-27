package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        Stream<String> nombres = Stream.of("nino", "chibo", "gordo");

        nombres.forEach(System.out::println);
        String[] arr = {"nino", "chibo", "gordo"};
        Stream<String> nombre2 = Arrays.stream(arr);
        nombre2.forEach(System.out::println);

        Stream<String> nombre3 = Stream.<String>builder()
                .add("nino")
                .add("chibo")
                .add("bebe")
                .add("nene").build();

        nombre3.forEach(System.out::println);

        List<String> lista = new ArrayList<>();
        lista.add("nino");
        lista.add("chibo");
        lista.add("bebe");
        lista.add("nene");

        Stream<String> nombre4 = lista.stream();
        nombre4.forEach(System.out::println);

        lista.stream().forEach(System.out::println);

    }
}
