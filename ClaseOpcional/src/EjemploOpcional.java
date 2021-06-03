import java.util.Optional;

public class EjemploOpcional {

    public static void main(String[] args) {

        String nombre = "Andres";
        Optional<String> opt = Optional.of(nombre);
        System.out.println("opt = " + opt);
        System.out.println(opt.isPresent() );
        if(opt.isPresent()){
            System.out.println("holis "+opt.get());
        }

        opt.ifPresent(valor -> System.out.println("hola "+valor));

        nombre = null;
        opt = Optional.ofNullable(nombre);
        System.out.println("opt "+opt);
        System.out.println(opt.isPresent());

        opt.ifPresent(valor -> System.out.println("hola "+valor));

        Optional<String> optEmpty = Optional.empty();
        System.out.println("optEmpty = " + optEmpty);
        System.out.println(optEmpty.isPresent());
    }
}
