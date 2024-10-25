package dto;

public class ConsumoDto {
    /*Atribs del DTO*/
    private String nroConsumo;
    private String mes;
    private String anio;
    private String nombreEstablecimiento;
    private String monto;

    //Constructor del DTO
    public ConsumoDto(String nroConsumo, String mes, String anio, String nombreEstablecimiento, String monto) {
        this.nroConsumo = nroConsumo;
        this.mes = mes;
        this.anio = anio;
        this.nombreEstablecimiento = nombreEstablecimiento;
        this.monto = monto;
    }

    //Getters y Setters
    public String getNroConsumo() {
        return nroConsumo;
    }

    public void setNroConsumo(String nroConsumo) {
        this.nroConsumo = nroConsumo;
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

    public String getMonto() {
        return monto;
    }

    public void setMonto(String monto) {
        this.monto = monto;
    }

    public String getNombreEstablecimiento() {
        return nombreEstablecimiento;
    }

    public void setNombreEstablecimiento(String nombreEstablecimiento) {
        this.nombreEstablecimiento = nombreEstablecimiento;
    }
}
