/*
 * Escriba (con libre criterio) un programa en Lenguaje JAVA, que defina un TIPO ENUMERATIVO con los sgtes. valores (en este ORDEN DE PRECEDENCIA) : "ABRIL, MAYO, JUNIO, JULIO, ENERO, FEBRERO, DICIEMBRE". Ingresado un valor numérico por teclado, si es PAR debe mostrarse por Consola en el ORDEN DE PRECEDENCIA mencionado; si es IMPAR, debe mostrarse por Consola en el ORDEN DE PRECEDENCIA INVERSO.
 */

import java.util.Scanner;
public class Ej2 {
    public static void main(String[] args) {
        Scanner read    = new Scanner(System.in);
        int answer;
        System.out.println("\nIngrese un valor par o impar:\t");
        answer          = read.nextInt();
        if(answer %2 == 0){
            System.out.println(Dias.ABRIL + ", " + Dias.MAYO + ", " + Dias.JUNIO + ", " + Dias.JULIO + ", " + Dias.ENERO + ", " + Dias.FEBRERO + ", " + Dias.DICIEMBRE );
        } else{
            System.out.println(Dias.DICIEMBRE + ", " + Dias.FEBRERO + ", " + Dias.ENERO + ", " + Dias.JULIO + ", " + Dias.JUNIO + ", " + Dias.MAYO + ", " + Dias.ENERO);
        }
        read.close();
    }
    enum Dias{
        ABRIL, MAYO, JUNIO, JULIO, ENERO, FEBRERO, DICIEMBRE;
    }
}
