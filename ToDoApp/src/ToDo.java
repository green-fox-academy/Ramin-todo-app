import java.util.List;

/**
 * Created by HP on 4/6/2017.
 */
public class ToDo {
  private String name;
  private boolean completed;

  public ToDo (){

  }

  public ToDo(String name) {
    this.name = name;
    this.completed = false;
  }
  public ToDo(String name, boolean completed) {
    this.name = name;
    this.completed = false;
  }

  public void getCompleated(boolean completed) {

  }

  public void setCompleted(boolean completed) {
    this.completed = true;
  }

  public boolean isCompleted() {
    return completed;
  }


  @Override         ///Show in Terminal
  public String toString() {
   return (completed ? "[x] " : "[ ] ") + name;
  }

  public String nameOfToDos() {
   return name;
  }
}
