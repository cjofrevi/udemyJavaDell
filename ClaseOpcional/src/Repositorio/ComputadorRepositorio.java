package Repositorio;

import Model.Computadora;
import Model.Fabricante;
import Model.Procesador;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ComputadorRepositorio implements Repositorio<Computadora> {

    private List<Computadora> dataSource;

    public ComputadorRepositorio(){
        dataSource = new ArrayList<>();
        Procesador proc = new Procesador("rapidin", new Fabricante("intel"));
        Computadora asus = new Computadora("lenovo", "gris");
        asus.setProcesador(proc);
        dataSource.add(asus);
        dataSource.add(new Computadora("samsum", "verde"));
    }

    @Override
    public Optional<Computadora> filtrar(String nombre) {

        return dataSource.stream().filter(c -> c.getNombre().toLowerCase().contains(nombre.toLowerCase()))
                .findFirst();
    }
}
