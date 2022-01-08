package controller;

import model.Airlines;
import model.AirlinesEnquiry;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class AirlinesEnquiryController {
    ArrayList<AirlinesEnquiry>airlinesEnquiries;
    private  String cale;

    public AirlinesEnquiryController(String cale){
        airlinesEnquiries=new ArrayList<>();
        this.cale=cale;
        load();

    }

    public void load(){
        File file=new File(cale);
        try{
            Scanner scanner=new Scanner(file);
            while(scanner.hasNextLine()){
                String line;
                line=scanner.nextLine();
                airlinesEnquiries.add(new AirlinesEnquiry(line));
            }

        }catch (Exception e){
          e.printStackTrace();
        }
    }

    public  void afiseaza(){
        for(int i=0;i<airlinesEnquiries.size();i++){
            System.out.println(airlinesEnquiries.get(i).descriere());
        }
    }

    public int poz(int id){
        for(int i=0;i<airlinesEnquiries.size();i++){
            if(airlinesEnquiries.get(i).getId()==id){
                return  i;
            }

        }
        return -1;
    }

    public void sterge(int id){
        for (int i=0;i<airlinesEnquiries.size();i++){
            if(airlinesEnquiries.get(i).getId()==id){
                airlinesEnquiries.remove(i);
            }
        }
    }

    public  void updateDate(int id,String date){
        for (int  i=0;i<airlinesEnquiries.size();i++){
           if(airlinesEnquiries.get(i).getId()==id){
               airlinesEnquiries.get(i).setDate(date);
           }
        }
    }

    public String toSave(){
        String text="";
        for(int i=0;i<airlinesEnquiries.size();i++){
            text+=airlinesEnquiries.get(i).toSave()+"\n";
        }

        return  text;
    }

    public  void saveFisier(){
        File file=new File(cale);
        try {
            FileWriter w=new FileWriter(file);
            PrintWriter p=new PrintWriter(w);
            p.print(this.toSave());
            p.close();
        }catch(Exception e){
            e.printStackTrace();

        }
    }


}
