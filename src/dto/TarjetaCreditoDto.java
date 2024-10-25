package dto;

import java.util.SequencedCollection;

//DTO de la tarjeta de Credito
public class TarjetaCreditoDto {
    /*Atribs del DTO*/
    private String nroTarjeta;
    private String interes;
    private String mes;
    private String anio;
    private String nombreEstablecimiento;
    private String monto;

    //Constructor del DTO
    public TarjetaCreditoDto(String nroTarjeta, String interes,
                             String mes, String anio, String nombreEstablecimiento, String monto) {
        this.nroTarjeta = nroTarjeta;
        this.interes = interes;
        this.mes = mes;
        this.anio = anio;
        this.nombreEstablecimiento = nombreEstablecimiento;
        this.monto = monto;
    }

    /*Getters y Setters*/
    public String getNroTarjeta() {
        return nroTarjeta;
    }

    public void setNroTarjeta(String nroTarjeta) {
        this.nroTarjeta = nroTarjeta;
    }

    public String getInteres() {
        return interes;
    }

    public void setInteres(String interes) {
        this.interes = interes;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getNombreEstablecimiento() {
        return nombreEstablecimiento;
    }

    public void setNombreEstablecimiento(String nombreEstablecimiento) {
        this.nombreEstablecimiento = nombreEstablecimiento;
    }

    public String getMonto() {
        return monto;
    }

    public void setMonto(String monto) {
        this.monto = monto;
    }
}
