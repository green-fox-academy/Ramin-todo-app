import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by HP on 4/6/2017.
 */
public class ToDoList {
  public List<ToDo> listOfThings;

  public ToDoList() {
    listOfThings = new ArrayList<>();
  }

  public void add(ToDo thing) {
    listOfThings.add(thing);
  }



  @Override
  public String toString() {
    String result = "";
    for (int i = 0; i < listOfThings.size(); i++) {
      result += (i + 1) + ". " + listOfThings.get(i) + "\n";
    }
    return result;
  }
}
