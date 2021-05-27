import java.io.IOException;

public class ejemploEjecutarPrgramaSO {
    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();
        Process proceso;


            try {
                if(System.getProperty("os.name").startsWith("Windows")){
                    proceso = rt.exec("notepad");
                }
                else if(System.getProperty("os.name").startsWith("Mac")){
                    proceso = rt.exec("textedit");
                }
                else{
                    proceso = rt.exec("gedit");
                }
                proceso.waitFor();
            } catch (Exception e) {
//                e.printStackTrace();
                System.err.println("El comando es desconocido "+e.getMessage());
                System.exit(1);
            }
        System.out.println("se ha cerrado el editor");
            System.exit(0);


    }
}
