package View;

import controller.UserController;
import model.User;

import java.util.Scanner;


public class ViewUser {

    private UserController userController;

    User user;

    public ViewUser(){
       userController=new UserController("C:\\Users\\Kati\\Desktop\\Java_curs\\OOP\\Proiecte\\AirlinesReservationSystem\\src\\resurces\\users.txt");
    }

    public void meniu(){
        System.out.println("*******************USER****************");
        System.out.println("Apasa tasta  1 pentru a afisa toate userele ");
        System.out.println("Apasa tasta  2 pentru a adauga user nou");
        System.out.println("Apasa tasta 3  pentru a actualiza numele userului ");
        System.out.println("Apasa tasta  4  pentru a sterge un user ");
        System.out.println("Apasa tasta  5 pentru a cauta un user existent ");
    }


    public void play(){
        Scanner scanner=new  Scanner(System.in);
        boolean run=true;
        int alegere=0;
        meniu();
        while(run=true){
            alegere=Integer.parseInt(scanner.nextLine());
            switch(alegere){
                case 1:userController.afiseaza();
                break ;
                case 2:adaugaUser();
                break;
                case 3:updateName();
                break;
                case 4:stergeUser();
                break;
                case 5:cautaUser();
                case 6:run=false;

                default:
            }
        }
    }
    public  void adaugaUser(){
        Scanner scanner=new Scanner(System.in);
        System.out.println();
        System.out.println("Introduceti id-ul userului");
        int id=Integer.parseInt(scanner.nextLine());
        System.out.println("Introduceti tipul userului");
        String tip= scanner.nextLine();
        System.out.println("Introduceti userName-ul userului");
        String userName=scanner.nextLine();
        System.out.println("Introduceti emailu useruui");
        String email=scanner.nextLine();
        System.out.println("Introduceti adresa");
        String address=scanner.nextLine();
        System.out.println("Introduceti mobilul");
        String mobile= scanner.nextLine();
        System.out.println("Introduceti parola");
        String parola=scanner.nextLine();
        User user=new User(id,tip,userName,email,address,mobile,parola);
        System.out.println("Se adauge user");
        userController.adauga(user);
        userController.saveFisier();
    }

    public void updateName(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduceti idul caruia doriti sa modificati numele");
        int id=Integer.parseInt(scanner.nextLine());
        System.out.println("Introduceti numele nou");
        String nume=scanner.nextLine();
        userController.updateNume(id,nume);
        userController.saveFisier();
        System.out.println("S-a schimbat numele userului");

    }
    public void stergeUser(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduceti userNameul ");
        String userName= scanner.nextLine();
        userController.stergeUser(userName);
        userController.saveFisier();
        System.out.println("S-a sters userul introdus");

    }

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