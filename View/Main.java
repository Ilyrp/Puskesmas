package View;

import java.util.Scanner;

import Controller.AdminController;
import Controller.PasienController;
import Controller.PoliController;
import Entity.PoliEntity;
import Model.AdminModel;
import Model.PasienModel;
import Model.PoliModel;

public class Main {

    public static void main(String[] args) {
        AdminModel modelAdmin = new AdminModel();
        PoliModel poliModel = new PoliModel();
        PasienModel pasienModel = new PasienModel();
        AdminController adminController = new AdminController(modelAdmin);
        PoliController poliController = new PoliController(poliModel);
        PasienController pasienController = new PasienController(pasienModel);
        AdminView adminView = new AdminView(poliController);

        // adminView.poliController = poliController;
        Scanner input = new Scanner(System.in);



        // adminController.insertAdmin("Ilyass", "4567");
        // poliController.insertPoli("tahu", "jalan");
        // poliController.deletePoli("Poli Sehat Selalu");
        // System.out.println("Masukkan nama poli");
        // String poli =input.nextLine();
        // System.out.println("nama dokter");
        // String dokter = input.nextLine();
        // System.out.println("Masukkan spesialis");
        // String spesialis = input.nextLine();
        // System.out.println("Hari kerja");
        // String hari = input.nextLine();
        // System.out.println("Jam kerja");
        // String jam = input.nextLine();
        // poliController.insertPraktek(poli, dokter, spesialis, hari, jam);

        // System.out.println("Nama :");
        // String nama = input.nextLine();
        // System.out.println("kelamin :");
        // String kelamin = input.nextLine();
        // System.out.println("alamat :");
        // String alamat = input.nextLine();
        // System.out.println("Nik :");
        // int nik = input.nextInt();
        // System.out.println("bpjs : ");
        // String bpjs = input.nextLine();
        // pasienController.insertPasien(nama, kelamin, nik, alamat, bpjs);

        // adminView.MenuAdmin();
        
        
    






        
    }
}
