package model;

public class User {
    private int id;
    private String tip;
    private String userName;
    private String userEmail;
    private String userAdress;
    private String mobile;
    private String parola;

    public void UserClass(){}

    public User(int id,String tip, String userName, String userEmail, String userAdress,String mobile,String parola){
        this.id=id;
        this.tip=tip;
        this.userName=userName;
        this.userEmail=userEmail;
        this.userAdress=userAdress;
        this.mobile=mobile;
        this.parola=parola;
    }

    public  User(String proprietati){
        this.id=Integer.parseInt(proprietati.split(",")[0]);
        this.tip=proprietati.split(",")[1];
        this.userName=proprietati.split(",")[2];
        this.userEmail=proprietati.split(",")[3];
        this.userAdress=proprietati.split(",")[4];
        this.mobile=proprietati.split(",")[5];
        this.parola=proprietati.split(",")[6];
    }
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public int getId() {
        return id;
    }

    public void setId(int id){
        this.id=id;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserAdress() {
        return userAdress;
    }

    public void setUserAdress(String userAdress) {
        this.userAdress = userAdress;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public String descriere(){
        String desc="";
        desc+="\nId: "+id+"\nTip: "+tip+"\nUserName: " +userName+"\nUser Email: "+userEmail+"\nUser Adress: "+userAdress+"\nMobile: "+mobile+"\nParola: "+parola;
        return  desc;

    }

    public String toSave(){
        String text="";
        text+=id+","+tip+","+userName+","+userEmail+","+userAdress+","+mobile+","+parola;
        return  text;
    }


}

