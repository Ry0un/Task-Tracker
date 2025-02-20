import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        writeTask task = new writeTask();
        boolean taskTracker = true;

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
                    task.addTask(task1);
                    break;
                case "M":
                case "m":
                    System.out.println("Cant modify yet you will have to wait");
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