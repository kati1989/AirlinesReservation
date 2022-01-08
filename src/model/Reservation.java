package model;

public class Reservation {
    public  int id;
    public String  description;
    public String type;
    public String date;
    public String password;

    public  Reservation(int id,String description,String type,String date,String password){
        this.id=id;
        this.description=description;
        this.type=type;
        this.date=date;
        this.password=password;
    }
    public Reservation(String proprietati){
        this.id=Integer.parseInt(proprietati.split(",")[0]);
        this.description=proprietati.split(",")[1];
        this.type=proprietati.split(",")[2];
        this.date=proprietati.split(",")[3];
        this.password=proprietati.split(",")[4];

    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id=id;
    }

    public String getDescription(){
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String descriere(){
        String desc="";
        desc+="\nId: "+id+"\nDescription: "+description+"\nType: "+type+"\nDate: "+date+"\nPassword: "+password;
         return  desc;
    }

    public String toSave(){
        String text="";
        text+=id+","+description+","+type+","+date+","+password;
        return  text;
    }
}
