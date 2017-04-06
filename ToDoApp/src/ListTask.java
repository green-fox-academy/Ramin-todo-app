import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by HP on 4/6/2017.
 */
public class ListTask {

  public String[] readFile() {
    Path filePath = Paths.get("ListTask.txt");
    String[] text = new String[0];
    try {
      List<String> lines = Files.readAllLines(filePath);
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

  public void write (String string ) {
    List<String> content = new ArrayList();
    content.add(string);
    try { // Required by Files.write(filePath, content)
      // Creates a new file if not exists and overwrites it's content
      // The elements of the content lists will become the lines of the file
      Path filePath = Paths.get("modifiedListTask.txt");
      Files.write(filePath, content);
    } catch (Exception e) {
      System.out.println("Uh-oh, could not write the file!");
    }
  }
}
