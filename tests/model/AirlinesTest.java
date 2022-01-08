package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirlinesTest {

    @Test
    void descriere() {
        Airlines airline=new Airlines("1,pornire Cluj,ieftin,2022.07.12");
        System.out.println(airline.descriere());

    }
    @Test
    void toSave(){
        Airlines airline=new Airlines(1,"pornire Cluj","ieftin","2022.07.12");
        System.out.println(airline.toSave());
    }
}
