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
      ListTask myLisTask = new ListTask();
      String[] outPut = myLisTask.outPut();
      for (int i = 0; i < outPut.length; i++) {
        System.out.println((i + 1) + " - " + outPut[i] + "\n");
      }
    }
    if (args[0].equals("-l")) {
      ListTask myLisTask = new ListTask();
      String[] outPut = myLisTask.outPut();
      //     for (String items : outPut)
//        System.out.println("No todos for today! :)");
    }


    if (args[0].equals("-a")) {
//      ToDoList mylist = new ToDoList();
//      mylist.add();

      System.out.println(args[1].toString());
    }
  }
}
