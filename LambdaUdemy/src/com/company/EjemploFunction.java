package com.company;

import java.util.function.BiFunction;
import java.util.function.Function;

public class EjemploFunction {

    public static void main(String[] args) {
        Function<String, String> f1 = param ->  "nino el felino: "+param ;
        String resultado = f1.apply("gordo");
        System.out.println(resultado);

        Function<String, String> f2 = String::toUpperCase;
        System.out.println(f2.apply("el gordito"));

        BiFunction<String, String, String> f3 = (a, b) -> a.toUpperCase().concat(b.toUpperCase());
        String r2 = f3.apply("nino", "gordo");
        System.out.println(r2);

        BiFunction<String, String, Integer> f4 = String::compareTo;
        System.out.println(f4.apply("chibo", "chibo11"));

        BiFunction<String, String, String> f5 = String::concat;
        System.out.println(f5.apply("chibo", "chibo11"));

    }


}
