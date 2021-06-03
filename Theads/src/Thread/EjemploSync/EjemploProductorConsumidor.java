package Thread.EjemploSync;

import Thread.EjemploSync.Runnable.Consumidor;
import Thread.EjemploSync.Runnable.Panadero;

public class EjemploProductorConsumidor {

    public static void main(String[] args) {
        Panaderia p = new Panaderia();
        new Thread(new Panadero(p)).start();
        new Thread(new Consumidor(p)).start();
    }
}
