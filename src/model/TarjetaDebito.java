package model;

/*Extiende atribs de Tarjeta - Herencia*/
public class TarjetaDebito extends Tarjeta{

    /*Atribs de clase*/
    private float devIVA;

    /*Constructor*/
    public TarjetaDebito(int nroTarjeta, float devIVA){
        super(nroTarjeta); /*ref a clase padre - construirla*/
        this.devIVA = devIVA;
    }

    //Método para calcular costo real de Débito
    public float calcularCostoDebito(float devIVA, int mes){
        float totalConsumo = 0;
        for(Consumo consumo : Consumo){
            if (consumo.getMes() == mes){
                totalConsumo += consumo.getMonto();
            }
        }
        return totalConsumo + (1 - this.devIVA / 100);
    }

    /*Getters y Setters*/
    public float getDevIVA() {
        return devIVA;
    }

    public void setDevIVA(float devIVA) {
        this.devIVA = devIVA;
    }
}
