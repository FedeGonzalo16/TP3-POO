package model;

import java.util.ArrayList;
import java.util.List;

public abstract class Tarjeta {

    /*Atribs de clase*/
    protected int nroTarjeta;
    protected Cliente cliente;/*Agregacion - agrega un cliente*/
    protected List<Consumo> Consumo = new ArrayList<>(); /*Agregacion - agrega consumos*/

    /*Constructor*/
    public Tarjeta(int nroTarjeta) {
        this.nroTarjeta = nroTarjeta;
    }

    /*Getters y Setters*/
    public int getNroTarjeta() {
        return nroTarjeta;
    }

    public void setNroTarjeta(int nroTarjeta) {
        this.nroTarjeta = nroTarjeta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<model.Consumo> getConsumo() {
        return Consumo;
    }

    public void setConsumo(List<model.Consumo> consumo) {
        Consumo = consumo;
    }
}
