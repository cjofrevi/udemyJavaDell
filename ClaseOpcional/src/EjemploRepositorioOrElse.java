import Model.Computadora;
import Repositorio.ComputadorRepositorio;
import Repositorio.Repositorio;

import java.util.Optional;

public class EjemploRepositorioOrElse {
    public static void main(String[] args) {

        Repositorio<Computadora> repositorio = new ComputadorRepositorio();

        Computadora defecto = new Computadora("acer", "basico");
        Computadora pc = repositorio.filtrar("lenovo").orElse(valorDefecto());
        System.out.println(pc);

        pc = repositorio.filtrar("lenovo").orElseGet(EjemploRepositorioOrElse::valorDefecto);

        System.out.println(pc);

    }

    public static Computadora valorDefecto() {
        System.out.println("obteniendo valor por defecto");
        return new Computadora("acer", "basico");
    }
}
