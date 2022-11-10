
public class coche {
    //Atributos
    String color;
    String marca;
    int km;


    //Metodo
    public static void main(String[] args) {

        coche coche1 = new coche(); //Creo la instancia y le otorgo atributos.
        coche1.color = "Rojo";
        coche1.marca = "Ferrari";
        coche1.km = 0;

        coche coche2 = new coche();
        coche2.color = "Azul";
        coche2.marca = "Seat";
        coche2.km = 30000;

        System.out.println("El coche 1 es de color " + coche1.color + " y marca " + coche1.marca + " y tiene " + coche1.km + " km");
        System.out.println("El coche 2 es de color " + coche2.color + " y marca " + coche2.marca + " y tiene " + coche2.km + " km");
    }
}