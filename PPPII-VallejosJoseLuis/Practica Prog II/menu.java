import javax.swing.JOptionPane;

public class menu{

    public static void main(String[] args) {

        int contador = 0;
        String nombre = "Articulo";

        comprarArticulos(combre+contador++);


        Productos p1 = new Productos("Pizza", 0001, 25, 500);

        p1.mostrarDatos();

        p1.vender(0001, 20);
        p1.comprar(0001, 100);
    }

    public static void comprarArticulos(String nombre, int contador){

        String nombreArticulo = nombre + contador;

        Articulos nombreArticulo = new Articulos("cadena", "cadena", 300, 1500, 500);
    }
}