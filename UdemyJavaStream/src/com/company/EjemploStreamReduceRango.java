package com.company;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EjemploStreamReduceRango {

    public static void main(String[] args) {
        IntStream number = IntStream.rangeClosed(5, 20).peek(System.out::println);

//        int resultados = number.reduce(0, Integer::sum);
//        int resultados = number.sum();
//        System.out.println("resultado = " +resultados);
        IntSummaryStatistics stats = number.summaryStatistics();
        System.out.println("max: " + stats.getMax());
        System.out.println("min: " + stats.getMin());
        System.out.println("sum: " + stats.getSum());
        System.out.println("promedio: "+ stats.getAverage());
        System.out.println("total: " + stats.getCount());

    }
}
