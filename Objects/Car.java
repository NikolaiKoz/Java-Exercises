package Objects;

public class Car{
    //Attributes...
    String color;
    String brand;
    int km;




    //Methods...
    public static void main(String args []) {
        Car car1 = new Car();

        car1.brand = "Ford";
        car1.color = "Red";
        car1.km = 1100;

        System.out.println("Brand is: " + car1.brand);
        System.out.println("Color is: " + car1.color);
        System.out.println("KM is: " + car1.km);

        Car car2 = new Car();

        car2.brand = "Chevrolet";
        car2.color = "Blue";
        car2.km = 0;

        System.out.println("Brand is: " + car2.brand);
        System.out.println("Color is: " + car2.color);
        System.out.println("KM is: " + car2.km);

    }
}