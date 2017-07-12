package testApp;

import java.util.concurrent.ThreadLocalRandom;
import java.nio.file.*;
import java.util.*;
import java.util.stream.*;

public class StringGenerator {

  private String filePath;
  private List<String> lines = new ArrayList<String>();

  public StringGenerator() throws java.io.IOException {
    this("src/resources/lorem.txt");
  }

  public void setNewLine(String line){
    this.lines.add(line);
  }

  public StringGenerator(String path) throws java.io.IOException {
    this.filePath = path;
    Stream<String> stream = Files.lines(Paths.get(filePath));
    lines = stream
      .map(s -> s.split("\\s+"))
      .flatMap(Arrays::stream)
      .map(a -> a.replaceAll("[^a-zA-Z0-9]", ""))
      .collect(Collectors.toList());
  }

  public String generate() {
    int random = ThreadLocalRandom.current().nextInt(0, lines.size());
    return lines.get(random);
  }
}
