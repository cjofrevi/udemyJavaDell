package com.company;

import com.company.Modelo.Usuario;

import java.util.Locale;
import java.util.stream.Stream;

public class EjemploStreamMap {

    public static void main(String[] args) {

//        Stream<Usuario> nombres = Stream
//                .of("nino", "chibo", "gordo", "gatoberto", "esteban")
////                .map(String::toUpperCase)
//                .peek(s -> System.out.println(s))
//                .map(nombre -> new Usuario(nombre, null))
//                .peek(u -> System.out.println(u.getNombre()))
////                .map(String::toLowerCase);
//                .map(usuario -> {
//                    String nombre = usuario.getNombre().toLowerCase();
//                    usuario.setNombre(nombre);
//                    return usuario;
//                });
//        nombres.forEach(System.out::println);

//        System.out.println("***");
//        List<String> lista = nombres.collect(Collectors.toList());
//        lista.forEach(System.out::println);

        Stream<Usuario> nombres = Stream
                .of("Nino Felino", "Chibo Lito", "Gordo Lechon", "Gatoberto Muerto", "Esteban Dido")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .peek(u -> System.out.println(u.getNombre()))
                .map(usuario ->{
                   String nombre = usuario.getNombre().toLowerCase();
                   usuario.setNombre(nombre);
                   return usuario;
                })
                .peek(u -> System.out.println(u.getApellido()));


        nombres.forEach(System.out::println);

    }
}
