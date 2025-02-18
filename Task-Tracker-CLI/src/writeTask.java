import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class writeTask {

    private static final File file = new File("Tasks.json");
    private static final StringBuilder sb = new StringBuilder(" ");
    private static final ArrayList<String> list = new ArrayList<>();


    public void addTask(Task task){
        String fileTest = readFile().toString().replace("[","").replace("]",",");
        list.add(fileTest+task);

        try{
            FileWriter writer = new FileWriter(file);
            writer.write(list.toString());
            writer.close();
        }catch (IOException e){
            System.out.println("Can't write on this file");
        }
    }


    private static StringBuilder readFile(){
        sb.delete(0,sb.length()-1);
        String lines;
        try{
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                lines = scanner.nextLine();
                sb.append(lines).append("\n");

            }
        } catch (FileNotFoundException e){
            System.out.println("File does not exist");
        }
        sb.toString().replace("[","").replace("]","");
        return sb;
    }






}
