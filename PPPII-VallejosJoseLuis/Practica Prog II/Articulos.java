public class Articulos {


    String marca;
    String modelo;
    int codigo;
    int costo;
    int precio;
    String comentarios;

    public Articulos(String marca, String modelo, int codigo, int costo, int precio){

        this.marca = marca;
        this.modelo = modelo;
        this.codigo = codigo;
        this.costo = costo;
        this.precio = precio;

    }

    public Articulos(String marca, String modelo, int costo, int precio, String comentarios){

        this.marca = marca;
        this.modelo = modelo;
        this.costo = costo;
        this.precio = precio;
        this.comentarios = comentarios;

    }


}
