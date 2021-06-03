import Model.Computadora;
import Repositorio.ComputadorRepositorio;
import Repositorio.Repositorio;

import java.util.Optional;

public class EjemploRepositorioOrElseThrow {
    public static void main(String[] args) {

        Repositorio<Computadora> repositorio = new ComputadorRepositorio();

//        Computadora pc = repositorio.filtrar("guagua").orElseThrow(IllegalArgumentException::new);
//        System.out.println(pc);

        String archivo = "documento.pdf";
        String extension = Optional.ofNullable(archivo)
                .filter(a ->a.contains("."))
                .map(a -> a.substring(archivo.lastIndexOf(".") +1))
                .orElseThrow(IllegalArgumentException::new);

        System.out.println(extension);

    }

}
