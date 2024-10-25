package view;

import controller.TarjetasController;

public class TarjetasGUI {

    /*Modelo Tarjeta*/
    private String nroTarjetaTxt;
    private String interesTxt;
    private String devIVATxt;

    /*Modelo Consumo*/
    private String mesTxt;
    private String anioTxt;
    private String nombreEstablecimientoTxt;
    private String montoTxt;

    //Tendra acceso a la instancia del controlador
    private TarjetasController tarjetasController;

    //Constructor de clase View
    public TarjetasGUI(String nroTarjeta, String interes, String devIVA,
                       String mes, String anio, String nombreEstablecimiento, String monto){
        this.nroTarjetaTxt = nroTarjeta;
        this.interesTxt = interes;
        this.devIVATxt = devIVA;
        this.mesTxt = mes;
        this.anioTxt = anio;
        this.nombreEstablecimientoTxt = nombreEstablecimiento;
        this.montoTxt = monto;
        //Obtenemos la instancia del controlador
        this.tarjetasController = TarjetasController.getInstance();
    }
}
