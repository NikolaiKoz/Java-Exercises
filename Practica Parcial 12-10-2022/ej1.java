public class ej1{
    public static void main(String[] args) {


        System.out.println(entero(9, 5));
        System.out.println(entero(7, 0));
        System.out.println(entero(0, 0));
        System.out.println(entero(7, 5));


    }
    public static int entero (int a, int b){
        if (a == 0 || b == 0){
            return 0;
        } else if (a == 1){
            return b;
        } else if (b == 1){
            return a;
        } else {
            return a+entero(a, b - 1);
        }
    }

}

