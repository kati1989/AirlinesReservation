package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdministratorTest {

    @Test
    public  void  descriere(){
        Administrator a=new Administrator("1,administrator,Rebeca,alin@yahoo.com,Dezrobirii nr 2,07897765,Alin,rezervari,Data nasterii 1985.01.23\n");
        System.out.println( a.descriere());
    }

    @Test
    public   void toSave(){
        Administrator a=new Administrator("1,administrator,Rebeca,alin@yahoo.com,Dezrobirii nr 2,07897765,Alin,rezervari,Data nasterii 1985.01.23\n");
        System.out.println( a.toSave());
    }
}