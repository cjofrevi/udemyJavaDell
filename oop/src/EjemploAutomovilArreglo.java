import java.util.Arrays;

public class EjemploAutomovilArreglo {
    public static void main(String[] args) {

        Persona conductorAuto = new Persona("nino", "el felino");

        Automovil auto = new Automovil("lada", "samara" );
        auto.setMotor(new Motor(2.0, TipoMotor.BENCINA));
        auto.setColor(Color.AZUL);
        auto.setTipo(TipoAutomovil.COUPE);
        auto.setPropietario(conductorAuto);

        Persona conductorBYD = new Persona("chibo", "lito");
        Automovil byd = new Automovil("BYD", "electrico", Color.ROJO, new Motor(1.5, TipoMotor.DIESEL));
        byd.setTipo(TipoAutomovil.FURGON);
        byd.setPropietario(conductorBYD);

//        Automovil empty = new Automovil();

        Persona conductorNissan = new Persona("Gato", "berto");
        Automovil nissan = new Automovil("nissan", "feo", Color.GRIS,
                new Motor(4.0, TipoMotor.DIESEL),new Estanque(50), conductorNissan, null);
        nissan.setTipo(TipoAutomovil.CONVERTIBLE);


        Persona conductorni2 = new Persona("miki", "sito");

        Automovil nissan2 = new Automovil("daewoo", "feo", Color.GRIS,
                new Motor(3.5, TipoMotor.BENCINA) , new Estanque(50), conductorni2, null);
        nissan2.setTipo(TipoAutomovil.CONVERTIBLE);

        Automovil[] autos = new Automovil[4];
        autos[0] = auto;
        autos[1] = byd;
        autos[2] = nissan;
        autos[3] = nissan2;

        Arrays.sort(autos);
        Arrays.stream(autos).forEach(System.out::println);

    }
}
