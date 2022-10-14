/*
 * Escriba (con libre criterio) un programa en Lenguaje JAVA, que cumplimente el Patrón JAVABean; y que calcule la SUPERFICIE de un Rectángulo, con sus valores de ALTO y ANCHO ingresados por teclado, mostrando el resultado por Consola.-
 */

import java.util.Scanner;
import java.io.Serializable;
public class Area implements Serializable {

    private float alto;
    private float ancho;

    public float getAlto(){
        return alto;
    }

    public float getAncho(){
        return ancho;
    }

    public void setAlto(float alto){
        this.alto       = alto;
    }

    public void setAncho(float ancho){
        this.ancho      = ancho;
    }

    public Area(float alto, float ancho){
        super();
        this.alto       = alto;
        this.ancho      = ancho;
    }

    public Area () {
        super();
    }


    public static void main(String[] args) {
        Scanner read    = new Scanner(System.in);
        float ancho;
        float alto;
        System.out.println("Ingrese el alto: \t");
        alto            = read.nextFloat();
        System.out.println("Ingrese el ancho: \t");
        ancho           = read.nextFloat();
        Area a1         = new Area(alto, ancho);

        System.out.println("\n\n\nLa superficie es: " + Area2(a1.alto, a1.ancho));
        read.close();
    }

    public static float Area2(float alto, float ancho){

        return (alto * ancho);
    }


}
