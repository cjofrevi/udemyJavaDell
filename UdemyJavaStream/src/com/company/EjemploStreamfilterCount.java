package com.company;

import com.company.Modelo.Usuario;

import java.util.stream.Stream;

public class EjemploStreamfilterCount {

    public static void main(String[] args) {
        long count = Stream
                .of("Nino Felino", "Chibo Lito", "Gordo Lechon", "Gatoberto Muerto", "Esteban Dido", "Gatoberto vivo")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .peek(System.out::println)
                .count();

//        nombres.forEach(System.out::println);

        System.out.println(count);

//        List<Usuario> lista = Arrays.asList(
//                new Usuario("Nino", "Felino") ,
//                new Usuario("Chibo",  "Lito") ,
//                new Usuario("Gordo",  "Lechon"),
//                new Usuario("Gatoberto",  "Muerto"),
//                new Usuario("Esteban",  "Dido"),
//                new Usuario("Gatoberto", "vivo"));
//
//

    }
}
