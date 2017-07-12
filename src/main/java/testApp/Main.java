package testApp;

import static java.lang.System.*;
import testApp.ClassesExample.Child;

public class Main {
  public static void main(String[] args) {
    out.println("Lets begin our test app!!!");
    /*

    // Basic test

    Basics basic = new Basics();
    basic.run();
    */

    /*
    // NumberGenerator test

    NumberGenerator gen1 = new NumberGenerator();
    NumberGenerator gen2 = new NumberGenerator(30);
    NumberGenerator gen3 = new NumberGenerator(1, 15);
    for (int i = 0; i < 100; i++) {
    String res1 = gen1.generate();
    String res2 = gen2.generate();
    String res3 = gen3.generate();
    System.out.println(String.format("%d -> Res1: %s, Res2: %s, Res3: %s", i, res1, res2, res3));
    }
    */

    // StringGenerator test

    try {
      StringGenerator sgen = new StringGenerator();
      for (int j = 0; j < 100; j++) {
        String res = sgen.generate();
        if (res != null) {
          switch (res.length()) {
            case 5:
              System.out.println(String.format("%d -> %s 5 length", j, res));
              break;
            case 4:
              System.out.println(String.format("%d -> %s 4 length", j, res));
              break;
            case 3:
              System.out.println(String.format("%d -> %s 3 length", j, res));
              break;
            case 2:
              System.out.println(String.format("%d -> %s 2 length", j, res));
              break;
            case 1:
              System.out.println(String.format("%d -> %s 1 length", j, res));
              break;
            default:
              System.out.println(String.format("%d -> %s greater 5 length", j, res));
          }
        } else {
          System.out.println("Get null");
        }
      }
    } catch (java.io.IOException e) {
      System.out.println(e);
    }

    /*
    // ClassesExample test

    ClassesExample clasex = new ClassesExample();
    ClassesExample.Child emptyChild = clasex.new Child();
    System.out.println("**********************");
    ClassesExample.Child firstChild = clasex.new Child(77);
    System.out.println("----------------------");
    ClassesExample.Child secondChild = clasex.new Child(77, 100);
    System.out.println("++++++++++++++++++++++");
    emptyChild.prn();
    firstChild.prn();
    secondChild.prn();
    */
  }
}
