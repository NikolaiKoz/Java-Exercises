package EJ3;

public class Alumno extends Persona {
    private String carrera;

    // Constructor
    public Alumno(String nombre, String apellido, String dni, String fechaDeIngreso, String carrera) {
        super(nombre, apellido, dni, fechaDeIngreso);
        this.carrera = carrera;
    }

    // Getters
    public String getCarrera() {
        return carrera;
    }

    // Setters
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    // Metodos
    public void mostrarDatos() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellido: " + getApellido());
        System.out.println("DNI: " + getDni());
        System.out.println("Fecha de ingreso: " + getFechaDeIngreso());
        System.out.println("Carrera: " + getCarrera());
    }

}
