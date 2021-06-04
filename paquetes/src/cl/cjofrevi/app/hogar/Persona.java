package cl.cjofrevi.app.hogar;

public class Persona {

    private String nombre;
    private String apellido;

    public static final String GENERO_MASCULINO = "masculino";
    public static final String GENERO_FEMENICO = "femenino";

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String lanzarPelota(){
        return "lanza la pelota al perro ";
    }

    public static String saludar(){
        return "hola hola";
    }
}
