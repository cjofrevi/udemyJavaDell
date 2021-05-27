package GenericClass;

public class EjemploGenericos {
    public static void main(String[] args) {

        Camion<Animal> transporteCaballos = new Camion<>(5);
        transporteCaballos.add(new Animal("bono", "caballo"));
        transporteCaballos.add(new Animal("tuto", "caballo"));
        transporteCaballos.add(new Animal("wewe", "caballo"));
        transporteCaballos.add(new Animal("bebe", "caballo"));
        transporteCaballos.add(new Animal("momo", "caballo"));

        imprimirCamion(transporteCaballos);

        Camion<Maquinaria> transMaquina = new Camion(5);
        transMaquina.add(new Maquinaria("yale"));
        transMaquina.add(new Maquinaria("grua horquilla"));
        transMaquina.add(new Maquinaria("forklift"));

        imprimirCamion(transMaquina);

        Camion<Automovil> transAuto = new Camion(3);
        transAuto.add(new Automovil("mazda"));
        transAuto.add(new Automovil("lifan"));
        transAuto.add(new Automovil("mazda"));

        imprimirCamion(transAuto);

    }

    public static <T> void imprimirCamion(Camion<T> camion){
        for(T a: camion){
            if(a instanceof Animal){
                System.out.println(((Animal)a).getNombre()+ " "+ ((Animal)a).getTipo());
            }
            else if( a instanceof Automovil){
                System.out.println(((Automovil)a).getMarca());
            }
            else if(a instanceof Maquinaria){
                System.out.println(((Maquinaria)a).getTipo());
            }

        }
    }
}
