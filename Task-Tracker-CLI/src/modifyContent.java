import java.io.FileNotFoundException;
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
              System.out.println(list.get(i));
          }
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
