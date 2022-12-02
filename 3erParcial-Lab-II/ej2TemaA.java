import java.io.*;

public class ej2TemaA {

    public static void main(String[] args) throws IOException {

        File archivoOriginal = new File("archivoOriginal.txt");
        File ArchivoClon = new File("ArchivoClon.txt");

        FileReader fr = new FileReader(archivoOriginal); //Abre el archivo en modo lectura
        FileWriter fw = new FileWriter(ArchivoClon); //Abre el archivo en modo escritura
        BufferedReader br = new BufferedReader(fr);
        BufferedWriter bw = new BufferedWriter(fw);
        String linea = br.readLine();

        while (linea != null) {
        bw.write(linea);
        bw.newLine();
        linea = br.readLine();
        }

        br.close();
        bw.close();

        FileReader fr2 = new FileReader(ArchivoClon);
        BufferedReader br2 = new BufferedReader(fr2);
        String linea2 = br2.readLine();
        while (linea2 != null) {
        System.out.println(linea2);
        linea2 = br2.readLine();
        }
        br2.close();

    }

}

//Funciona, solo re requiere que el archivo archivoOriginal.txt exista en la carpeta del proyecto y se llame asi.
