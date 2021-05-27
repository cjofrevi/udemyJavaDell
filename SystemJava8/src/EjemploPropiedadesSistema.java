import java.util.Properties;

public class EjemploPropiedadesSistema {
    public static void main(String[] args) {
        String userName = System.getProperty("user.name");
        System.out.println("userName = " + userName);

        String home = System.getProperty("user.home");
        System.out.println("home = " + home);

        String workSpace = System.getProperty("user.dir");
        System.out.println("workSpace = " + workSpace);

        String java = System.getProperty("java.version");
        System.out.println("java = " + java);

        String lineSeparator = System.getProperty("line.separator");
        System.out.println("lineSeparator = " + lineSeparator + " nuevalinea");

        Properties p = System.getProperties();
        p.list(System.out);

    }
}
