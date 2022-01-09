package controller;

import model.Administrator;
import model.Employee;
import model.Passanger;
import model.User;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class UserController {
    ArrayList<User> users;
    private String cale;

    public UserController(String cale) {
        users = new ArrayList<>();
        this.cale = cale;
        load();
    }

    public void load() {
        File file = new File(cale);
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                switch (line.split(",")[1]) {
                    case "employee":
                        users.add(new Employee(line));
                        break;
                    case "passanger":
                        users.add(new Passanger(line));
                        break;
                    case"administrator":
                        users.add(new Administrator(line));
                        break;
                    default:
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void afiseaza() {
        for (int i = 0; i < users.size(); i++) {
            System.out.println(users.get(i).descriere());
        }
    }

    public int poz(int id) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    public void stergeUser(String userName) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getUserName().equals(userName)) {
                users.remove(i);
            }
        }
    }

    public  void adauga(User u){
        users.add(u);
    }

    public void updateAdress(String userName, String adress) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getUserName().equals(userName)) {
                users.get(i).setUserAdress(adress);
            }
        }
    }

    public void updateNume(int id, String name) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getId()==id ){
                users.get(i).setUserName(name);
            }
        }
    }

    public boolean isUser(String userName) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getUserName().equals(userName)) {
                System.out.println(users.get(i).descriere());
                return true;

            }

        }
        return false;
    }


    public String toSave() {
        String text = "";
        for (int i = 0; i < users.size(); i++) {
            text += users.get(i).toSave() + "\n";
        }
        return text;
    }

    public void saveFisier() {
        File file = new File(cale);
        try {
            FileWriter w = new FileWriter(file);
            PrintWriter p = new PrintWriter(w);
            p.print(this.toSave());
            p.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public User login(String userName,String password){
        for(int i=0;i< users.size();i++){
            if(users.get(i).getUserName().equals(userName)&&users.get(i).getParola().equals(password)){
                return users.get(i);
            }
        }
        return  null;
    }

public  User getUser(String userName){
        for(User u:users){
            if(u.getUserName().equals(userName)) {
                return u;
            }
        }
    return  null;
}
}
/*public  Costumers getCostumers(String nume){
        for(Costumers c:costumers){
            if(c.getFullName().equals(nume)){
                return  c;
            }
        }
        return  null;
    }

}*/