package SesentayCinco;

public class Persona {

    //Atributes
    String name;
    int age;
    float dni;

    //Constructor
    public Persona(String name, int age, float dni) {
        this.name = name;
        this.age = age;
        this.dni = dni;
    }

    //Overload constructor
    public Persona(String name) {
        this.name = name;
    }

    //Overload constructor age
    public Persona(int age) {
        this.age = age;
    }

    //Overload constructor dni
    public Persona(float dni) {
        this.dni = dni;
    }

    //Methods

    //method run
    public void run() {
        System.out.println("I'm running");
    }

}
