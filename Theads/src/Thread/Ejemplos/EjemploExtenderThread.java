package Thread.Ejemplos;

import Thread.Ejemplos.Theads.NombreThread;

public class EjemploExtenderThread {

    public static void main(String[] args) {
        Thread hilo = new NombreThread("nino el felino");
        hilo.start();
        Thread hilo2 = new NombreThread("chibooo");
        hilo2.start();
        NombreThread hilo3 = new NombreThread("goorda");
        hilo3.start();

        System.out.println(hilo.getState());

    }
}
