public class EjemploAutomovil {
    public static void main(String[] args) {

        Automovil auto = new Automovil("lada", "samara" );
        auto.setCilindrada(0.5);
        auto.setColor("blanco");

        System.out.println(auto.verDetalle());

        Automovil byd = new Automovil("BYD", "electrico", "azul", 2.0);
        Automovil empty = new Automovil();
        Automovil nissan = new Automovil("nissan", "feo", "naranjo", 3.5, 50);
        Automovil nissan2 = new Automovil("nissan", "feo", "naranjo", 3.5, 50);
        System.out.println("son iguales "+ (nissan == nissan2));
        System.out.println("son iguales con equals "+ (nissan.equals(nissan2)));
        System.out.println("comparar vacio "+ empty.equals(nissan));

        System.out.println(byd.verDetalle());
        System.out.println(nissan.verDetalle());

        System.out.println(byd.acelerarFrenar(2000));
        System.out.println(auto.acelerarFrenar(1500));

        System.out.println("Kilometros por litro " + byd.calcularConsumo(300, 0.75f));
        System.out.println("Kilometros por litro " + byd.calcularConsumo(300, 75));
    }
}
