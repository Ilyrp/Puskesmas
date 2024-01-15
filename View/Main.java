package View;



import java.util.Scanner;

import Controller.AntrianController;
import Controller.LoginController;
import Controller.PasienController;
import Controller.PoliController;
import Model.PasienModel;
import Model.PoliModel;

public class Main {

    public static void main(String[] args) {
        PoliModel poliModel = new PoliModel();
        PasienModel pasienModel = new PasienModel(poliModel);
        PoliController poliController = new PoliController(poliModel);
        AdminView adminView = new AdminView(poliController);
        AntrianController antrianController = new AntrianController(pasienModel);
        PasienController pasienController = new PasienController(pasienModel);
        PasienView pasienView = new PasienView(poliController, pasienController, antrianController);
        LoginController loginController = new LoginController(adminView, pasienView);

        Scanner input = new Scanner(System.in);

        int opsi;
        do {
            System.out.println("Menu");
            System.out.println("1. Input Data Pasien");
            System.out.println("2. Ambil Antrian");
            System.out.println("3. Login Admin");
            System.out.println("4. Keluar");
            System.out.print("Masukkan Pilihan: ");
            opsi = input.nextInt();

            switch (opsi) {
                case 1:
                    System.out.print("Masukkan NIK: ");
                    String nik = input.nextLine();
                    System.out.print("Masukkan Nama: ");
                    input.nextLine();
                    String nama = input.nextLine();
                    System.out.print("Masukkan Jenis Kelamin: ");
                    String jenisKelamin = input.nextLine();
                    System.out.print("Masukkan BPJS (Jika ada): ");
                    String bpjs = input.nextLine();
                    pasienController.insertPasien(nik, nama, jenisKelamin, nama, bpjs);
                    break;
                case 2:
                input.nextLine();
                    System.out.print("Masukkan NIK atau BPJS: ");
                    nik = input.nextLine();
                    loginController.loginPasien(nik);
                    break;
                case 3:
                    input.nextLine();
                    System.out.print("Masukkan Username: ");
                    String username = input.nextLine();
                    System.out.print("Masukkan Password: ");
                    String password = input.nextLine();
                    loginController.loginAdmin(username, password);
                    break;
                case 4:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }

        } while (opsi != 4);
    }
}
