package SesentaYSietePaquetes.packege1;

public class Clase1 {
    private int edad;
    private final String nombre;


    // Getters and Setters
    public void setedad(int edad) {
        this.edad = edad;
    }

    // public void setnombre(String nombre) {
    //     this.nombre = nombre;
    // }

    // Al ser una el nombre una constante, no se puede modificar, por lo que no se le pone un setter.

    public int getedad() {
        return edad;
    }


    public String getnombre() {
        return nombre;
    }

    // Constructor
    public Clase1( int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }


}
