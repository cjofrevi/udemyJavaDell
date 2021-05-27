package com.company;

import com.company.Modelo.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemploStreamFilter2 {

    public static void main(String[] args) {
        Usuario usuario = Stream
                .of("Nino Felino", "Chibo Lito", "Gordo Lechon", "Gatoberto Muerto", "Esteban Dido", "Gatoberto vivo")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .peek(System.out::println)
                .filter(u -> u.getId().equals(2))
                .findFirst().get();

//        nombres.forEach(System.out::println);

        System.out.println(usuario);
    }
}
