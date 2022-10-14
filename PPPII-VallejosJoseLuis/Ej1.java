/*
 * Escriba (con libre criterio) un programa en Lenguaje JAVA, que muestre un "menú de usuario" básico de 3 Opciones por Consola, permitiendo ingresar por teclado valores numéricos para cada Opción.  Utilice las estructuras SWITCH - CASE - [DEFAULT] para implementar el "menú", y TRY - CATCH - [FINALLY] para controlar errores.-
 */

import java.util.Scanner;
class Ej1{
    public static void main(String[] args) {
        election();
    }
    public static void election(){
        Scanner read    = new Scanner(System.in);
        String answer;
        System.out.println("\nIngrese un valor entero del 1 al 3:\t");
        answer          = read.nextLine();
        Opciones(answer);
        read.close();
    }
    public static void Opciones(String answer){
        Scanner read    = new Scanner(System.in);
        int elections;
        try {
            elections   = Integer.parseInt(answer);
            switch (elections) {
                case 1  :
                    System.out.println("\nEsta es la opcion 1.");
                    break;
                case 2  :
                    System.out.println("\nEsta es la opcion 2.");
                    break;
                case 3  :
                    System.out.println("\nEsta es la opcion 3.");
                    break;
                default :
                System.out.println("\nIngreso una opcion invalida.");
                    break;
            }
        } catch (Exception e) {
            System.out.println("\nOcurrio un error inesperado.");
        }
        finally{
            }
            System.out.println("\nDesea continuar?\nIngrese 1 para si o 2 para finalizar.");
            elections   = read.nextInt();
            try {
                if(elections == 1){
                    election();
                } else if (elections == 2){
                    System.out.println("\nMuchas gracias!");
                } else if( elections != 1 || elections != 2){
                    System.out.println("\nSe ingreso un valor invalido.");
                    election();
                }
            } catch (Exception e) {
                System.out.println("\nSe ingreso un valor invalido.");
                election();
            }
            read.close();
        }
}
