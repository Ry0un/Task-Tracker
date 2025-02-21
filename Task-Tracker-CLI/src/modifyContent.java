import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class modifyContent {

  private static ArrayList<String> list = new ArrayList<>();
  private static int fileSize=0;
  private int test =0;

  public modifyContent(){
      readFile();
  }

  public void modifyFile(int idToModify){
      for (int i=1;i<list.size();i++){
          if(i==idToModify){
              String modifier = list.get(idToModify);

          }
      }

      try(FileWriter writer = new FileWriter(writeTask.file)){
          writer.write(list.toString());
      }catch (IOException e){
          e.printStackTrace();
      }

  }

    public int getFileSize() {
        return fileSize-1;
    }

    private static void readFile(){
      list.clear();
      list.add(" ");
      try{
          Scanner scanner  = new Scanner(writeTask.file);
          while (scanner.hasNextLine()){
              list.add(scanner.nextLine());
          }
          fileSize=list.size();

      } catch (FileNotFoundException e) {
          throw new RuntimeException(e);
      }
  }

}
