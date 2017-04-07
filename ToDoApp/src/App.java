import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
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

    if (args.length == 0) {
      System.out.println("Java Todo application\n" +
              "=======================\n" +
              "Command line arguments:\n" +
              " -l   Lists all the tasks\n" +
              " -a   Adds a new task\n" +
              " -r   Removes an task\n" +
              " -c   Completes an task");
    }

    if (args[0].equals("-l")) {
      System.out.println(myList);
    }

    if (args[0].equals("-l") && tasks.length == 0) {
      System.out.println("No todos for today! :)");
    }

    if (args[0].equals("-a") && args.length == 2) {
      myList.add(args[1].toString());
//      ToDo newToDo = new ToDo(args[1].toString());
//      myList.add(newToDo);
//      System.out.println(myList);
//      System.out.println(Arrays.toString(args));
//      /////////////////////////////////////////////////// writing to txt file
//      List<String> content = new ArrayList();
//      for (int i = 0; i < myList.listOfThings.size(); i++) {
//        content.add(myList.listOfThings.get(i).nameOfToDos());
//      }
//      try {
//        Path filePath = Paths.get("ListTask.txt");
//        Files.write(filePath, content);
//      } catch (Exception e) {
//        System.out.println("Uh-oh, could not write the file!");
//      } ////////////////////////////////////////////////////////////////
    } else if (args[0].equals("-a") && args.length == 1) {
      System.out.println("Unsupported argument or Unable to add: no task provided");
    }

    if (args[0].equals("-r") && Integer.parseInt(args[1]) <= myList.listOfThings.size()) {
      myList.listOfThings.remove(Integer.parseInt(args[1]) - 1);
      System.out.println(myList);
      /////////////////////////////////////////////// writing to txt file
      List<String> content = new ArrayList();
      for (int i = 0; i < myList.listOfThings.size(); i++) {
        content.add(myList.listOfThings.get(i).nameOfToDos());
      }
      try {
        Path filePath = Paths.get("ListTask.txt");
        Files.write(filePath, content);
      } catch (Exception e) {
        System.out.println("Uh-oh, could not write the file!");
      }
      ///////////////////////////////////////////////////////////////
    } else if (args[0].equals("-r")) {
      System.out.println("Unsupported argument. Enter an index between " + 1 + " and " + myList.listOfThings.size());
    }

    if (args[0].equals("-c") && Integer.parseInt(args[1]) <= myList.listOfThings.size()) {
      myList.listOfThings.get(Integer.parseInt(args[1]) - 1).setCompleted(true);
      System.out.println(myList);
    } else if (args[0].equals("-c")) {
      System.out.println("Index is out of order");
    }
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
