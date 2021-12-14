package Proyecto_MVC;

import java.util.ArrayList;

/**
 *
 * @author Jonat
 */
public class Modelo implements Observer {
    //Creamos la lista de observadores
    private ArrayList<Observer> observadores;
    //Texto que mandarán desde ambas ventanas
    private String mensaje;
    
    public Modelo(){
        this.observadores = new ArrayList<Observer>();
        this.mensaje = "";
    }
    
    @Override
    public void actualizarChat(String mensaje){
        this.mensaje = mensaje;
        notificarObservadores(this.mensaje);
    }
    
    public void notificarObservadores(String mensaje){
        for(Observer observador : observadores){
            observador.actualizarChat(mensaje);
        }
    }
    
    public void agregarObservador(Observer observador){
        this.observadores.add(observador);
    }
    
    public void eliminarObservador(Modelo observador){
        this.observadores.remove(observador);
    }
}
