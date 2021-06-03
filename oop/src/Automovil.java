import java.util.Arrays;
import java.util.Objects;

public class Automovil implements Comparable<Automovil> {

    private int id;
    private String fabricante;
    private String modelo;
    private Color color = Color.GRIS;
    private Motor motor ;
    private Estanque estanque;
    private Persona propietario;
    private Rueda[] ruedas;

    private TipoAutomovil tipo;

    private static Color colorPatente = Color.BLANCO;
    private static int capacidadEstanquestatic = 30;
    private static int ultimoId;

    public static final Integer VELOCIDAD_MAX_CARRETERRA = 120;
    public static final Integer VELOCIDAD_MAX_CIUDAD = 50;



    public static final String COLOR_ROJO = "rojo";
    public static final String COLOR_AMARILLO = "amarillo" ;
    public static final String COLOR_AZUL = "azul" ;
    public static final String COLOR_BLANCO = "blanco";
    public static final String COLOR_GRIS = "gris";

    public Automovil(){
        this.id = ++ultimoId;
    }

    public Automovil(String fabricante, String modelo ) {
        this();
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public Automovil(String fabricante, String modelo, Color color) {
        this(fabricante, modelo);
        this.color = color;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor ) {
        this(fabricante, modelo, color);
        this.motor = motor;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor, Estanque estanque) {
        this( fabricante, modelo, color, motor);
        this.estanque = estanque;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor, Estanque estanque, Persona propietario, Rueda[] ruedas) {
        this(fabricante, modelo, color, motor, estanque);
        this.propietario = propietario;
        this.ruedas = ruedas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFabricante(){
        return this.fabricante;
    }

    public void setfabricante(String fabricante){
        this.fabricante = fabricante;
    }

    public String getModelo(){
        return this.modelo;
    }

    public void setModelo( String modelo){
        this.modelo = modelo;
    }

    public Color getColor(){
        return this.color;
    }

    public void setColor(Color color){
        this.color = color;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Estanque getEstanque() {
        if(estanque == null){
            this.estanque = new Estanque();
        }
        return estanque;
    }

    public void setEstanque(Estanque estanque) {
        this.estanque = estanque;
    }

    public Persona getPropietario() {
        return propietario;
    }

    public void setPropietario(Persona propietario) {
        this.propietario = propietario;
    }

    public Rueda[] getRuedas() {
        return ruedas;
    }

    public void setRuedas(Rueda[] ruedas) {
        this.ruedas = ruedas;
    }

    public static Color getColorPatente() {
        return colorPatente;
    }

    public static void setColorPatente(Color colorPatente) {
        Automovil.colorPatente = colorPatente;
    }

    public TipoAutomovil getTipo() {
        return tipo;
    }

    public void setTipo(TipoAutomovil tipo) {
        this.tipo = tipo;
    }

    public String verDetalle(){

        String detalle =  "id =" + this.id +
            "\nfabricante = " + this.fabricante+
            "\nmodelo = " + this.modelo;
        if(this.getTipo() != null){
            detalle +=        "\ntipo = "+ this.getTipo().getDescripcion();
        }
        detalle += "\ncolor = " + this.color.getColor()+
            "\nauto.patenteColor = " + Automovil.colorPatente.getColor();
        if(this.motor != null) {
            detalle += "\ncilindrada = " + this.motor.getCilindrada();
        }
        return detalle;
    }

    public String acelerar( int rpm){
        return "El auto "+ this.fabricante+ " acelerando a "+rpm+" rpm.";
    }

    public String frenar(){
        return this.fabricante + " "+ this.modelo + " frenando!!";
    }

    public String acelerarFrenar( int rpm){
        return this.acelerar(rpm) + "\n" + this.frenar();
    }

    public float calcularConsumo( int km, float porcentajeGastado){
        return km / (this.getEstanque().getCapacidad() * porcentajeGastado);
    }

    public float calcularConsumo( int km, int porcentajeGastado){
        return km / (this.getEstanque().getCapacidad()  * (porcentajeGastado/100f));
    }

    public static float calcularConsumoStatic( int km, int porcentajeGastado){
        return km / (capacidadEstanquestatic * (porcentajeGastado/100f));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Automovil automovil = (Automovil) o;
        return id == automovil.id && Objects.equals(fabricante, automovil.fabricante) && Objects.equals(modelo, automovil.modelo) && color == automovil.color && Objects.equals(motor, automovil.motor) && Objects.equals(estanque, automovil.estanque) && Objects.equals(propietario, automovil.propietario) && Arrays.equals(ruedas, automovil.ruedas) && tipo == automovil.tipo;
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(id, fabricante, modelo, color, motor, estanque, propietario, tipo);
        result = 31 * result + Arrays.hashCode(ruedas);
        return result;
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "id=" + id +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color=" + color +
                ", motor=" + motor +
                ", estanque=" + estanque +
                ", propietario=" + propietario +
                ", ruedas=" + Arrays.toString(ruedas) +
                ", tipo=" + tipo +
                '}';
    }

    @Override
    public int compareTo(Automovil a) {

        return this.fabricante.compareTo(a.fabricante);
    }
}
