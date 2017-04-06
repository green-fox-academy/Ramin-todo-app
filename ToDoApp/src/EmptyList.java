import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Created by HP on 4/6/2017.
 */
public class EmptyList {
  public String[] outPut() {
    Path filePath = Paths.get("EmptyList.txt");
    String[] text = new String[0];
    try {
      List<String> lines = Files.readAllLines(filePath);
      if (lines.size() == 0) {
        System.out.println("No todos for today! :)");
      }
      text = new String[lines.size()];
      for (int i = 0; i < lines.size(); i++) {
        text[i] = lines.get(i);
      }
      return text;
    } catch (IOException e) {
      System.out.println("Uh-oh, could not read the file!");
    }
    return text;
  }
}
