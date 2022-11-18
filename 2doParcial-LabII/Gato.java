import java.util.ArrayList;

public class Gato implements Comparable<Gato> {

    private String nombre;
    private String color;
    private String raza;

    //constructor
    public Gato(String nombre, String color, String raza) {
        this.nombre = nombre;
        this.color = color;
        this.raza = raza;
    }

    //getter
    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }

    //sobreescribimos el metodo toString
    @Override
    public String toString() {
        return "Gato{" + "nombre=" + nombre + ", color=" + color + ", raza=" + raza + '}';
    }

    //sobreescribimos el metodo equals
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Gato other = (Gato) obj;
        if ((this.nombre == null) ? (other.nombre != null) : !this.nombre.equals(other.nombre)) {
            return false;
        }
        if ((this.color == null) ? (other.color != null) : !this.color.equals(other.color)) {
            return false;
        }
        if ((this.raza == null) ? (other.raza != null) : !this.raza.equals(other.raza)) {
            return false;
        }
        return true;
    }

    //Normalizando a minusculas
    public String normalizar(String cadena) {
        return cadena.toLowerCase();
    }

    @Override
    public int compareTo(Gato o) {
        return 0;
    }

    public static void main(String[] args) {

        //creamos un arraylist de gatos
        ArrayList<Gato> gatos = new ArrayList<Gato>();

        //creamos los gatos
        Gato gato1 = new Gato("Naranja", "naranja", "persa");
        Gato gato2 = new Gato("Gris", "gris", "siames");
        Gato gato3 = new Gato("Blanco", "blanco", "angora");

        //añadimos los gatos al arraylist
        gatos.add(gato1);
        gatos.add(gato2);
        gatos.add(gato3);

        //mostramos los gatos en minusculas y ordenados alfabeticamente por raza en forma descendente
        for (Gato gato : gatos) {
            System.out.println(gato.getNombre().toLowerCase() + " " + gato.getRaza().toLowerCase());
        }
    }

}
