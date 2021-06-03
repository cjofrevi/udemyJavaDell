public class EjemploAutomovilEnum {
    public static void main(String[] args) {

        Automovil auto = new Automovil("lada", "samara" );
        auto.setMotor(new Motor(2.0, TipoMotor.BENCINA));
        auto.setColor(Color.AZUL);
        auto.setTipo(TipoAutomovil.COUPE);


        Automovil byd = new Automovil("BYD", "electrico", Color.ROJO,  new Motor(1.5, TipoMotor.DIESEL));
        byd.setTipo(TipoAutomovil.FURGON);
        Automovil empty = new Automovil();
        Automovil nissan = new Automovil("nissan", "feo", Color.GRIS,
                new Motor(4.0, TipoMotor.DIESEL),new Estanque(50));
        nissan.setTipo(TipoAutomovil.CONVERTIBLE);
        Automovil nissan2 = new Automovil("nissan", "feo", Color.GRIS,
                new Motor(3.5, TipoMotor.BENCINA) , new Estanque(50));
        nissan2.setTipo(TipoAutomovil.CONVERTIBLE);

        Automovil.setColorPatente(Color.AMARILLO);

        TipoAutomovil[] tipo = TipoAutomovil.values();
        for(TipoAutomovil ta :tipo){
            System.out.println(ta + " -> "+ ta.name()+ " , " +
                    ta.getNombre()+ " , "+
                    ta.getDescripcion()+ " , "+
                    ta.getNumeroPuerta());
            System.out.println("\n");
        }

    }
}
