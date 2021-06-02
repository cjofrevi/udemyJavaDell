import java.util.Objects;

public class Automovil {
    private String fabricante;
    private String modelo;
    private String color = "verde";
    private double cilindrada;
    private int capacidadEstanque = 40;

    public Automovil(){
    }

    public Automovil(String fabricante, String modelo ) {
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public Automovil(String fabricante, String modelo, String color) {
        this(fabricante, modelo);
        this.color = color;
    }

    public Automovil(String fabricante, String modelo, String color, double cilindrada) {
        this(fabricante, modelo, color);
        this.cilindrada = cilindrada;
    }

    public Automovil(String fabricante, String modelo, String color, double cilindrada, int capacidadEstanque) {
        this( fabricante, modelo, color, cilindrada);
        this.capacidadEstanque = capacidadEstanque;
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

    public String getColor(){
        return this.color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public double getCilindrada(){
        return this.cilindrada;
    }

    public void setCilindrada(double cilindrada){
        this.cilindrada = cilindrada;
    }

    public int getCapacidadEstanque(){
        return this.capacidadEstanque;
    }

    public void setCapacidadEstanque(int capacidadEstanque){
        this.capacidadEstanque = capacidadEstanque;
    }

    public String verDetalle(){

        return "fabricante = " + this.fabricante+
        "\nmodelo = " + this.modelo+
        "\ncolor = " + this.color+
        "\ncilindrada = " + this.cilindrada;
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
        return km / (capacidadEstanque * porcentajeGastado);
    }

    public float calcularConsumo( int km, int porcentajeGastado){
        return km / (capacidadEstanque * (porcentajeGastado/100f));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Automovil automovil = (Automovil) o;
        return Double.compare(automovil.cilindrada, cilindrada) == 0 && capacidadEstanque == automovil.capacidadEstanque && Objects.equals(fabricante, automovil.fabricante) && Objects.equals(modelo, automovil.modelo) && Objects.equals(color, automovil.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fabricante, modelo, color, cilindrada, capacidadEstanque);
    }
}
