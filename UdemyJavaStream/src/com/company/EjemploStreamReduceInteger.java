package com.company;

import java.util.stream.Stream;

public class EjemploStreamReduceInteger {

    public static void main(String[] args) {
         Stream<Integer> number =Stream
                .of(5, 10, 15, 20, 25, 30);

        int resultados = number.reduce(0, Integer::sum);
        System.out.println("resultado = " +resultados);

    }
}
