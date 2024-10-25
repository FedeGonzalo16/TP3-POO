package view;

import controller.ClientesController;

public class ClienteGUI {
    /*Modelo Cliente*/
    private String nombre;
    private String apellido;
    private String dni;

    //Tendra acceso a la instancia del controlador
    private ClientesController clientesController;

    //Constructor de clase View
    public ClienteGUI(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        //Obtenemos la instancia del controlador
        this.clientesController = ClientesController.getInstance();
    }
}
