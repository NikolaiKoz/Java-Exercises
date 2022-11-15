package EJ3;

public class Profesor extends Persona {
    private String materia;

    // Constructor
    public Profesor(String nombre, String apellido, String dni, String fechaDeIngreso, String materia) {
        super(nombre, apellido, dni, fechaDeIngreso);
        this.materia = materia;
    }

    // Getters
    public String getMateria() {
        return materia;
    }

    // Setters
    public void setMateria(String materia) {
        this.materia = materia;
    }

    // Metodos
    public void mostrarDatos() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellido: " + getApellido());
        System.out.println("DNI: " + getDni());
        System.out.println("Fecha de ingreso: " + getFechaDeIngreso());
        System.out.println("Materia: " + getMateria());
    }
}
