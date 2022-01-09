package View;

import controller.UserController;
import model.User;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class ViewLogin {
    private UserController userController;

    public  ViewLogin(){
        userController=new UserController("C:\\Users\\Kati\\Desktop\\Java_curs\\OOP\\Proiecte\\AirlinesReservationSystem\\src\\resurces\\users.txt");
    }
    public void meniu(){
        System.out.println("Apasa tatsa 1 pontru login");
        System.out.println("Apasa tasta 2 pentru logout");
        System.out.println("Apasa tatsta 3 petru a inregistra");
    }

    public void play(){
        Scanner scanner=new Scanner(System.in);
        boolean run =true;
        int alegere=0;
        //controllerCostumers.load();
        while(run=true){
            meniu();
            alegere=Integer.parseInt(scanner.nextLine());
            switch ( alegere){
                case 1:login();
                break;
                case 2:logout();
                break;
                case  3:register();
                break;
                default:
            }
        }
    }
    public void login(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduceti userNamul");
        String userName=scanner.nextLine();
        System.out.println("Introdueti passwordul");
        String parola=scanner.nextLine();
        System.out.println("Logare");
        User logat=userController.login(userName,parola);
        if(logat!=null){
            User user=userController.getUser(userName);
            if(user.getTip().equals("administrator")){
                ViewAdmnistrator viewAdmnistrator=new ViewAdmnistrator();
                viewAdmnistrator.play();
            }else{
                ViewUser viewUser=new ViewUser();
                viewUser.play();

            }

        }
    }

    public void logout(){
        System.out.println("Sunteti disconectat");
        String nume="";
        String id="";
    }
    public void register(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Itroduceti id -ul");
        int id=Integer.parseInt(scanner.nextLine());
        System.out.println("Introduceti tipul");
        String tip= scanner.nextLine();
        System.out.println("Introduceti userNameul");
        String userName=scanner.nextLine();
        System.out.println("Introduceti emailul");
        String email=scanner.nextLine();
        System.out.println("Introduceti adresa");
        String address=scanner.nextLine();
        System.out.println("Introduceti nr de mobil");
        String mobile= scanner.nextLine();
        System.out.println("Introduceti parola");
        String parola= scanner.nextLine();
        User user=new User(id,tip,userName,email,address,mobile,parola);



    }
}
