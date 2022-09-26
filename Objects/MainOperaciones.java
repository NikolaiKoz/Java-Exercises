package Objects;

import javax.swing.JOptionPane;

public class MainOperaciones {

    public static void main (String args[]){

        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero"));


        Operacion op = new Operacion();

        int sumar = op.sumar(n1,n2);
        int restar = op.resta(n1,n2);
        op.mostrarResultados(sumar, restar);
        System.out.println("La division es: " + op.division(n1,n2));
        System.out.println("La multiplicacion es: " + op.multiplicacion(n1,n2));

    }
}
