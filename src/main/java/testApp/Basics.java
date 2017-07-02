package testApp;

import java.util.Scanner;

public class Basics {
  static int x = 3;
  private int ux = 0;
  private double ud = 0.0;
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
    this.setUsername("Default username");
    System.out.println("Constructor without args");
  }

  public Basics(String name) {
    this.setName(name);
    System.out.format("One arg constructor with name: %s\n", getName());
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getUx() {
    return ux;
  }

  public void setUx(int ux) {
    this.ux = ux;
  }

  public double getUd() {
    return ud;
  }

  public void setUd(double ud) {
    this.ud = ud;
  }

  public void run() {
    input();
    vars();
  }

  private void vars() {

    System.out.println(x);
    int y = 6;
    System.out.println(6 / x + 5 * y);
    int z = x;
    System.out.println(z);
    z = 13;
    System.out.format("x is %d and z is %d\n", x, z);
    System.out.format("Class %s from user %s\n", this.getName(), this.getUsername());
  }

  private void input() {
    System.out.println("Please enter something");
    if (userInput.hasNextInt()) {
      setUx(userInput.nextInt());
    } else if (userInput.hasNextDouble()) {
      setUd(userInput.nextDouble());
    } else if (userInput.hasNextLine()) {
      setUsername(userInput.nextLine());
    }
    System.out.format("username is %s, ux is %d, ud is %3.4f\n", getUsername(), getUx(), getUd());
  }
}
