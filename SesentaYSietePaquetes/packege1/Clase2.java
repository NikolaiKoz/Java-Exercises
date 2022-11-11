package SesentaYSietePaquetes.packege1;

public class Clase2 {
    public static void main(String[] args) {

        Clase1 object1 = new Clase1();

        object1.setedad(20);
        object1.setnombre("Juan");

        System.out.println("Nombre: " + object1.getnombre());
        System.out.println("Edad: " + object1.getedad());


    }
}
