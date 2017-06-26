package testApp;

public class Basics {

  public Basics() {
    // Fill second constructor with Default value
    this("Default name");
    System.out.println("Constructor without args");
  }

  public Basics(final String name) {
    System.out.format("One arg constructor with name: %s\n", name);
  }

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
    System.out.format("x is %d and z is %d\n", x, z);
  }
}
