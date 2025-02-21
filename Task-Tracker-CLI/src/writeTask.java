import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class writeTask {

    public static final File file = new File("Tasks.json");
    private static final StringBuilder sb = new StringBuilder(" ");
    private static final ArrayList<String> list = new ArrayList<>();
    public static final ArrayList<String> tasks = new ArrayList<>();


    public void addTask(Task task){
        String fileTest = readFile().toString();
        list.add(fileTest+task);

        try{
            FileWriter writer = new FileWriter(file);
            writer.write(list.toString());
            writer.close();
        }catch (IOException e){
            System.out.println("Can't write on this file");
        }
        list.clear();
    }


    private static StringBuilder readFile(){
        sb.setLength(0);
        String lines;
        try{
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                lines = scanner.nextLine();
                sb.append(lines).append("\n");
                tasks.add(lines);

            }
        } catch (FileNotFoundException e){
            System.out.println("File does not exist");
        }
        String cleanedContent = sb.toString().replace("[", "").replace("]", ",");
        sb.setLength(0);
        sb.append(cleanedContent);
        return sb;
    }






}
