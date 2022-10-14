public class Productos {


    String nombre;
    int codigo;
    int precio;
    int cantidad;

    Productos(String nombre, int codigo, int precio, int cantidad){

        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
        this.cantidad = cantidad;
    }


    public void mostrarDatos(){
        System.out.println("El producto " + nombre + " CODIGO: " + codigo + "\nPrecio: " + precio + " Cantidad " + cantidad);
    }

    public void vender(int codigo, int cantidad){


        try {
            if(codigo == this.codigo){
                this.cantidad -= cantidad;
                System.out.println("El producto " + nombre + " CODIGO: " + codigo + "\nPrecio: " + precio + " Cantidad " + this.cantidad);
            } else{
                System.out.println("El codigo ingresado es incorrecto.");
            }


        } catch (Exception e) {
            System.out.println("El codigo ingresado es incorrecto.");
        }

    }

    public void comprar(int codigo, int cantidad){
        try {
            if(codigo == this.codigo){
                this.cantidad += cantidad;
                System.out.println("El producto " + nombre + " CODIGO: " + codigo + "\nPrecio: " + precio + " Cantidad " + this.cantidad);
            } else{
                System.out.println("El codigo ingresado es incorrecto.");
            }


        } catch (Exception e) {
            System.out.println("El codigo ingresado es incorrecto.");
        }
    }
}
