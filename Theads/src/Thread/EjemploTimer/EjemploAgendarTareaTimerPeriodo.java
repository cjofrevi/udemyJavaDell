package Thread.EjemploTimer;

import java.awt.*;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicInteger;

public class EjemploAgendarTareaTimerPeriodo {
    public static void main(String[] args) {

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        AtomicInteger atomicinteger = new AtomicInteger(3);
        Timer timer = new Timer();

        timer.schedule(new TimerTask() {
//            private int contador = 3;
            @Override
            public void run() {
                toolkit.beep();
                int i = atomicinteger.getAndDecrement();
                if( i > 0){
                    System.out.println("tarea "  +i+" realizada en: "+ new Date() +
                            " nombre Thread "+ Thread.currentThread().getName());
                    i --;
                }else{
                    System.out.println("finaliza el tiempo");
                    timer.cancel();
                }

            }
        }, 0, 10000);

        System.out.println("agendammos en 5 min mas");
    }
}
