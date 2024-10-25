package dto;

import java.util.ArrayList;
import java.util.List;

public class TarjetaDto {
    /*Atribs de clase*/
    private String nroTarjeta;
    private String cliente;/*Agregacion - agrega un cliente*/
    private List<model.Consumo> Consumo = new ArrayList<>(); /*Agregacion - agrega consumos*/

    /*Constructor*/
    public TarjetaDto(String nroTarjeta) {
        this.nroTarjeta = nroTarjeta;
    }

    /*Getters y Setters*/
    public String getNroTarjeta() {
        return nroTarjeta;
    }

    public void setNroTarjeta(String nroTarjeta) {
        this.nroTarjeta = nroTarjeta;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public List<model.Consumo> getConsumo() {
        return Consumo;
    }

    public void setConsumo(List<model.Consumo> consumo) {
        Consumo = consumo;
    }
}
