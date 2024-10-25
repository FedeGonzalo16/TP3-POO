package dto;

//DTO de la tarjeta de Debito
public class TarjetaDebitoDto{
    /*Atribs del DTO*/
    private String nroTarjeta;
    private String devIVA;
    private String mes;
    private String anio;
    private String nombreEstablecimiento;
    private String monto;

    //Constructor del DTO
    public TarjetaDebitoDto(String nroTarjeta, String devIVA,
                            String mes, String anio, String nombreEstablecimiento, String monto) {
        this.nroTarjeta = nroTarjeta;
        this.devIVA = devIVA;
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

    public String getDevIVA() {
        return devIVA;
    }

    public void setDevIVA(String devIVA) {
        this.devIVA = devIVA;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
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
