package view;

import java.util.ArrayList;
import java.util.Scanner;

import entity.AntrianEntity;
import entity.PasienEntity;
import entity.PoliEntity;
import controller.PasienController;
import controller.PoliController;

public class AdminView {
    PoliController poliController;
    PasienController pasienController;

    public AdminView() {
        this.poliController = new PoliController();
        this.pasienController = new PasienController();
    }

    public void MenuAdmin() {
        Scanner input = new Scanner(System.in);
        int pilih;
        do {
            System.out.println("\tMenu Administrador");
            System.out.println("1. Tambah Poli");
            System.out.println("2. Tambah Jadwal Praktek");
            System.out.println("4. Update Jadwal Praktek");
            System.out.println("5. Hapus Poli");
            System.out.println(". Hapus Jadwal Praktek");
            System.out.println("5. Lihat Data Poli");
            System.out.println("6. Cetak Struk");
            System.out.println("7. Logout");
            System.out.print("Masukkan Pilihan : ");
            pilih = input.nextInt();

            switch (pilih) {
                case 1:
                    input.nextLine();
                    System.out.println("=========================");
                    System.out.println("Masukkan Nama Poli : ");
                    String poli = input.nextLine();
                    System.out.println("Masukkan Alamat Poli : ");
                    String alamat = input.nextLine();
                    int antrian = 0;
                    System.out.println("=========================");
                    poliController.insertPoli(antrian, poli, alamat);
                    break;
                case 2:
                    input.nextLine();
                    System.out.println("=========================");
                    System.out.println("Masukkan nama poli");
                    String namaPoli = input.nextLine();
                    System.out.println("nama dokter");
                    String dokter = input.nextLine();
                    System.out.println("Masukkan spesialis");
                    String spesialis = input.nextLine();
                    System.out.println("Hari kerja");
                    String hari = input.nextLine();
                    System.out.println("Jam kerja");
                    String jam = input.nextLine();
                    System.out.println("=========================");
                    poliController.insertPraktek(namaPoli, dokter, spesialis, hari, jam);
                    break;
                case 3:
                    System.out.println("- Update Praktek Dokter -");
                    input.nextLine();
                    System.out.print("Masukkan Nama Poli : ");
                    namaPoli = input.nextLine();
                    if (poliController.searchPoli(namaPoli) == null){
                        System.out.println("Poli Tidak Ditemukan");
                    }else{
                    System.out.print("Masukkan Nama Dokter Yang ingin Diubah : ");
                    String namaDokter = input.nextLine();
                    System.out.print("Masukkan Hari Kerja Baru : ");
                    String newHariKerja = input.nextLine();
                    System.out.print("Masukkan Jam Kerja Baru : ");
                    String newJamKerja = input.nextLine();
                    poliController.updateDokter(namaPoli, namaDokter, newHariKerja, newHariKerja, newJamKerja,
                            newJamKerja);
                    System.out.println("Berhasil Update Data Dokter");
                    }
                    break;
                case 4:
                    System.out.println("-Hapus Poli - ");
                    input.nextLine();
                    System.out.println("Masukkan Nama Poli : ");
                    String poliName = input.nextLine();
                    poliController.deletePoli(poliName);
                    break;
                case 5:
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
                    namaPoli = input.nextLine();
                    PoliEntity dataPoli = poliController.searchPoli(namaPoli);

                    if (dataPoli != null) {
                        System.out.println("Dokter:");
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

                    break;
                case 6:
                    input.nextLine();
                    System.out.println("Masukkan Nama Poli : ");
                    namaPoli = input.nextLine();
                    System.out.println("Masukkan Nomor Antrian : ");
                    int nomorAntrian = input.nextInt();
                    AntrianEntity Antrian = pasienController.searchAntrian(nomorAntrian, namaPoli);

                    if (Antrian != null) {
                        System.out.println("===== Antrian Details =====");
                        System.out.println("Nomor Antrian: " + Antrian.getAntri());
                        System.out.println("Nama Poli: " + Antrian.getNamaPoli());
                        System.out.println("Tanggal : "+Antrian.getTanggal());

                        ArrayList<PasienEntity> antrianDetails = Antrian.getAntrianDetails();
                        for (PasienEntity pasien : antrianDetails) {
                            System.out.println("NIK: " + pasien.getNik());
                            System.out.println("Nama Pasien: " + pasien.getNamaPasien());
                            System.out.println("BPJS: " + pasien.getBpjs());
                            System.out.println("===========================");
                        }
                    } else {
                        System.out.println("Antrian Tidak Ditemukan");
                    }
                    break;
                case 7:
                    System.out.println("Log Out");
                    break;
                default:
                    break;
            }
        } while (pilih != 7);
    }
}

