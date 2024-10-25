package controller;

import dto.ClienteDto;
import model.Cliente;
import java.util.ArrayList;
import java.util.List;

//Controlador de Clientes
public class ClientesController  {

    //Maneja todos los clientes del sistema
    private List<Cliente> clientes;

    //Creamos la instancia del controlador - declarada en su inicializacion como null
    private static ClientesController INSTANCE = null;

    //Constructor privado
    private ClientesController(){
        clientes = new ArrayList<>();
    }

    /*Patrón Singleton - una sola instancia del Controller*/
    public static ClientesController getInstance(){
        if(INSTANCE == null) {
                INSTANCE = new ClientesController();
        }
        return INSTANCE;
    }

    //Creamos el método de alta/agregado de cliente de crédito al sistema - transformando el DTO al modelo
    public void addCliente(ClienteDto dto) {
        //creo el cliente - los tengo que pasar al tipo de dato que corresponde
        Cliente cliente = new Cliente(dto.getNombre(),dto.getApellido(),Integer.valueOf(dto.getDni()));
        clientes.add(cliente);
    }

    //Getters
    public static ClientesController getINSTANCE() {
        return INSTANCE;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

}

