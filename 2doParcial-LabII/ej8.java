//scanner
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ej8 {

    public static void main(String[] args) {
        int numero;
        List<Integer> lista = new ArrayList<Integer>();

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Introduce un numero: ");
            numero = scanner.nextInt();
            lista.add(numero);

        }
        scanner.close();

        //Ordenar lista de mayor a menor
        for (int i = 0; i < lista.size(); i++) {
            for (int j = 0; j < lista.size(); j++) {
                if (lista.get(i) > lista.get(j)) {
                    int aux = lista.get(i);
                    lista.set(i, lista.get(j));
                    lista.set(j, aux);
                }
            }
        }

        System.out.println("\n\n\nLista ordenada de mayor a menor:\n\n\n");

        //Mostrar lista
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }


}
