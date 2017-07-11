package testApp;

import static java.lang.System.*;

public class Main {
    public static void main( String[] args )
    {
        out.println( "Lets begin our test app!!!" );
        // Basics basic = new Basics();
        // basic.run();
        // NumberGenerator gen1 = new NumberGenerator();
        // NumberGenerator gen2 = new NumberGenerator(30);
        // NumberGenerator gen3 = new NumberGenerator(1, 15);
        // for (int i = 0; i < 100; i++) {
        //   String res1 = gen1.generate();
        //   String res2 = gen2.generate();
        //   String res3 = gen3.generate();
        //   System.out.println(String.format("%d -> Res1: %s, Res2: %s, Res3: %s", i, res1, res2, res3));
        // }
        try {
          StringGenerator sgen = new StringGenerator();
          for (int j = 0; j < 100; j++){
          System.out.println(String.format("%d -> %s", j, sgen.generate()));
          }
        } catch (java.io.IOException e) {
          System.out.println(e);
        }
    }
}
