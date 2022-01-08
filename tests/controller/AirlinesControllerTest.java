package controller;

import model.Airlines;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirlinesControllerTest {
    private AirlinesController airlinesController;

    @BeforeEach
    public void preconditie() {
        airlinesController = new AirlinesController("C:\\Users\\Kati\\Desktop\\Java_curs\\OOP\\Proiecte\\AirlinesReservationSystem\\src\\resurces\\airlines.txt");
    }

    @Test
    void load() {
        airlinesController.load();
        airlinesController.afiseaza();
    }

    @Test
    public void updateDate() {
        airlinesController.updateDate(1, "2021.05.12");
        airlinesController.afiseaza();
    }

    @Test
    public void poz() {
        System.out.println(airlinesController.poz(2));
    }

    @Test
    public void sterge() {
        airlinesController.sterge(2);
        airlinesController.saveFisiser();

        airlinesController.afiseaza();
    }

    @Test
    public void tosave() {
        System.out.println(airlinesController.toSave());
    }

    @Test
    public void adauga() {
        Airlines a = new Airlines("5,Franta,Vip,2022.01.23");
        airlinesController.add(a);
        airlinesController.saveFisiser();
    }

    @Test
    public void isAirlines() {
        System.out.println(airlinesController.isAirlines(1));
    }



}