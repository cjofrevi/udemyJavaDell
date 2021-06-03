package Repositorio;

import Model.Computadora;

import java.util.Optional;

public interface Repositorio<T> {

    Optional<Computadora> filtrar(String nombre);
}
