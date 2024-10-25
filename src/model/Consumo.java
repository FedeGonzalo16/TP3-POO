package model;

public class Consumo {

    /*Atribs de clase*/
    private int nroConsumo;
    private int mes;
    private int anio;
    private String nombreEstablecimiento;
    private float monto;

    /*Constructor*/
    public Consumo(int nroConsumo, int mes, int anio, String nombreEstablecimiento, float monto) {
        this.nroConsumo = nroConsumo;
        this.mes = mes;
        this.anio = anio;
        this.nombreEstablecimiento = nombreEstablecimiento;
        this.monto = monto;
    }

    /*Getters y Setters*/
    public int getNroConsumo() {
        return nroConsumo;
    }

    public void setNroConsumo(int nroConsumo) {
        this.nroConsumo = nroConsumo;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getNombreEstablecimiento() {
        return nombreEstablecimiento;
    }

    public void setNombreEstablecimiento(String nombreEstablecimiento) {
        this.nombreEstablecimiento = nombreEstablecimiento;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }
}