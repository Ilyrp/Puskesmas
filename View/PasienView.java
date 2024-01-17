package View;

import java.util.Scanner;
import Controller.PasienController;
import Controller.PoliController;
import Entity.PasienEntity;
import Entity.PoliEntity;

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
        int opsi;
        do {
            System.out.println("1. Ambil Antrian ");
            System.out.println("2. Lihat Data Poli");
            System.out.println("3. Kembali");
            System.out.print("Masukkan Pilihan: ");
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
                        System.out.println("Poli tidak ditemukan atau tidak tersedia. Silakan coba lagi.");
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
                        System.out.println("Data Tidak Ditemukan!");
                    }
                    poliController.viewAllPoli();
                    break;
                case 3:
                    System.out.println("Kembali ke Menu Utama");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }
        } while (opsi != 4);
    }

}
