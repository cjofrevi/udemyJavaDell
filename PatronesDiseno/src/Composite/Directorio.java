package Composite;

import java.util.ArrayList;
import java.util.List;

public class Directorio extends Componente{

    private List<Componente> hijos;

    public Directorio(String nombre) {
        super(nombre);
        this.hijos = new ArrayList<>();
    }

    @Override
    public boolean buscar(String nombre) {
        if(this.nombre.equalsIgnoreCase(nombre)){
            return true;
        }
//        for(Componente hijo : this.hijos){
//            if(hijo.buscar(nombre)){
//                return true;
//            }
//        }
//        return false;
        return  hijos.stream().anyMatch(h -> h.buscar(nombre));
    }

    public Directorio addComponente(Componente c){
        hijos.add(c);
        return this;
    }

    public void removeComponente(Componente c){
        hijos.remove(c);
    }

    @Override
    public String mostrar() {
        StringBuilder sb = new StringBuilder();
        sb.append(nombre)
                .append("/")
                .append("\n");
        for(Componente hijo : this.hijos){
            sb.append(hijo.mostrar());
            if(hijo instanceof Archivo){
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}
