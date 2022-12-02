import java.io.*;


public class Main {
    public static void main(String[] args) {

        //Crea un archivo en la ruta actual
        File archivo = new File("archivo.txt");
        //Si el archivo no existe, lo crea
        if (!archivo.exists()) {
            try {
                archivo.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        //Escribe 5 nombres en el archivo
        try {
            FileWriter fw = new FileWriter(archivo);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Juan");
            bw.newLine();
            bw.write("Pedro");
            bw.newLine();
            bw.write("Maria");
            bw.newLine();
            bw.write("Jose");
            bw.newLine();
            bw.write("Luis");
            bw.newLine();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Lee el archivo y lo muestra por pantalla
        try {
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

}

}