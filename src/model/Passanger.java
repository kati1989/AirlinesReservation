package model;

public class Passanger  extends User{
   // kijavitani mindenhol a nevet betenni

    String name;
    String pasaport;

    public Passanger(int id, String tip,String userName, String userEmail, String userAdress,String mobile,String password,String name,String pasaport) {
        super(id, tip,userName, userEmail, userAdress,mobile,password);
        this.name=name;
        this.pasaport=pasaport;

    }
    public Passanger(String proprietati){
        super(proprietati);
        this.name=proprietati.split(",")[7];
        this.pasaport=proprietati.split(",")[8];
    }


    public String descriere(){
        String desc=super.descriere();
        desc+="\nName: "+name;
        desc+="\nPasaport:  "+pasaport;
        return  desc;
    }

    public String toSave(){
        String text=super.toSave();
        text+=","+name+","+pasaport;
        return  text;
    }
}