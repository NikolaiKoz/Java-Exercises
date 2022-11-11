package SesentayCinco;

public class Main {
    public static void main(String[] args) {

        Persona persona1 = new Persona("Juan", 20, 12345678);
        Persona persona2 = new Persona("Pedro");
        Persona persona3 = new Persona(30);
        Persona persona4 = new Persona(12345678);

        System.out.println("Persona 1: " + persona1.name + " " + persona1.age + " " + persona1.dni);
        System.out.println("Persona 2: " + persona2.name);
        System.out.println("Persona 3: " + persona3.age);
        System.out.println("Persona 4: " + persona4.dni);

        persona1.run();
        persona2.run();
        persona3.run();
        persona4.run();

    }
}
