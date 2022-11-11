package SetentaStaticMembers;

public class Estatico {

    private static String phrase = "Esta es mi frase";

    // MAIN
    public static void main(String[] args) {

        System.out.println(phrase);

        Estatico estatico = new Estatico();
        System.out.println(estatico.phrase);

        Estatico estatico2 = new Estatico();
        System.out.println(estatico2.phrase);

        estatico2.phrase = "Otra cosa";
        System.out.println(estatico.phrase);
        System.out.println(estatico2.phrase);


    }

}
