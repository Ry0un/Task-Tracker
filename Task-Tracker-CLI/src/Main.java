import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        writeTask task = new writeTask();
        System.out.print("Write a Task: ");
        String test = scanner.nextLine();
        Task task1 = new Task(test);

        task.addTask(task1);




    }

}