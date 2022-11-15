package EJ3;

public class Administativo extends Persona {
    private String oficina;

    // Constructor
    public Administativo(String nombre, String apellido, String dni, String fechaDeIngreso, String oficina) {
        super(nombre, apellido, dni, fechaDeIngreso);
        this.oficina = oficina;
    }

    // Getters
    public String getOficina() {
        return oficina;
    }

    // Setters
    public void setOficina(String oficina) {
        this.oficina = oficina;
    }

    // Metodos
    public void mostrarDatos() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellido: " + getApellido());
        System.out.println("DNI: " + getDni());
        System.out.println("Fecha de ingreso: " + getFechaDeIngreso());
        System.out.println("Oficina: " + getOficina());
    }

}
