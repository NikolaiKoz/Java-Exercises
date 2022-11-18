public class ej3 {
    public static void main (String[] args){
      String s = "12";
     s.concat ("ab");
    s = go (s);
     System.out.println (s);
    }
    static String go (String s) {
     s.concat ("56");
      return s;
    }
}
