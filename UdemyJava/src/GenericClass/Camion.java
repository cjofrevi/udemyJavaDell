package GenericClass;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Camion<T> implements Iterable<T>{

    private List<T> objetos;
    private int maximo;

    public Camion(int maximo) {
        this.maximo = maximo;
        this.objetos = new ArrayList<>();
    }

    public void add(T object){
        if(this.objetos.size() <= maximo){
            this.objetos.add(object);
        }else{
            throw new RuntimeException("no hay mas epacio");
        }


    }

    @Override
    public Iterator<T> iterator() {
        return this.objetos.iterator();
    }
}
