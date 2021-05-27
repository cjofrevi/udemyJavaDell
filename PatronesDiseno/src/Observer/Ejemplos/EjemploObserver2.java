package Observer.Ejemplos;

import Observer.UsuarioRepositorio;

public class EjemploObserver2 {
    public static void main(String[] args) {
        UsuarioRepositorio repo = new UsuarioRepositorio();
        repo.addObserver((o, u) -> System.out.println("enviando un email al usuario "+ u));
        repo.addObserver((o, u) -> System.out.println("enviando un email al administrador"));
        repo.addObserver((o, u) -> System.out.println("Guardando info del usuario "+ u+ " en el logs"));
        repo.crearUsuario("Nino el felino");
    }


}
