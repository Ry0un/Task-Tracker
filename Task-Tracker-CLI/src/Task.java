import java.time.LocalDate;

public class Task {
    private String description;
    private int id;
    private String createDate;
    private String updateDate;
    private LocalDate creationDate;


    public Task(String description){
        creationDate = LocalDate.now();
        this.description = description;
        this.createDate = creationDate.toString();
        this.id = 0;
        this.updateDate = "today";

    }

    public String getDescription(){
        return description;
    }

    public int getId(){
        return id;
    }


    public String getCreationDate(){
        return createDate;
    }
    public String getUpdateDate(){
        return updateDate;
    }

    public void setId(int newId){
        this.id = newId;
    }

    public void setTaskName(String newName){
        this.description = newName;
    }


    public String toString(){
        return "{ "+"\"Task\":"+"\""+description+"\", "+"\"ID \":"+id+" ,"+"\"Creation Date \":"+"\""+createDate+"\", "+"\"Update Date \":"+"\""+updateDate+"\""+" }";
    }

}
