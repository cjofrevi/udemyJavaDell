package Thread.Ejemplos;

import Thread.Ejemplos.Runnable.ViajeTarea;

public class EjemploInterfaceRunnable2 {
    public static void main(String[] args) {

        Runnable viaje = () -> {
            for(int i = 0; i < 10; i++){
                System.out.println(i + " - " + Thread.currentThread().getName());
                try {
                    Thread.sleep((long)(Math.random()* 1000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("me voy a: " + Thread.currentThread().getName());
        };


        new Thread(viaje,"Isla de Pascua").start();
        new Thread(viaje,"china").start();
        new Thread(viaje,"waterloo").start();
        new Thread(viaje,"transilvania").start();

    }
}
