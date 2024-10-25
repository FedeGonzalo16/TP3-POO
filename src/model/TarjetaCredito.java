package model;

/*Extiende atribs de Tarjeta - Herencia*/
public class TarjetaCredito extends Tarjeta{

    /*Atribs de clase*/
    private int interes;

    /*Constructor*/
    public TarjetaCredito(int nroTarjeta, int interes){
        super(nroTarjeta); /*ref a clase padre - construirla*/
        this.interes = interes;
    }

    //Método para calcular el costo real de crédito
    public float calcularCostoCredito(float interes, int mes){
        float totalConsumo = 0;
        float montoReal;
        for(Consumo consumo : Consumo){
            if (consumo.getMes() == mes){
                totalConsumo += consumo.getMonto();
            }
        }
        return montoReal = totalConsumo + (1 + this.interes / 100);
    }

    /*Getters y Setters*/
    public int getInteres() {
        return interes;
    }

    public void setInteres(int interes) {
        this.interes = interes;
    }
}
