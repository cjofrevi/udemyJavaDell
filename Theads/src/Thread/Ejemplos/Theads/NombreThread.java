package Thread.Ejemplos.Theads;

public class NombreThread extends Thread{
    public NombreThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("se inicio metodo run del hilo " + getName());

        for(int i = 0; i < 10; i++){
            System.out.println(this.getName());
        }
        System.out.println("finaliza el hilo.");
    }
}
