package View;

import controller.ReservationController;
import model.Reservation;

import java.util.Scanner;

public class ViewReservation {
    private ReservationController reservationController;
    Reservation reservation;

    public  ViewReservation(){
        reservationController=new ReservationController("C:\\Users\\Kati\\Desktop\\Java_curs\\OOP\\Proiecte\\AirlinesReservationSystem\\src\\resurces\\reservations.txt");

    }

    public void meniu(){
        System.out.println("************RESERVATION**************");
        System.out.println("Apasati tasta 1 pentru a afisa toate rezervarile ");
        System.out.println("Apasati tasta  2 pentru  a adauga o rezervare");
        System.out.println("Apasati tasta 3 pentru a actualiza rezervarile");
        System.out.println("Apasati tasta  4 pentru a sterge o rezervare ");
        System.out.println("Apasati tasta 5 pentru a afisa toate razervarile unui zbor ");//enqueryId alapjan
        System.out.println("Apasat tasta 6 pentru a afisa toate rezervarile unui user");//userId alapjan

    }

    public  void play(){
        Scanner scanner=new Scanner(System.in);
        boolean run=true;
        int alegere=0;
        meniu();
        while(run=true) {
            alegere = Integer.parseInt(scanner.nextLine());
            switch (alegere) {
                case 1:
                    reservationController.afiseaza();
                    break;
                case 2:
                    adauga();
                    break;
                case 3:
                    updateDescription();
                    break;
                case 4:
                    stergeReservation();
                    break;
//                case 5:
//                    cautaAirline();
//                    break;
                case 6:
                    run = false;
                default:
            }
        }
    }

    public void adauga(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduceti id-ul ");
        int id=Integer.parseInt(scanner.nextLine());
        System.out.println("Introduceti description");
        String description=scanner.nextLine();
        System.out.println("Introduceti type");
        String type= scanner.nextLine();
        System.out.println("Introduceti date");
        String date =scanner.nextLine();
        System.out.println("Introducet password");
        String password=scanner.nextLine();
        Reservation r=new Reservation(id,description,type,date,password);
        reservationController.adauga(r);
        System.out.println("S-a adaugat");

    }

    public void updateDescription(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduceti id-ul");
        int id=Integer.parseInt(scanner.nextLine());

        System.out.println("Introduceti descrierea");
        String description= scanner.nextLine();
        reservationController.updateDescription(id,description);

    }
    public void stergeReservation(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduceti id-ul");
        int id=Integer.parseInt(scanner.nextLine());
        reservationController.sterge(id);
        System.out.println("S-a sters");
    }
}

/*
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