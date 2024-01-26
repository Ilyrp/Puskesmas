package view;

import java.util.ArrayList;
import java.util.Scanner;

import entity.DokterEntity;
import entity.PasienEntity;
import entity.PoliEntity;
import controller.PasienController;
import controller.PoliController;

public class PasienView {
    PasienEntity pasienEntity;
    PoliController poliController;
    PasienController pasienController;

    public PasienView() {
        this.poliController = new PoliController();
        this.pasienController = new PasienController();
    }

    public void MenuPasien(String nik) {
        Scanner input = new Scanner(System.in);
        int pilih = 0;
        do {
            try {
                System.out.println("=========================");
                System.out.println("| 1. Ambil Antrian\t|");
                System.out.println("| 2. Lihat Data Poli\t|");
                System.out.println("| 3. Kembali\t\t|");
                System.out.println("=========================");
                System.out.print("Masukkan Pilihan: ");
                pilih = input.nextInt();

                switch (pilih) {
                    case 1:
                        System.out.println("Ambil Antrian");
                        input.nextLine();
                        System.out.print("Masukkan Nama Poli: ");
                        String poliAmbilAntrian = input.nextLine();

                        pasienEntity = pasienController.searchPasien(nik);
                        int nomorAntrian = pasienController.ambilAntrian(poliAmbilAntrian, nik);
                        if (nomorAntrian != -1) {
                            System.out.println("Anda telah berhasil mengambil antrian dengan nomor: " + nomorAntrian);
                            pasienController.addAntrian(poliAmbilAntrian, pasienEntity);
                        } else {
                            System.out.println("Poli tidak ditemukan atau tidak tersedia. Silakan coba lagi.");
                        }
                        break;

                    case 2:
                        System.out.println("=========================");
                        ArrayList<PoliEntity> allPoli = poliController.viewAllPoli();
                        if (!allPoli.isEmpty()) {
                            System.out.println("- Data Poli dan Dokter -");
                            for (PoliEntity polilist : allPoli) {
                                System.out.println("Nama Poli: " + polilist.getNamaPoli());
                                System.out.println("Alamat Poli: " + polilist.getAlamatPoli());

                                System.out.println("----Dokter----");
                                for (DokterEntity dokters : polilist.getAllDokter()) {
                                    System.out.println("Nama Dokter  :" + dokters.getNamaDokter());
                                    System.out.println("Spesialis    :" + dokters.getSpesialis());
                                    System.out.println("Hari Kerja   :" + dokters.getHariKerja());
                                    System.out.println("Jam Kerja    :" + dokters.getJamKerja());
                                }
                            }
                        } else {
                            System.out.println("Belum ada data poli.");
                        }
                        System.out.println("=========================");
                        break;
                    case 3:
                        System.out.println("Kembali ke Menu Utama");
                        break;
                    default:
                        System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                input.nextLine();
            }
        } while (pilih != 3);

    }
}