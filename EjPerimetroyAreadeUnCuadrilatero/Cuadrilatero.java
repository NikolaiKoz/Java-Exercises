package EjPerimetroyAreadeUnCuadrilatero;

public class Cuadrilatero {

    //Attributes
    private double lado1;
    private double lado2;

    //Constructor 1
    public Cuadrilatero(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    //Constructor 2
    public Cuadrilatero(double lado1) {
        this.lado1 = lado1;
        this.lado2 = lado1;
    }

    //Getters

    public double getArea() {
        return lado1 * lado2;
    }

    public double getPerimetro() {
        return 2 * (lado1 + lado2);
    }








}
