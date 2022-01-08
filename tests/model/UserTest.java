package model;

import org.junit.jupiter.api.Test;


class UserTest {

   @Test
   public void descriere() {
       User userClass = new User("1,employee, Andrei, adi@yahoo.com, Calarasilor nr.3,0789735,123");
       System.out.println(userClass.descriere());
   }

   @Test
    public  void toSave(){
       User userClass = new User(1,"employee", "Andrei", "adi@yahoo.com", "Calarasilor nr.3","0789735","123");
       System.out.println(userClass.toSave());
   }

}

//