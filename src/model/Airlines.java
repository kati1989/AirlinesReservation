package model;

public class Airlines {
    public int id;
    public String description;
    public String type;
    public String date;


    public Airlines(int id,String description,String type,String date){
        this.id=id;
        this.description=description;
        this.type=type;
        this.date=date;

    }

    public Airlines(String proprietati){
        this.id=Integer.parseInt(proprietati.split(",")[0]);
        this.description=proprietati.split(",")[1];
        this.type=proprietati.split(",")[2];
        this.date=proprietati.split(",")[3];
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String descriere(){
        String desc="";
        desc+="\nId: "+id+"\nDescription: "+description+"\nType: "+type+"\nDate: "+date;
        return desc;
    }

    public String toSave(){
      String text="";
      text+=id+","+description+","+type+","+date;
      return  text;
    }
}
