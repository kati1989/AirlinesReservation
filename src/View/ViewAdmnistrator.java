package View;

import controller.AirlinesController;
import controller.AirlinesEnquiryController;
import controller.ReservationController;
import controller.UserController;
import model.Airlines;

import java.util.Scanner;

public class ViewAdmnistrator {
    private UserController userController;


    public ViewAdmnistrator() {

        userController = new UserController("C:\\Users\\Kati\\Desktop\\Java_curs\\OOP\\Proiecte\\AirlinesReservationSystem\\src\\resurces\\users.txt ");

    }

    public void meniu() {
        System.out.println("***********ADMINISTRATOR**********************");
        System.out.println("Apasa tasta  1  pentru a vedea toate userele");
        System.out.println("Apasa tasta   2 pentru a  sterge un user");
        System.out.println("Apasa tasta   3 pentru  a schimba numele unui user");
        System.out.println("Apasa tasta   4 pentru  a vedea daca exista userul respectiv");
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        int alegere = 0;
        boolean run = true;
        meniu();

        while (run == true) {
            alegere = Integer.parseInt(scanner.nextLine());
            switch (alegere) {
                case 1:
                    userController.afiseaza();
                    break;
                case 2:
                    stergeUser();
                    break;
                case 3:
                    updateNume();

                case 4:
                    isUser();
                    break;
                default:
            }

        }

    }

    public void stergeUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti userul");
        String userName = scanner.nextLine();
        userController.stergeUser("Rebeca");
        System.out.println("Userul s-a sters");

    }

    public void updateNume() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduceti id-ul");
        int id=Integer.parseInt(scanner.nextLine());
        System.out.println("Introduveti numele nou");
        String nume=scanner.nextLine();
        userController.updateNume(id,nume);
        System.out.println("Numele s-a schimbat");

    }
    public void isUser(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduceti userNameul ");
        String userName=scanner.nextLine();

        System.out.println("Userul cautat este");
        userController.isUser(userName);


    }

}
