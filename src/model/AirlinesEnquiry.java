package model;
//repjarat kerdoiv
public class AirlinesEnquiry {

    public int id;
    public String type;
    public String title;
    public  String description;
    public  String date;

    public  AirlinesEnquiry(int id,String type,String title,String description,String date){
        this.id=id;
        this.type=type;
        this.title=title;
        this.description=description;
        this.date=date;
    }

    public  AirlinesEnquiry(String proprietati){
        this.id=Integer.parseInt(proprietati.split(",")[0]);
        this.type=proprietati.split(",")[1];
        this.title=proprietati.split(",")[2];
        this.description=proprietati.split(",")[3];
        this.date=proprietati.split(",")[4];
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String  descriere(){
        String desc="";
        desc+="\nId: "+id+"\nType: "+type+"\nTitle: "+title+"\nDescription: "+description+"\nDate: "+date;
        return  desc;
    }

    public String toSave(){
        String text="";
        text+=id+","+type+","+title+","+description+","+date;
        return  text;
    }
}
