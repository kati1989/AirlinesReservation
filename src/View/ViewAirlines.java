package View;

import controller.AirlinesController;
import controller.UserController;
import model.Airlines;

import java.util.Scanner;

public class ViewAirlines {
    private AirlinesController airlinesController;
    Airlines airlines;
    public ViewAirlines(){
    airlinesController=new AirlinesController("C:\\Users\\Kati\\Desktop\\Java_curs\\OOP\\Proiecte\\AirlinesReservationSystem\\src\\resurces\\airlines.txt");

    }
    public  void meniu(){
        System.out.println("***********Airlines***************");
        System.out.println("Apasati tasta  1 pentru afisa toate ailinurile");
        System.out.println("Apasati tasta  2 pentru a dauga Ailines ");
        System.out.println("Apasati tasta  3 pentru a actualiza data unui airline");
        System.out.println("Apasati tasta  4 pentru a sterge un airline");
        System.out.println("Apasati tasta  5 pentru a cauta un airline  ");

    }
    public void  play(){
        Scanner  scanner=new Scanner(System.in);
        boolean run=true;
        int alegere=0;
        meniu();
        while(run=true){
            alegere=Integer.parseInt(scanner.nextLine());
            switch (alegere){
                case 1:airlinesController.afiseaza();
                break;
                case 2:adauga();
                break;
                case 3:updateDate();
                break;
                case 4:stergeAirline();
                break;
                case 5:cautaAirline();
                break;
                case 6:run=false;
                default:
            }
        }
    }

    public void adauga(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduceti  idul airlinesului");
        int id=Integer.parseInt(scanner.nextLine());
        System.out.println("Introducet description");
        String description= scanner.nextLine();
        System.out.println("Introduceti type");
        String type=scanner.nextLine();
        System.out.println("Introducet date");
        String date=scanner.nextLine();
        Airlines a=new Airlines(id,description,type,date);
        airlinesController.add(a);
        System.out.println("S-a adaugat un airline");
    }

    public void updateDate(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introdueti id");
        int id=Integer.parseInt(scanner.nextLine());
        System.out.println("Introduceti data");
        String data= scanner.nextLine();
        airlinesController.updateDate(id,data);
        System.out.println("S-a modificat");

    }
    public  void stergeAirline(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduceti id ul");
        int id=Integer.parseInt(scanner.nextLine());
        airlinesController.sterge(id);
        System.out.println("S-a sters");
    }

    public void cautaAirline(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduceti id ul");
        int id=Integer.parseInt(scanner.nextLine());
        airlinesController.isAirlines(id);
    }
}
/*


    public void cautaUser(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introducet usercul cautat");
        String nume= scanner.nextLine();
        userController.isUser(nume);

    }
}

/*


    public void adaugaCurs() {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Introduceti id-ul cursului");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Introduceti numele cursului");
        String name = scanner.nextLine();
        System.out.println("Introduceti departamentul");
        String departament = scanner.nextLine();
        Curs curs = new Curs(id, name, departament);
        System.out.println("Se adauga curs");
        controllerCurs.adauga(curs);
        //controllerCurs.toSaveFisier();


    }

    public void stergeCurs() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti id ul cursului pe care doriti sa stregeti");
        int id = scanner.nextInt();
        System.out.println("Cursul cu id ul introdus va fi sters");
        controllerCurs.sterge(id);
        //controllerCurs.toSaveFisier();
    }

    public void afiseazaStudentii() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti id ul cursului");
        int coursId = scanner.nextInt();
        System.out.println("Studentii inscrisi la curs:");
        controllerEnrolment.returnLista2(coursId);
        ArrayList<Enrolment> studentEnrolments = controllerEnrolment.returnLista2(coursId);
        for (Enrolment enrolment : studentEnrolments) {
            System.out.println(controllerPersoana.returnStudent(enrolment.getStudentId()).descriere());
        }

    }

    //Sa zica cine e logat:ex Buna Anca

    public void salutaLogatul() {
Scanner scanner=new Scanner(System.in);
        String nume = scanner.nextLine();
        System.out.println("Buna: "+nume);

    }
}
*/