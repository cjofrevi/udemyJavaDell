public enum TipoAutomovil {
    SEDAN("sedan", "auto mediano", 4),
    STATION_WAGON("station wagon", "auto grande", 4),
    HATCHBACK("hatchback", "auto compacto", 4),
    PICKUP("pickup", "camioneta", 4),
    COUPE("coupe", "auto pequeño", 2),
    CONVERTIBLE("convertible", "auto deportivo", 2),
    FURGON("furgon", "auto utilitario", 4);

    private final String nombre;
    private final int numeroPuerta;
    private final String descripcion;

    TipoAutomovil(String nombre, String descripcion, int numeroPuerta ) {
        this.nombre = nombre;
        this.numeroPuerta = numeroPuerta;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroPuerta() {
        return numeroPuerta;
    }

    public String getDescripcion() {
        return descripcion;
    }
}


