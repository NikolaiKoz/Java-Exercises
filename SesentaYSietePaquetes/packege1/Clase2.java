package SesentaYSietePaquetes.packege1;

public class Clase2 {
    public static void main(String[] args) {

        // Clase1 object1 = new Clase1();

        // object1.setedad(20);
        // object1.setnombre("Juan");

        // System.out.println("Nombre: " + object1.getnombre());
        // System.out.println("Edad: " + object1.getedad());

        Clase1 object2 = new Clase1(30, "Pedro");

        System.out.println("Nombre: " + object2.getnombre());
        System.out.println("Edad: " + object2.getedad());

    }
}
