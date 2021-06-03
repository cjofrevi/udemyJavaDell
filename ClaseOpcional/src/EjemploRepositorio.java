import Model.Computadora;
import Repositorio.*;

import java.util.Optional;

public class EjemploRepositorio {
    public static void main(String[] args) {

        Repositorio<Computadora> repositorio = new ComputadorRepositorio();

        Optional<Computadora> pc = repositorio.filtrar("lenovo");

//        if(pc.isPresent()){
//            System.out.println(pc.get());
//        }else{
//            System.out.println("no se encontro");
//        }
        repositorio.filtrar("lenovo").ifPresent(System.out::println);


    }
}
