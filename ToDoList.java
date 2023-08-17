import java.nio.channels.Selector;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
class Task{
   private String title;
    private String description;
    private String status;
    private String due_date;
    void display(){
        System.out.println(
            title  + "\n" +description+ "\n" + status + "\n" + due_date
        );
    }
    //title
    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return title;
    }

     
    
    //description
    public void setDescription(String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }

     
    //status
    public void setStaus(String status){
        this.status = status;
    }

    public String getStatus(){
        return status;
    }

     
    //due_date
    public void setDueDate(String date){
        this.due_date = date;
    }

    public String getDueDate(){
        return due_date;
    }

     
}




public class ToDoList{

//add new task

     static Task  new_task(){
        Scanner selector = new Scanner(System.in);
        Task task = new Task();
        

        System.out.println("Add title:");
        String title = selector.nextLine();
        task.setTitle(title);

        System.out.println("Add description:");
        String description = selector.nextLine();
        task.setDescription(description);

        System.out.println("Add status:");
        String status = selector.nextLine();
        task.setStaus(status);

        System.out.println("Add due date:");
        String due_date = selector.nextLine();
        task.setDueDate(due_date);
        
        return task;
}

    public static void main(String[] args) {
         
LinkedList <Task>todolist = new LinkedList<Task>();


int flag = 1;
 while (flag == 1 | flag == 2 | flag == 3 ){


Scanner selector = new Scanner(System.in);
 System.out.println("\n*****Select options*****\n");
 System.out.println("1 for display tasks");
 System.out.println("2 for adding new tasks");
 System.out.println("3 for removing tasks\n");

 int selection = selector.nextInt();
 flag = selection;
 

 if (selection == 1 ){
    if (todolist.size() > 0){
    for(Task t:todolist){
        t.display();}
      }  else{System.out.println("There is no tasks to display!");
    }
    
    }
    
    else if(selection == 2){
        todolist.add(new_task());
        
    }
    else if (selection == 3){
        System.out.println("You have "+ todolist.size() + " tasks.Which task you want to remove?");
        if (todolist.size() > 0){
            int count = 1;
            for(Task t:todolist){
                System.out.println(count + " : " + t.getTitle());
                count++;
            }
         
        int task_index = selector.nextInt();
        todolist.remove(task_index - 1);
        System.out.println("Selected task is succusfully deleated!");
    }
        else {
            System.out.println("There is no tasks to remove!");
       }
      }
     }    
   }    
 }
