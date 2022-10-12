public class Ej2 {
    public static void main(String[] args) {


        System.out.println(expR(2, 3)); //RESPUESTA: 8
        System.out.println(expR(3, 4)); // RESPUESTA: 81

        System.out.println(expR(3, 5)); //CASO DE PRUEBA
        System.out.println(expR(3, 6)); //CASO DE PRUEBA
        System.out.println(expR(3, 7)); //CASO DE PRUEBA
    }

    public static int expR ( int base, int exp){

        int res;

        if(exp == 0){
            res = 1;
        } else{
            res = base * expR(base, exp -1);
        }


        return res;
    }
}


// Este es un algoritmo recursivo para encontrar el resultado de la ponetencia de un numero base (base) elebado a su exponente (exp).
