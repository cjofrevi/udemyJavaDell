public class EjemploAutomovil {
    public static void main(String[] args) {

        Automovil auto = new Automovil("lada", "samara" );
        auto.setMotor(new Motor(2.0, TipoMotor.BENCINA));
        auto.setEstanque(new Estanque());
        auto.setColor(Color.BLANCO);

        System.out.println(auto.verDetalle());

        Automovil byd = new Automovil("BYD", "electrico", Color.AMARILLO,
                new Motor(1.5, TipoMotor.DIESEL));
        Automovil empty = new Automovil();
        Automovil nissan = new Automovil("nissan", "feo", Color.AZUL,
                new Motor(4.0, TipoMotor.DIESEL),new Estanque(50));
        Automovil nissan2 = new Automovil("nissan", "feo", Color.AZUL,
                new Motor(3.5, TipoMotor.BENCINA) , new Estanque(50));
        System.out.println("son iguales "+ (nissan == nissan2));
        System.out.println("son iguales con equals "+ (nissan.equals(nissan2)));
        System.out.println("comparar vacio "+ empty.equals(nissan));
        System.out.println(nissan);

        System.out.println(byd.verDetalle());
        System.out.println(nissan.verDetalle());

        System.out.println(byd.acelerarFrenar(2000));
        System.out.println(auto.acelerarFrenar(1500));

        System.out.println("Kilometros por litro " + nissan.calcularConsumo(300, 0.75f));
        System.out.println("Kilometros por litro " + nissan2.calcularConsumo(300, 75));
    }
}
