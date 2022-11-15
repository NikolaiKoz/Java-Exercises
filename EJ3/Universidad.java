

package EJ3;

public class Universidad{

    public static void main(String[] args) {
        Profesor profesor = new Profesor("Juan", "Perez", "12345678", "01/01/2010", "Matematica");

        Alumno alumno = new Alumno("Maria", "Gomez", "87654321", "01/01/2010", "Ingenieria");

        Administativo administativo = new Administativo("Pedro", "Gonzalez", "12345678", "01/01/2010", "Oficina 1");

        profesor.mostrarDatos();
        alumno.mostrarDatos();
        administativo.mostrarDatos();
    }

}