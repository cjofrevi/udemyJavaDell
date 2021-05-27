package com.company;

import com.company.Modelo.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemploStreamDistinctUsuario {

    public static void main(String[] args) {
        Stream<Usuario> nombres = Stream
                .of("Nino Felino", "Chibo Lito", "Gordo Lechon", "Gatoberto Muerto", "Esteban Dido", "Gatoberto vivo",
                        "Nino Felino", "Nino Felino")
//                .distinct()
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .distinct();
//                .filter(u -> u.getNombre().equals("Gatoberto"));

        nombres.forEach(u -> System.out.println(u));

    }
}
