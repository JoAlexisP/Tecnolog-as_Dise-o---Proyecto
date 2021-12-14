package Proyecto_MVC;

/**
 *
 * @author Jonat
 */
public class Controlador {
    Modelo modelo;
    
    public Controlador(Modelo modelo){
        this.modelo = modelo;
    }
    
    public void actualizarVentana(String mensaje){
        this.modelo.actualizarChat(mensaje + "\n");
    }
}
