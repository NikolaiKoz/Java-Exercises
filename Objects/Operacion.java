package Objects;

// import javax.swing.JOptionPane;

public class Operacion {

    //Atributos...


    //Metodos...

    //Metodo para sumar ambos numeros
    public int sumar(int numero1, int numero2){
        int suma = numero1 + numero2;
        return suma;
    }

    //Metodo para restar ambos numeros
    public int resta(int numero1, int numero2){
        int resta = numero1 - numero2;
        return resta;
    }

    //Metodo para multiplicar ambos numeros
    public int multiplicacion(int numero1, int numero2){
        int multiplicacion = numero1 * numero2;
        return multiplicacion;
    }

    //Metodo para dividir ambos numeros
    public int division(int numero1, int numero2){
        int division = numero1 / numero2;
        return division;
    }

    // Mostrar resultados
    public void mostrarResultados( int suma, int resta){
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);

    }

    public void readNumbers() {
    }

    public void add() {
    }

    public void substract() {
    }

    public void multiply() {
    }

    public void divide() {
    }

    public void showResults() {
    }
}
