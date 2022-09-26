package Objects1;

public class Persona {

    //Atributos.
    String name;
    String lastName;
    int age;

    //Metodos.

    //Metodo constructor.
    public Persona(String name, String lastName, int age){
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }


    //Metodo mostrar.

    public void mostrarDatos(){
        System.out.println("\nEl nombre es: " + name);
        System.out.println("El Apellido es: " + lastName);
        System.out.println("La edad es: " + age);
    }
}
