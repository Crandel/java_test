package testApp;

import java.util.Scanner;

public class Basics {
  static int x = 3;
  private String name = "Def name";
  private String username = "";
  // static means this number is shared by all objects of type Animal
  // final means that this value can't be changed
  public static final double FAVNUMBER = 1.6180;

  static Scanner userInput = new Scanner(System.in);

  // init
  static {
    x++;
  }

  // First constructor
  public Basics() {
    // Fill second constructor with Default value
    this("Default name");
    this.name = "Default name";
    System.out.println("Constructor without args");
  }

  public Basics(String classname) {
    this.name = classname;
    System.out.format("One arg constructor with name: %s\n", name);
  }

  public String getUsername(){
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public void run() {
    input();
    vars();
  }

  private void vars() {

    System.out.println(x);
    int y = 6;
    System.out.println(6/x + 5*y);
    int z = x;
    System.out.println(z);
    z = 13;
    System.out.format("x is %d and z is %d\n", x, z);
    System.out.format("Class %s from user %s\n", this.name, this.username);
  }

  private void input() {
    System.out.println("Please enter your real name");
    username = userInput.nextLine();
  }
}
