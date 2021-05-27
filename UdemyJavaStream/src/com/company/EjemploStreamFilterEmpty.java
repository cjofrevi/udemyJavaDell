package com.company;

import com.company.Modelo.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemploStreamFilterEmpty {

    public static void main(String[] args) {
         long count = Stream
                .of("Nino Felino", "Chibo Lito", "", "Gatoberto Muerto", "", "Gatoberto vivo")

                .filter(String::isEmpty)
                .peek(System.out::println)
                .count();
        System.out.println("count = "+count);

    }
}
