package Thread.EjemploExecutor;

import Thread.EjemploSync.Panaderia;
import Thread.EjemploSync.Runnable.Consumidor;
import Thread.EjemploSync.Runnable.Panadero;

import java.util.concurrent.*;

public class EjemploExecutorProductorConsumidor {

    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {

        ThreadPoolExecutor executor =(ThreadPoolExecutor) Executors.newFixedThreadPool(1);
        System.out.println("Tamano del pool: " + executor.getPoolSize());
        System.out.println("Cantidad de tareas en cola: " + executor.getQueue().size());

        Panaderia p = new Panaderia();
        Runnable productor = new Panadero(p);
        Runnable consumidor = new Consumidor(p);
        Future<?> futuro1 = executor.submit(productor);
        Future<?> futuro2 = executor.submit(consumidor);


        System.out.println("Tamano del pool: " + executor.getPoolSize());
        System.out.println("Cantidad de tareas en cola: " + executor.getQueue().size());

        executor.shutdown();
        System.out.println("continuando con la ejecucion del metodo main ");

    }
}
