package Proyecto_MVC;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author Jonat
 */

//Aquí se inicializará primero el modelo después el controlador y al final las vistas
public class App {
    public static void main(String[] args) {
        Modelo modelo = new Modelo();
    
        Controlador controlador = new Controlador(modelo);

        Chat chat1 = new Chat(controlador);
        modelo.agregarObservador(chat1);
        chat1.setVisible(true);
        chat1.setDefaultCloseOperation(EXIT_ON_CLOSE);
        chat1.setTitle("Chat 1");
        chat1.setLocation(200,200);
        
        Chat chat2 = new Chat(controlador);
        modelo.agregarObservador(chat2);
        chat2.setVisible(true);
        chat2.setDefaultCloseOperation(EXIT_ON_CLOSE);
        chat2.setTitle("Chat 2");
        chat2.setLocation(662,200);
    }
}
