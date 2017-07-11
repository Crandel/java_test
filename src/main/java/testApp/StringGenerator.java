package testApp;

import java.util.concurrent.ThreadLocalRandom;
import java.util.*;

public class StringGenerator {

  private String filePath;
  private List<String> lines = new ArrayList<String>();

  public StringGenerator() throws java.io.IOException {
    this("src/resources/lorem.txt");
  }

  public StringGenerator(String path) throws java.io.IOException {
    this.filePath = path;
    Scanner sc = new Scanner(new java.io.File(filePath));
    while (sc.hasNextLine()) {
      String row = sc.nextLine();
      String[] rowsArray = row.split("\\s+");
      for (int i = 0; i < rowsArray.length; i++) {
        lines.add(rowsArray[i].replaceAll("[^a-zA-Z0-9]", ""));
      }
    }
  }

  public String generate() {
    int random = ThreadLocalRandom.current().nextInt(0, lines.size());
    return lines.get(random);
  }
}
