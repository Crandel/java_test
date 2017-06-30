package testApp;

import java.util.Scanner;

public class Basics {
  static int x;
  static String name = "Def name";
  static String username;

  static {
    x = 5;
  }

  public Basics() {
    // Fill second constructor with Default value
    this("Default name");
    System.out.println("Constructor without args");
  }

  public Basics(String classname) {
    name = classname;
    System.out.format("One arg constructor with name: %s\n", name);
  }

  public static void run() {
    input();
    vars();
  }

  public static void vars() {
    System.out.println(x);
    int y = 6;
    System.out.println(6/x + 5*y);
    int z = x;
    System.out.println(z);
    z = 13;
    System.out.format("x is %d and z is %d\n", x, z);
    System.out.format("Class %s from user %s\n", name, username);
  }

  public static void input() {
    System.out.println("Please enter your name");
    Scanner scan = new Scanner(System.in);
    username = scan.nextLine();
  }
}
