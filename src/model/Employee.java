package model;

public class Employee extends  User{

    private String name;
    private int salar;

    public Employee(int id,String tip, String userName, String userEmail, String userAdress ,String mobile,String password,String name,int salar) {
        super(id,tip, userName, userEmail, userAdress,mobile,password);
        this.name=name;
        this.salar=salar;
    }

    public  Employee(String proprietati){
        super(proprietati);
        this.name=proprietati.split(",")[7];
        this.salar=Integer.parseInt(proprietati.split(",")[8]);

    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public int getSalar() {
        return salar;
    }

    public void setSalar(int salar) {
        this.salar = salar;
    }

    public String descriere(){
        String desc=super.descriere();
        desc+="\nNume: "+name+"\nSalar: "+salar;
        return  desc;

    }

    public String toSave(){
        String text=super.toSave();
        text+=","+name+","+salar;
        return  text;
    }
}

