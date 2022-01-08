package controller;

import model.Airlines;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class AirlinesController {
    ArrayList<Airlines>airlines;
    private String  cale;

    public AirlinesController(String cale){
        airlines=new ArrayList<>();
        this.cale=cale;
        load();
    }

    public void load(){
        File file=new  File(cale);
        try {
            Scanner scanner=new Scanner(file);
            while(scanner.hasNextLine()){
                String line=scanner.nextLine();
                airlines.add(new Airlines(line));
            }


        }catch ( Exception e){
            e.printStackTrace();

        }
    }

    public  void afiseaza(){
        for(int i=0;i<airlines.size();i++){
            System.out.println(airlines.get(i).descriere());
        }
    }

    public void updateDate(int id,String date){
        for(int i=0;i<airlines.size();i++){
            if(airlines.get(i).getId()==id){
                airlines.get(i).setDate(date);
            }
        }
    }



    public int poz(int id){
        for(int i=0;i<airlines.size();i++){
            if(airlines.get(i).getId()==id)
                return i;
        }
        return -1;
    }

    public void sterge(int id){
        for(int i=0;i<airlines.size();i++){
            if(airlines.get(i).getId()==id){
                airlines.remove(i);
            }
        }
    }

    public String toSave(){
        String text="";
       for(int i=0;i<airlines.size();i++){
           text+=airlines.get(i).toSave()+"\n";
       }
        return  text;
    }

    public  void saveFisiser(){
        File file=new File(cale);
        try{
            FileWriter w=new FileWriter(file);
            PrintWriter p=new PrintWriter(w);
            p.print(this.toSave());
            p.close();

        }catch(Exception e){
            e.printStackTrace();

        }
    }

    public void add(Airlines a){
        airlines.add(a);
    }

    public boolean isAirlines(int id){
        for(int i=0;i<airlines.size();i++){
            if(airlines.get(i).getId()==id){
                System.out.println(airlines.get(i).descriere());
                return  true;
            }

        }
        return  false;
    }

}
