/*
Deberán crear un programa en Java que permita:

crear un vector de longitud 50 de enteros
cargar el vector con valores enteros positivos de manera aleatoria
mostrar en pantalla el vector desordenado
ordenar el vector de forma ascendente utilizando el método de la burbuja
mostrar en pantalla el vector ordenado
*/

public class bubble{
    public static void main (String[] args){
        int numbers[] = new int [50];
        System.out.println("\n1)Creo el array y lo pueblo con numeros aleatorios");
        numbers = charge(numbers);
        System.out.println("\n2)Se muestra el array desordenado\n");
        show(numbers);
        System.out.println("\n\n3) Ordeno el array\n");
        numbers = order(numbers);
        show(numbers);
        System.out.println("\n\n");
        }
        public static int[] charge(int numbers[]){
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = (int)(Math.random()*50)+1;
            }
            return numbers;
        }
        public static void show(int numbers[]){
            for (int i = 0; i < numbers.length; i++) {
                System.out.print(numbers[i] + ", ");
            }
        }
        public static int[] order(int numbers[]){
            int aux;
            for (int i = 0; i < numbers.length; i++) {
                for (int j = 0; j < numbers.length; j++) {
                    if(numbers[i] < numbers[j]){
                        aux = numbers[i];
                        numbers[i] = numbers[j];
                        numbers[j] = aux;
                    }
                }
            }
            return numbers;
        }
    }

