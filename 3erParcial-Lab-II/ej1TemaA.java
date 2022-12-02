import java.io.*;

public class ej1TemaA {

    @Entity
    public class Empleado implements Serializable {
        @Id
        private int id;
        private String nombre;
        private int salario;

        // Constructor sin argumentos
        public Empleado() {
        }

        // Constructor del JavaBean
        public Empleado(String nombre, int salario) {
            this.nombre = nombre;
            this.salario = salario;
        }

        // Getters y Setters
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getSalario() {
            return salario;
        }

        public void setSalario(int salario) {
            this.salario = salario;
        }

        @Override
        public String toString() {
            return "Empleado{" +
                    ", nombre='" + nombre + '\'' +
                    ", salario=" + salario +
                    '}';
        }

    }


    public static void main(String[] args) throws IOException {

        File archivo = new File("empleados.dat");
        FileOutputStream fos = new FileOutputStream(archivo);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        Empleado e1 = new Empleado("Juan", 1000);
        Empleado e2 = new Empleado("Pedro", 2000);
        Empleado e3 = new Empleado("Maria", 3000);

        oos.writeObject(e1);
        oos.writeObject(e2);
        oos.writeObject(e3);

        oos.close();


    }


}
