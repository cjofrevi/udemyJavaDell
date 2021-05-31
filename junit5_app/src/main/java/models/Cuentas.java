package models;

import Exceptions.DineroInsuficienteException;

import java.math.BigDecimal;
import java.util.Objects;

public class Cuentas {
    private String persona;
    private BigDecimal saldo;
    private Banco banco;

    public Cuentas(String persona, BigDecimal saldo) {
        this.saldo = saldo;
        this.persona = persona;
    }

    public String getPersona() {
        return persona;
    }

    public void setPersona(String persona) {
        this.persona = persona;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public void debito(BigDecimal monto){
        BigDecimal nuevosaldo = this.saldo.subtract(monto);
        if ( nuevosaldo.compareTo(BigDecimal.ZERO) <0){
            throw new DineroInsuficienteException("Dinero Insuficiente");
        }
        this.saldo = nuevosaldo;
    }

    public void credito(BigDecimal monto){
        this.saldo = this.saldo.add(monto);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cuentas cuentas = (Cuentas) o;
        return Objects.equals(persona, cuentas.persona) && Objects.equals(saldo, cuentas.saldo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(persona, saldo);
    }

}
