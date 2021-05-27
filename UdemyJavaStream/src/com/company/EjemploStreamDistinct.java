package com.company;

import java.util.stream.Stream;

public class EjemploStreamDistinct {

    public static void main(String[] args) {
         Stream<String> nombres =Stream
                .of("Nino Felino", "Chibo Lito", "Gordo Lechon", "Gatoberto Muerto", "Gatoberto Muerto", "Gatoberto Muerto")
                .distinct();


//        nombres.forEach(n -> System.out.println(n));

        String resultados = nombres.reduce("", ( a, b) -> a+" , "+ b);
        System.out.println("resultado = " +resultados);
//        System.out.println("count = "+count);

    }
}
