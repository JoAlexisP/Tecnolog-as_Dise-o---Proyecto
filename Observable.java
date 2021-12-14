package Proyecto_MVC;

/**
 *
 * @author Jonat
 */
public interface Observable {
    public void notificarObservadores(String mensaje);
    
    public void agregarObservador(Observer observador);
    
    public void eliminarObservador(Modelo observador);
}
