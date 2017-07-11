package testApp;

import java.util.concurrent.ThreadLocalRandom;


public class NumberGenerator {

  private int min = 0;
  private int max = 0;

  public NumberGenerator(){
  }

  public NumberGenerator(int max) {
    this.max = max;
  }

  public NumberGenerator(int min, int max) {
    this.min = min;
    this.max = max;
  }

  public String generate(){
    int random = ThreadLocalRandom.current().nextInt(0, 100);

    if (max == 0 || random > 75){
      return "null";
    }
    return Integer.toString(ThreadLocalRandom.current().nextInt(min, max + 1));
  }
}
