package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReservationTest {

    @Test
    void descriere() {
        Reservation reservation=new Reservation("1,Roma,clasa I,2022.06.18,123");
        System.out.println(reservation.descriere());
    }

    @Test
    void toSave(){
        Reservation reservation=new Reservation(1,"Roma","clasa I","2022.06.18","123");
        System.out.println(reservation.toSave());
    }
}