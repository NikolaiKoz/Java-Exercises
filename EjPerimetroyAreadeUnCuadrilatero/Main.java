package EjPerimetroyAreadeUnCuadrilatero;

public class Main {

    public static void main(String[] args) {

        Cuadrilatero c1 = new Cuadrilatero(2, 3);
        Cuadrilatero c2 = new Cuadrilatero(4);

        System.out.println("Area del cuadrilatero 1: " + c1.getArea());
        System.out.println("Perimetro del cuadrilatero 1: " + c1.getPerimetro());

        System.out.println("Area del cuadrilatero 2: " + c2.getArea());
        System.out.println("Perimetro del cuadrilatero 2: " + c2.getPerimetro());

    }

}
