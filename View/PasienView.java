package View;

import java.util.Scanner;

import Controller.AntrianController;
import Controller.PasienController;
import Controller.PoliController;
import Entity.PoliEntity;

public class PasienView {
    PoliController poliController;
    PasienController pasienController;
    AntrianController antrialController;

    public PasienView(PoliController poliController,PasienController pasienController,AntrianController antrianController) {
        this.poliController = poliController;
        this.pasienController = pasienController;
        this.antrialController = antrianController;
    }

    public void MenuPasien() {
        Scanner input = new Scanner(System.in);
        int opsi;
        do {
            System.out.println("1. Ambil Antrian ");
            System.out.println("2. Lihat Data Poli");
            System.out.println("3. Kembali");
            System.out.print("Masukkan Pilihan ");
            opsi = input.nextInt();

            switch (opsi) {
                case 1:
                System.out.println("Ambil Antrian");

                input.nextLine();
                System.out.print("Masukkan Nama Poli: ");
                String poliAmbilAntrian = input.nextLine();
            
                int nomorAntrian = pasienController.ambilAntrian(poliAmbilAntrian);
                if (nomorAntrian != -1) {
                    System.out.println("Anda telah berhasil mengambil antrian dengan nomor: " + nomorAntrian);
                } else {
                    System.out.println("Poli tidak ditemukan. Silakan coba lagi.");
                }
                break;
                case 2:
                    System.out.println("- Menampilkan Data Poli -");
                    for (PoliEntity polilist : poliController.viewAllPoli()) {
                        System.out.println("antrian : " + polilist.getNomorAntrian());
                        System.out.println("Nama Poli: " + polilist.getNamaPoli());
                        System.out.println("Alamat Poli: " + polilist.getAlamatPoli());
                        System.out.println("==============================");
                    }

                    System.out.println("- Pilih Poli -");
                    input.nextLine();
                    System.out.print("Masukkan Nama Poli : ");
                    String namaPoli = input.nextLine();
                    PoliEntity dataPoli = poliController.searchPoli(namaPoli);

                    if (dataPoli != null) {
                        for (PoliEntity.Dokter dokters : dataPoli.getAllDokter()) {
                            System.out.println("Nama Dokter :" + dokters.getNamaDokter());
                            System.out.println("Spesialis   :" + dokters.getSpesialis());
                            System.out.println("Hari Kerja   :" + dokters.getHariKerja());
                            System.out.println("Jam Kerja    :" + dokters.getJamKerja());
                            System.out.println("==============================");
                        }
                    } else {
                        System.out.println("Poli Tidak Ditemukan!");
                    }
                    poliController.viewAllPoli();
                default:
                    break;
            }
        } while (opsi != 3);

    }
}