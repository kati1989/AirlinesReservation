package model;

import java.util.ArrayList;

public class Administrator extends User{
    private  String rol;
    private String descriere;
    public Administrator(String proprietati){
        super(proprietati);
        this.rol=proprietati.split(",")[7];
        this.descriere=proprietati.split(",")[8];
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getDescriere() {
        return descriere;
    }

    public void setDescriere(String descriere) {
        this.descriere = descriere;
    }

    public String descriere(){
        String desc=super.descriere();
        desc+="\nRol:"+rol+"\nDescriere: "+descriere;
        return  desc;

    }

    public  String toSave(){
        String text=super.toSave();
        text+=","+rol+","+descriere;
        return  text;
    }
}
