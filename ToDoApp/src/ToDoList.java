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
public class ToDoList {
  public List<ToDo> listOfThings;

  public ToDoList() {
    listOfThings = new ArrayList<>();
  }

  public void add(ToDo thing) {
    listOfThings.add(thing);
  }

public void add(String newThingToDo){
  ToDo newToDo = new ToDo(newThingToDo);
  listOfThings.add(newToDo);
  System.out.println(listOfThings);
//  System.out.println(Arrays.toString(args));
  /////////////////////////////////////////////////// writing to txt file
  List<String> content = new ArrayList();
  for (int i = 0; i < listOfThings.size(); i++) {
    content.add(listOfThings.get(i).nameOfToDos());
  }
  try {
    Path filePath = Paths.get("ListTask.txt");
    Files.write(filePath, content);
  } catch (Exception e) {
    System.out.println("Uh-oh, could not write the file!");
  }
}

  @Override                      ///Show in Terminal
  public String toString() {
    String result = "";
    for (int i = 0; i < listOfThings.size(); i++) {
      result += (i + 1) + ". " + listOfThings.get(i) + "\n";
    }
    return result;
  }
}
