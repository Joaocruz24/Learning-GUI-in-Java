package Windows;
import javax.swing.JFrame;

public class Window extends JFrame {
    public Window() {
        this.setSize(500, 500);
        this.setTitle("Mi primera ventana");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); //Le damos la funcionalidad al boton X de la ventana
        
    }
}
