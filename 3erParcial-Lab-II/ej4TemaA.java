import java.io.*;

public class ej4TemaA {

    public static void main(String[] args) throws IOException {

        int[] numeros = new int[75];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
        }

        File archivo = new File("numeros.txt");
        FileWriter fw = new FileWriter(archivo);
        BufferedWriter bw = new BufferedWriter(fw);

        for (int i = 0; i < numeros.length; i++) {
            bw.write(numeros[i]);
            bw.newLine();
        }

        bw.close();

        FileReader fr = new FileReader(archivo);
        BufferedReader br = new BufferedReader(fr);
        String linea = br.readLine();
        int contador = 0;

        while (linea != null && contador < 50) {
            System.out.println("linea: n:" + contador + " " + linea);
            linea = br.readLine();
            contador++;
        }

        br.close();

    }

}

//Funciona, crea y muestra los primero 50 caracteres.
