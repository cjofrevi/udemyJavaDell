public class EjemploAutomovilRelacionesObjetos2 {
    public static void main(String[] args) {

        Persona conductorAuto = new Persona("nino", "el felino");
        Rueda[] ruedasAuto = new Rueda[5];
        for (int i = 0; i < 5; i++) {
            ruedasAuto[i] = new Rueda("caras", 16, 7.5);
        }


        Automovil auto = new Automovil("lada", "samara" );
        auto.setMotor(new Motor(2.0, TipoMotor.BENCINA));
        auto.setColor(Color.AZUL);
        auto.setTipo(TipoAutomovil.COUPE);
        auto.setPropietario(conductorAuto);
        auto.setRuedas(ruedasAuto);

        Rueda[] ruedasBYD = { new Rueda("gomadas", 18, 10.5),
                new Rueda("gomadas", 18, 10.5),
                new Rueda("gomadas", 18, 10.5),
                new Rueda("gomadas", 18, 10.5),
                new Rueda("gomadas", 18, 10.5)};
        Persona conductorBYD = new Persona("chibo", "lito");
        Automovil byd = new Automovil("BYD", "electrico", Color.ROJO, new Motor(1.5, TipoMotor.DIESEL));
        byd.setTipo(TipoAutomovil.FURGON);
        byd.setPropietario(conductorBYD);
        byd.setRuedas(ruedasBYD);

        Automovil empty = new Automovil();

        Persona conductorNissan = new Persona("Gato", "berto");

        Rueda[] ruedasNissan = {new Rueda("samsung", 20, 11.5),
                new Rueda("samsung", 20, 11.5),
                new Rueda("samsung", 20, 11.5),
                new Rueda("samsung", 20, 11.5),
                new Rueda("samsung", 20, 11.5)};
        Automovil nissan = new Automovil("nissan", "feo", Color.GRIS,
                new Motor(4.0, TipoMotor.DIESEL),new Estanque(50), conductorNissan, ruedasNissan);
        nissan.setTipo(TipoAutomovil.CONVERTIBLE);


        Persona conductorni2 = new Persona("miki", "sito");
        Rueda[] ruedasNissan2 = {new Rueda("chinas", 18, 7.8),
                new Rueda("chinas", 18, 7.8),
                new Rueda("chinas", 18, 7.8),
                new Rueda("chinas", 18, 7.8),
                new Rueda("chinas", 18, 7.8)} ;
        Automovil nissan2 = new Automovil("nissan", "feo", Color.GRIS,
                new Motor(3.5, TipoMotor.BENCINA) , new Estanque(50), conductorni2, ruedasNissan2);
        nissan2.setTipo(TipoAutomovil.CONVERTIBLE);



        System.out.println(auto.verDetalle());
        System.out.println("*********");
        System.out.println(byd.verDetalle());
        System.out.println("*********");
        System.out.println(nissan.verDetalle());
        System.out.println("*********");
        System.out.println(nissan2.verDetalle());
//        System.out.println("*********");
//        System.out.println(empty.verDetalle());

        System.out.println("conductor auto: "+auto.getPropietario());
        System.out.println("ruedas auto: ");
        for(Rueda r : auto.getRuedas()){
            System.out.println(r.getFabricante() + " , ancho:  " + r.getAncho()+ " , aro:  "+r.getAro());
        }

    }
}
