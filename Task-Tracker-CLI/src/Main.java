import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        writeTask task = new writeTask();
        boolean taskTracker = true;
        int id =0;

        while (taskTracker){

            System.out.print("What do you want to do?: ");
            System.out.print("|| \u001B[36m Write a Task [A] ");
            System.out.print(" \u001B[0m || \u001B[35m Modify a Task [M] ");
            System.out.print(" \u001B[0m || \u001B[34m Quit [Q] \u001B[0m :");
            String test = scanner.nextLine();

            switch(test){
                case "A":
                case "a":
                    System.out.print("Write a Task: ");
                    String taskWriting =scanner.nextLine();
                    Task task1 =new Task(taskWriting);
                    task1.setId(id+=1);
                    task.addTask(task1);
                    break;
                case "M":
                case "m":
                    modifyContent taskM = new modifyContent();
                    if(taskM.getFileSize() ==0){
                        System.out.println("There are no tasks to modify");
                    }else {
                        System.out.print("What task do you want to change [id max = "+taskM.getFileSize()+"] :");
                        int idToModify = scanner.nextInt();
                        scanner.nextLine();
                        if(idToModify <1){
                            System.out.println("The minimum id is 1");
                        }else{
                            System.out.println("emd");
                        }
                    }
                    break;
                case "Q":
                case "q":
                    System.out.println("Bye!");
                    taskTracker =false;
                    break;
                default:
                    System.out.println("Invalid option. Please enter A, M, or Q.");
            }


        }







    }

}