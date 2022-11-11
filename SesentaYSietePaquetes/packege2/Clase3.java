package SesentaYSietePaquetes.packege2;

import SesentaYSietePaquetes.packege1.Clase1;

public class Clase3 {
    public static void main(String[] args) {

        Clase1 object1 = new Clase1();

        object1.setedad(20);
        object1.setnombre("Juan");

        System.out.println("Nombre: " + object1.getnombre());
        System.out.println("Edad: " + object1.getedad());

    }
}
