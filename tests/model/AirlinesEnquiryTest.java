package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirlinesEnquiryTest {
    @Test

    public void descriere() {
        AirlinesEnquiry airlinesEnquiry = new AirlinesEnquiry("1, pret redus, VizAir , dus-intors,loc nr 34, 2022.07.12");
        System.out.println(airlinesEnquiry.descriere());
    }

@Test
    public  void toSave(){
    AirlinesEnquiry airlinesEnquiry = new AirlinesEnquiry(1, "pret redus", "VizAir ", "dus-intors,loc nr 34", "2022.07.12");
    System.out.println(airlinesEnquiry.toSave());
}

}