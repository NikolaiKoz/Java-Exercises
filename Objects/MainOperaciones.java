package Objects;

import javax.swing.JOptionPane;

public class MainOperaciones {

    public static void main (String args[]){

        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero"));


        Operacion op = new Operacion();

        op.sumar(n1,n2);
        op.resta(n1,n2);
        op.division(n1,n2);
        op.multiplicacion(n1,n2);
        op.mostrarResultados();

    }
}
