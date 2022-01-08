package controller;

import model.Reservation;
import model.User;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Scanner;

public class ReservationController {
    ArrayList<Reservation>reservations;
    private String cale;

    public ReservationController(String cale){
        reservations=new ArrayList<>();
        this.cale=cale;
        load();
    }

    public void load(){
        File file=new File(cale);
        try{
            Scanner scanner=new Scanner(file);
            while(scanner.hasNextLine()){
                String line=scanner.nextLine();
                reservations.add(new Reservation(line));
            }

        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public  void afiseaza(){
        for(int i=0;i<reservations.size();i++){
            System.out.println(reservations.get(i).descriere());
        }
    }

    public  void adauga(Reservation r){
        reservations.add(r);
    }

    public int  poz(int id){
        for(int i=0;i<reservations.size();i++){
            if(reservations.get(i).getId()==id){
                return i;
            }
        }
        return -1;
    }


    public  void sterge(int id){
        for(int i=0;i<reservations.size();i++){
            if(reservations.get(i).getId()==id){
                reservations.remove(i);
            }
        }

    }

    public  boolean isReservation(String description){
        for(int i=0;i< reservations.size();i++){
            if(reservations.get(i).getDescription().equals(description)){
                return  true;
            }
        }
        return  false;
    }

    public void updateDescription(int id,String description){
        for(int i=0;i< reservations.size();i++){
            if(reservations.get(i).getId()==id){
                reservations.get(i).setDescription(description);
            }
        }
    }

    public  String  toSave(){
        String text="";
        for(int i=0;i<reservations.size();i++){
            text+=reservations.get(i).toSave()+"\n";
        }
        return  text;
    }

    public  void saveFisier(){
        File file=new  File(cale);
        try{
            FileWriter w=new FileWriter(file);
            PrintWriter p=new PrintWriter(w);
            p.print(this.toSave());
            p.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
