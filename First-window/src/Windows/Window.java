package Windows;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Window extends JFrame {
    public Window() {
        this.setSize(500, 500);
        // this.setBounds(960, 540, 500, 500); //Nos permite colocar nuestra ventana en un determinado lugar y tambien establecer sus dimensiones.
        this.setTitle("Mi primera ventana");
        this.setLocationRelativeTo(rootPane); //Coloca nuestra ventana en el centro de nuestra pantalla (null/rootPane).
        // this.setResizable(false); //Bloqueamos la redimension de nuestra ventana.
        this.setMinimumSize(new Dimension(150, 150)); //Establece una dimension minima de nuestra ventana.
        this.getContentPane().setBackground(Color.DARK_GRAY); //Establece el color de fondo de nuestra ventana.
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); //Le damos la funcionalidad al boton X de la ventana.

    }
}
