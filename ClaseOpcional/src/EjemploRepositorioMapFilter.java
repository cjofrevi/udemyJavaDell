import Model.Computadora;
import Model.Fabricante;
import Model.Procesador;
import Repositorio.ComputadorRepositorio;
import Repositorio.Repositorio;

import java.util.Optional;

public class EjemploRepositorioMapFilter {
    public static void main(String[] args) {

        Repositorio<Computadora> repositorio = new ComputadorRepositorio();

        String pc = repositorio.filtrar("samsum")
                .map(Computadora::getProcesador)
                .map(Procesador::getFabricante)
                .filter(fab -> "intel".equalsIgnoreCase(fab.getNombre()))
                .map(u -> u.getNombre())
                .orElse("desconocida");

        System.out.println(pc);
    }
}
