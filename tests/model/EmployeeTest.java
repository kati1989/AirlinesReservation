package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    @Test
    public void descriere() {


        Employee employee = new Employee("1,employee, Ali, alin@yahoo.com, Dezrobirii  nr.2, 07893463, 134,Valicec Alin,3000");
        System.out.println(employee.descriere());
    }

    @Test public  void  toSave(){
        Employee employee = new Employee(1, "employee","Ali", "alin@yahoo.com", "Dezrobirii  nr.2", "07893463","1324", "Valicec Alin",2500);
        System.out.println(employee.toSave());
    }
}