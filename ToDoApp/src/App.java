import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

/**
 * Created by HP on 4/6/2017.
 */
public class App {
  public static void main(String[] args) {

    String[] tasks = readFile();
    ToDoList myList = new ToDoList();
    for (int i = 0; i < tasks.length; i++) {
      ToDo myToDo = new ToDo(tasks[i]);
      myList.add(myToDo);
    }
    System.out.println(myList);
    if (args.length == 0) {
      System.out.println("Java Todo application\n" +
              "=======================\n" +
              "Command line arguments:\n" +
              " -l   Lists all the tasks\n" +
              " -a   Adds a new task\n" +
              " -r   Removes an task\n" +
              " -c   Completes an task");
    }

//    ToDoList myList = new ToDoList();
//    ToDo toDo1 = new ToDo("Walk the dog");
//    myList.add(toDo1);
//    ToDo toDo2 = new ToDo("Buy milk");
//    myList.add(toDo2);
//    ToDo toDo3 = new ToDo("Do homework");
//    myList.add(toDo3);


    //   if (args[0].equals("-l")) {
    //     ListTask myLisTask = new ListTask();
    //     String[] list = myLisTask.readFile();
    //     for (int i = 0; i < list.length; i++) {
    //       System.out.println((i + 1) + " - " + list[i] + "\n");
    //    }
    //   }
    if (args[0].equals("-l")) {
      EmptyList myEmptyList = new EmptyList();
      myEmptyList.outPut();
    }

    if (args[0].equals("-a")) {
//      ToDoList mylist = new ToDoList();
//      mylist.add();
//      System.out.println(args[1].toString());
    }
    ToDo toDo4 = new ToDo(args[1].toString());
    myList.add(toDo4);
    //   System.out.println(myList);
    //   myList.readFile();
//    String[] list = myList.readFile();
//    for (int i = 0; i < list.length; i++) {
//      System.out.println((i + 1) + " - " + list[i] + "\n");
//    }
  }

  public static String[] readFile() {
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
}
