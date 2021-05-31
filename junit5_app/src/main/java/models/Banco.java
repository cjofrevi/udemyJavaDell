package models;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nombre;
    private List<Cuentas> cuentas;

    public Banco() {
        cuentas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Cuentas> getCuentas() {
        return cuentas;
    }

    public void setCuentas(List<Cuentas> cuentas) {
        this.cuentas = cuentas;
    }

    public void addCuentas(Cuentas cuenta){
        cuentas.add(cuenta);
        cuenta.setBanco(this);
    }

    public void transferir(Cuentas origen, Cuentas destino, BigDecimal monto){
        origen.debito(monto);
        destino.credito(monto);

    }
}
