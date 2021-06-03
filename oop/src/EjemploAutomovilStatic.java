public class EjemploAutomovilStatic {
    public static void main(String[] args) {

        Automovil auto = new Automovil("lada", "samara" );
        auto.setMotor(new Motor(2.0, TipoMotor.BENCINA));
        auto.setColor(Color.AZUL);
        auto.setTipo(TipoAutomovil.COUPE);
        System.out.println(Automovil.VELOCIDAD_MAX_CARRETERRA);
        System.out.println(Automovil.VELOCIDAD_MAX_CIUDAD);

        Automovil byd = new Automovil("BYD", "electrico", Color.ROJO, new Motor(1.5, TipoMotor.DIESEL));
        byd.setTipo(TipoAutomovil.FURGON);
        Automovil empty = new Automovil();
        Automovil nissan = new Automovil("nissan", "feo", Color.GRIS,
                new Motor(4.0, TipoMotor.DIESEL),new Estanque(50));
        nissan.setTipo(TipoAutomovil.CONVERTIBLE);
        Automovil nissan2 = new Automovil("nissan", "feo", Color.GRIS,
                new Motor(3.5, TipoMotor.BENCINA) , new Estanque(50));
        nissan2.setTipo(TipoAutomovil.CONVERTIBLE);

        Automovil.setColorPatente(Color.AMARILLO);

        System.out.println(auto.verDetalle());
        System.out.println("*********");
        System.out.println(byd.verDetalle());
        System.out.println("*********");
        System.out.println(nissan.verDetalle());
        System.out.println("*********");
        System.out.println(nissan2.verDetalle());
//        System.out.println("*********");
//        System.out.println(empty.verDetalle());

        System.out.println("Automovil = " + Automovil.getColorPatente());
        System.out.println("kilometors por litro " + Automovil.calcularConsumoStatic(300, 60));
    }
}
