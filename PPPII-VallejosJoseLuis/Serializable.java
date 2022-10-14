/*
 * Dada la Clase de la imagen adjunta, diseñe (con libre criterio) una Interfaz que obligue a la misma, a implementar métodos que arrojen por Consola los resultados : a) Total recibido como salario en un año. b) Aguinaldo.
 */

import javax.swing.JOptionPane;

package Empleado;

public interface Serializable{
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Total recibido en un anio    : " + (setSalario(getSalario()) * 12));

        JOptionPane.showMessageDialog(null, "El medio aguinaldo es        : " + (setSalario(getSalario()) / 2));

        JOptionPane.showMessageDialog(null, "El aguinaldo completo es     : " + (setSalario(getSalario())));

    }
}
