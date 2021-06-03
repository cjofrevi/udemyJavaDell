package Thread.EjemploExecutor;

import java.util.concurrent.*;

public class EjemploExecutorFuture {

    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {

        ExecutorService executor = Executors.newSingleThreadExecutor();

        Callable<String> tarea = () -> {
            System.out.println("inicio de la tarea...");
            try {
                System.out.println("nombre del thread "+ Thread.currentThread().getName());
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                e.printStackTrace();
            }
            System.out.println("finaliza la tarea.");
            return "resultado de tarea";
        };

        Future<String> resultado = executor.submit(tarea);
        executor.shutdown();
        System.out.println("continuando con la ejecucion del metodo main ");

        while(!resultado.isDone()){
            System.out.println("ejecuando tarea ....");
            TimeUnit.MILLISECONDS.sleep(1500);
        }
        System.out.println(resultado.get(6, TimeUnit.SECONDS));
        System.out.println(resultado.isDone());

    }
}
