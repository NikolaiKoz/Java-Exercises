import java.io.*;

public class ej3TemaA {

    public static void main(String[] args) throws IOException {

        File archivo = new File("Ejercicio1.txt");
        FileWriter fw = new FileWriter(archivo);
        BufferedWriter bw = new BufferedWriter(fw);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String linea = br.readLine();

        while (!linea.equals("x")) {
            bw.write(linea);
            bw.newLine();
            linea = br.readLine();
        }

        bw.close();

        //Ahora leemos el archivo y eliminamos los espacios en blanco

        FileReader fr = new FileReader(archivo);
        BufferedReader br2 = new BufferedReader(fr);
        String linea2 = br2.readLine();

        while (linea2 != null) {
            linea2 = linea2.replace(" ", "");
            System.out.println(linea2);
            linea2 = br2.readLine();
        }

        br2.close();

    }

}

//Funciona, para salir del bucle hay que escribir x y dar enter.