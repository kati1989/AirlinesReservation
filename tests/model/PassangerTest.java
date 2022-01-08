package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PassangerTest {
    @Test
    public  void desc(){
        Passanger passanger=new Passanger("1,passanger,Andreea,ade@yahoo.com,Dezrobirii nr 47,07563728, Andreea,RO342102");
        System.out.println(passanger.descriere());
    }

    @Test
    public  void  toSave(){
        Passanger passanger=new Passanger(1,"passanger","Andreea","ade@yahoo.com","Dezrobirii nr 47","07563728","123","Andreea","RO342102");
        System.out.println(passanger.toSave());
    }

}

