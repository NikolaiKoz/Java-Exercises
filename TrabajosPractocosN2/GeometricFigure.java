/*
 *Defina los atributos y métodos que considere necesario para la clase FIGURA
GEOMETRICA. Luego cree una clase RECTANGULO, CIRCULO, CUADRADO,
RECTANGULO, TRIANGULO que hereden de la clases anterior, y agregue los
atributos y métodos propios que considere convenientes.
 */

 public class GeometricFigure{

    private double base;
    private double height;
    private double radius;

    //Constructor

    public GeometricFigure(double base, double height, double radius){
        this.base = base;
        this.height = height;
        this.radius = radius;
    }

    public GeometricFigure( double base, double height){
        this.base = base;
        this.height = height;
    }

    public GeometricFigure(double radius){
        this.radius = radius;
    }

    //Getters and Setters

    public double getBase(){
        return base;
    }

    public void setBase(double base){
        this.base = base;
    }

    public double getHeight(){
        return height;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

 }