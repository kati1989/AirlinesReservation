package controller;

import model.Reservation;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ReservationControllerTest {

   private ReservationController reservationController;

   @BeforeEach
    public void preconditie(){
       reservationController=new ReservationController("C:\\Users\\Kati\\Desktop\\Java_curs\\OOP\\Proiecte\\AirlinesReservationSystem\\src\\resurces\\reservations.txt");
   }

   @Test

    public void load(){
       reservationController.afiseaza();
   }

   @Test
    public  void poz(){
       System.out.println(reservationController.poz(2));
   }

   @Test
    public  void sterge(){
       reservationController.sterge(1);
       reservationController.afiseaza();
   }

   @Test
    public  void isReeservation(){
       System.out.println(reservationController.isReservation("havai"));
   }

    @Test
    public void updateDescription(){
       reservationController.updateDescription(1,"test");
       reservationController.afiseaza();
       reservationController.saveFisier();

    }

}