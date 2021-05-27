import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class EjemploAsignarPropiedadesDeSistema {
    public static void main(String[] args)  {

        try {
            FileInputStream archivo =  new FileInputStream("src/config.properties");
            Properties p = new Properties(System.getProperties());
            p.load(archivo);
            p.setProperty("mi.propiedad.personalizada", "valor guardado en el objeto poperties");

            System.setProperties(p);
            Properties ps = System.getProperties();

            System.out.println("ps.getProperty(...) = "+ ps.getProperty("mi.propiedad.personalizada"));
            System.out.println(System.getProperty("config.puerto.servidor"));
            System.out.println(System.getProperty("otra"));
            System.out.println(System.getProperty("config.texto.ambiente"));
            ps.list(System.out);

        } catch (Exception e) {
//            e.printStackTrace();
            System.err.println("no existe el archivo "+ e);
            System.exit(1);
        }
    }
}
