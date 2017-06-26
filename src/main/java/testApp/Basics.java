package testApp;

public class Basics {
  public static void run() {
    vars();
  }

  public static void vars() {
    int x = 5;
    int y = 6;
    System.out.println(6/x + 5*y);
    int z = x;
    System.out.println(z);
    z = 13;
    System.out.format("x is %d and z is %d", x, z);
  }
}
