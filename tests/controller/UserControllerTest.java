package controller;

import model.Employee;
import model.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserControllerTest {

    private UserController userController;

    @BeforeEach
    public void preconditie() {
        userController = new UserController("C:\\Users\\Kati\\Desktop\\Java_curs\\OOP\\Proiecte\\AirlinesReservationSystem\\src\\resurces\\users.txt");

    }

    @Test
    public void load() {
        userController.afiseaza();
    }

    @Test
    public void poz() {
        System.out.println(userController.poz(2));
    }

    @Test
    public void sterge() {
        userController.stergeUser("Alin");
        userController.afiseaza();
    }

    @Test
    public void updateAdress() {
        userController.updateAdress("Andrea", "test");
        userController.afiseaza();
        userController.saveFisier();
    }

    @Test
    public void isUser() {
        System.out.println(userController.isUser("Alin"));
    }

    @Test
    public void adauga(){
        User u=new User("6,employee,test,alin@yahoo.com,Dezrobirii nr 2,07897765,Alin,3000\n");
        userController.adauga(u);
        userController.saveFisier();
    }

}
