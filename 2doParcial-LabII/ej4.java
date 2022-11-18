public class ej4 extends Thread {
    public static void main (String [] args) {
      System.out.print(Thread.currentThread().getId() + " ");
      Thread t1 = new Thread(new ej4 ());
      Thread t2 = new Thread(new ej4 ());
     t1.start ();
     t2.run();
    }
    public void run() {
      for (int i = 0; i < 2; i++)
        System.out.print(Thread.currentThread().getId() + " ");

    }
}
