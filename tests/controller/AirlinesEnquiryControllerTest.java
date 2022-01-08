package controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirlinesEnquiryControllerTest {
    private AirlinesEnquiryController airlinesEnquiryController;

    @BeforeEach
    public void preconditie() {
        airlinesEnquiryController = new AirlinesEnquiryController("C:\\Users\\Kati\\Desktop\\Java_curs\\OOP\\Proiecte\\AirlinesReservationSystem\\src\\resurces\\airlinesEnquery.txt");
    }

    @Test
    void load() {
        airlinesEnquiryController.afiseaza();
    }


    @Test
    public  void  poz(){
        System.out.println(airlinesEnquiryController.poz(2));
    }

    @Test
    public void sterge(){
        airlinesEnquiryController.sterge(2);
        airlinesEnquiryController.afiseaza();
    }

    @Test
    public void update(){
        airlinesEnquiryController.updateDate(1,"2025");

        airlinesEnquiryController.saveFisier();
        airlinesEnquiryController.afiseaza();
    }


}