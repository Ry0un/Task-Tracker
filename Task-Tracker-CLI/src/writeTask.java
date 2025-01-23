import java.io.*;
import java.util.Scanner;

public class writeTask {


    private File file = new File("Task.json");


    public void addTask(Task task){
        StringBuilder sb = new StringBuilder(task.toString());

        String test = readFile();

        if(file.exists() == false || file.length()==0){
            write("["+sb.toString()+"]");
        } else{
            String updatedFile = test.substring(0,test.length()-2)+",\n"+sb.toString()+"\n]";
            write(updatedFile);
        }


    }


    public void write(String task){
        try {
            FileWriter writeT = new FileWriter(file);
            writeT.write(task);
            writeT.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String readFile(){
        StringBuilder data = new StringBuilder();
        try{
            Scanner reader = new Scanner(file);
            while(reader.hasNextLine()){
                data.append(reader.nextLine()).append("\n");
            }
            reader.close();
        }catch (FileNotFoundException e){
            System.out.println("The File does not exist");
            e.printStackTrace();
        }

        return data.toString();
    }








}
