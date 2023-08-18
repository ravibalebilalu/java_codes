import java.util.LinkedList;
import java.util.Scanner;
 
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
class Task{
   private String title;
    private String description;
    private String status;
    private String due_date;
    void display(){
        System.out.println(
            "Title :" + title  + "\n" +
            "Description :" +  description+ "\n" +
            "Status :" +  status + "\n" +
            "Due date :" +  due_date
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
    public void setDueDate(int time_for_task){
       LocalDate dateToday = LocalDate.now();
       LocalDate target_date = dateToday.plusDays(time_for_task);
       DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("dd-MM-yyyy");
       this.due_date = target_date.format(formatDate);


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

        System.out.println("How many days you plan :");
        int due_date = selector.nextInt();
        task.setDueDate(due_date);

        
        
        return task;
}

    public static void main(String[] args) {
         
Scanner inString = new Scanner(System.in);
LinkedList <Task>todolist = new LinkedList<Task>();


int flag = 1;
 while ((flag == 1) | (flag == 2) | (flag == 3) | (flag == 4) && (flag != 5) ){


Scanner selector = new Scanner(System.in);
 System.out.println("\n*****Select options*****\n");
 System.out.println("1 for display tasks");
 System.out.println("2 for adding new tasks");
 System.out.println("3 for removing tasks");
 System.out.println("4 for edit tasks");
 System.out.println("5 for exit\n");

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
      } else if (selection == 4){
        //display the task list
        int count = 1;
        System.out.println("Select the task number :");
        for(Task t:todolist){
            System.out.println(count + " : " + t.getTitle());
            count++;
        }
        //select the task number
        int taskNumber  = selector.nextInt();
        Task for_edit = todolist.get(taskNumber - 1);
        //edit title
        String old_title = for_edit.getTitle();
        System.out.println(old_title);
        System.out.println("Enter new Title ");
        String new_title = inString.nextLine();
        
        if (new_title.length() > 0){
        for_edit.setTitle(new_title);
         }

         //edit description
          
         String old_description = for_edit.getDescription();
         System.out.println(old_description);
         System.out.println("Enter new Desciption ");
         String new_description = inString.nextLine();

         if(new_description.length() > 0){
            for_edit.setDescription(new_description);
         }

         //edit status
         String old_status = for_edit.getStatus();
         System.out.println(old_status);
         System.out.println("Enter new status");
         String new_status = inString.nextLine();

         if (new_status.length() > 0){
            for_edit.setStaus(new_status);
         }

         //edit due date
        String old_date = for_edit.getDueDate();
        System.out.println(old_date);
        System.out.println("Enter how many days  you plan?");
        String new_date = inString.nextLine();

        if(new_date.length() > 0){
            int newIntdate = Integer.parseInt( new_date);
            for_edit.setDueDate(newIntdate);   

        }
      
        }
      
    
     
     if (flag == 5){
        selector.close();
        inString.close();
     }
    }
   } 
}

 
