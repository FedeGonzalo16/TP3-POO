package controller;

import model.*;
import java.util.ArrayList;
import java.util.List;

//Controlador de Tarjetas
public class TarjetasController {

    /*Maneja todas las tarjetas del sistema*/
    private List<Tarjeta> tarjetas;

    //Creamos la instancia del controlador - declarada en su inicializacion como null
    private static TarjetasController INSTANCE = null;

    /*Constructor privado*/
    private TarjetasController(){
        tarjetas = new ArrayList<>();
    }

    /*Patrón Singleton - una sola instancia del Controller*/
    public static TarjetasController getInstance(){
        if (INSTANCE == null) {
            INSTANCE = new TarjetasController();
        }
        return INSTANCE;
    }

    //Creamos el método de alta/agregado de tarjeta de crédito al sistema - transformando el DTO al modelo
    public void addTarjetaCredito(TarjetaCredito dto) {

        //Agregación - agrega un cliente
        Cliente cliente = new Cliente(dto.getCliente().getNombre(),dto.getCliente().getApellido(),
                Integer.valueOf(dto.getCliente().getDni()));
        //Ageragación - agrega consumo
        Consumo consumos = new Consumo(Integer.valueOf(dto.getConsumo().getLast().getNroConsumo()),
                Integer.valueOf(dto.getConsumo().getLast().getMes()),
                Integer.valueOf(dto.getConsumo().getLast().getAnio()),
                dto.getConsumo().getLast().getNombreEstablecimiento(),
                Float.valueOf(dto.getConsumo().getLast().getMonto())
        );

        //agregación - agregamos un cliente a la tarjeta de debito
        TarjetaCredito tarjetaCredito = null;
        tarjetaCredito.setCliente(cliente);
        //agregacion - agregamos una lista de consumos a la tarjeta de debito
        tarjetaCredito = null;
        tarjetaCredito.setConsumo((List<Consumo>) consumos);
        //creo el cliente - los tengo que pasar al tipo de dato que corresponde
        tarjetaCredito = new TarjetaCredito(Integer.valueOf(dto.getNroTarjeta()),
                Integer.valueOf(dto.getInteres()));
        //Agrego finalmente el cliente al array
        tarjetas.add(tarjetaCredito);
    }

    //Creamos el método de alta/agregado de tarjeta de crédito al sistema - transformando el DTO al modelo
    public void addTarjetaDebito(TarjetaDebito dto) {

        //Agregación - agrega un cliente
        Cliente cliente = new Cliente(dto.getCliente().getNombre(),dto.getCliente().getApellido(),
                Integer.valueOf(dto.getCliente().getDni()));
        //Ageragación - agrega consumo
        Consumo consumos = new Consumo(Integer.valueOf(dto.getConsumo().getFirst().getNroConsumo()),
                Integer.valueOf(dto.getConsumo().getLast().getMes()),
                Integer.valueOf(dto.getConsumo().getLast().getAnio()),
                dto.getConsumo().getLast().getNombreEstablecimiento(),
                Float.valueOf(dto.getConsumo().getFirst().getMonto())
                );

        TarjetaDebito tarjetaDebito = new TarjetaDebito(Integer.valueOf(dto.getNroTarjeta()),
                Float.valueOf(dto.getDevIVA()));
        //agregación - agregamos un cliente a la tarjeta de debito
        tarjetaDebito.setCliente(cliente);
        //agregacion - agregamos una lista de consumos a la tarjeta de debito
        tarjetaDebito.setConsumo((List<Consumo>) consumos);
        tarjetas.add(tarjetaDebito);
    }

    //Método para calcular el Costo Real de Crédito
    public float calcularCostoRealCredito(int nroTarjetaCreditoDto, int mes){
        TarjetaCredito tarjetaCredito = (TarjetaCredito) buscarTarjetaCredito(nroTarjetaCreditoDto);
        if (tarjetas != null){
            return tarjetaCredito.calcularCostoCredito(tarjetaCredito.getInteres(), mes);
        }
        return 0;
    }

    //Método para clacular el Costo Real de Débito
    public float calcularCostoRealDebito(int nroTarjetaDebitoDto, int mes){
        TarjetaDebito tarjetaDebito = (TarjetaDebito) buscarTarjetaDebito(nroTarjetaDebitoDto);
        if (tarjetas != null){
            return tarjetaDebito.calcularCostoDebito(tarjetaDebito.getDevIVA(), mes);
        }
        return 0;
    }

    //Método para buscar tarjetas de Crédito
    public Tarjeta buscarTarjetaCredito(int nroTarjetaCreditoDto){
        for(Tarjeta tarjetaCredito : tarjetas){
            if (nroTarjetaCreditoDto == tarjetaCredito.getNroTarjeta()){
                return tarjetaCredito;
            }
        }
        return null;
    }

    //Método para buscar tarjetas de Débito
    public Tarjeta buscarTarjetaDebito(int nroTarjetaDebitoDto){
        for(Tarjeta tarjetaDebito : tarjetas){
            if (nroTarjetaDebitoDto == tarjetaDebito.getNroTarjeta()){
                return tarjetaDebito;
            }
        }
        return null;
    }

   //Getters
    public List<Tarjeta> getTarjetas() {
        return tarjetas;
    }

    public static TarjetasController getINSTANCE() {
        return INSTANCE;
    }
}



