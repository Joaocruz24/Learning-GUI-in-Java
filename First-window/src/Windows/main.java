package Windows;

public class main {
    public static void main(String[] args){
        System.out.println("Hello world");
        
        Window Ventana = new Window(); //Instanciamos el objeto ventana.

        Ventana.setVisible(true); //Hacemos uso del metodo setVisible para hacer visible nuestro objeto ventana.
        Ventana.setDefaultCloseOperation(2); //Le damos la funcionalidad a los botones de la ventana
        Ventana.setTitle("Mi primera ventana");
        
    }
}
