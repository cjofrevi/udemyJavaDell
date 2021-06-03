package Thread.EjemploSync;

import Thread.EjemploSync.Runnable.Consumidor;
import Thread.EjemploSync.Runnable.Panadero;

import java.util.concurrent.ThreadLocalRandom;

public class EjemploProductorConsumidorJava8 {

    public static void main(String[] args) {
        Panaderia p = new Panaderia();
        new Thread(() -> {
            for(int i = 0; i < 10; i++){
                p.hornear("pan n "+ i);
                try {
                    Thread.sleep(ThreadLocalRandom.current().nextInt(500));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        new Thread(() -> {
            for(int i = 0; i < 10; i++){
                p.consumir();
            }
        }).start();
    }
}
