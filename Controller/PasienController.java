package Controller;

import java.util.ArrayList;

import Entity.PasienEntity;
import Model.PasienModel;

public class PasienController {
     private PasienModel pasienModel;

    public PasienController(PasienModel pasienModel) {
        this.pasienModel = pasienModel;
    }

    // Create
    public void insertPasien(String namaPasien, String kelamin,int nik,String alamat,String bpjs) {
        pasienModel.addPasien(new PasienEntity(namaPasien, kelamin, nik, alamat, bpjs));
    }

    // View
    public ArrayList<PasienEntity> viewAllPasien() {
    return pasienModel.getAllPasien();
}


    // Delete
    // public void deletePoli(String namaPoli) {
    //     PoliEntity poli = poliModel.searchPoli(namaPoli);
    //     if (poli != null) {
    //         poliModel.deletePoli(poli);
    //         System.out.println("Poli " + namaPoli + " berhasil dihapus.");
    //     } else {
    //         System.out.println("Poli tidak ditemukan!");
    //     }
    //     poliModel.commitData();
    // }

    // Insert Praktek
    // public void insertPraktek(String namaPoli, String namaDokter, String spesialis,String hariKerja,String jamKerja) {
    //     PoliEntity poli = poliModel.searchPoli(namaPoli);
    //     if (poli != null) {
    //         poli.addDokter(namaDokter, spesialis, hariKerja, jamKerja);
    //         poliModel.updatePoli(namaPoli, poli);
    //         System.out.println("Praktek " + namaDokter + " di Poli " + namaPoli + " berhasil ditambahkan.");
    //     } else {
    //         System.out.println("Poli tidak ditemukan!");
    //     }
    // }

    // public void updateDokter(String namaPoli, String namaDokter, String prevHariKerja, String newHariKerja, String prevJamKerja, String newJamKerja) {
    //     PoliEntity poli = poliModel.searchPoli(namaPoli);
    //     if (poli != null) {
    //         ArrayList<PoliEntity.Dokter> listDokter = poli.getAllDokter();
    //         PoliEntity.Dokter dokter = poliModel.searchDokter(namaDokter, listDokter);
    //         if (dokter != null) {
    //             dokter.setHariKerja(newHariKerja);
    //             dokter.setJamKerja(newJamKerja);
    //             poli.updateDokterPoli(listDokter);
    //         } else {
    //             System.out.println("Dokter Tidak Ditemukan!!!");
    //         }
    //     } else {
    //         System.out.println("Poli Tidak Ditemukan!!!");
    //     }
    //     poliModel.commitData();
    // }
    
    

    public PasienEntity searchpasien(String namaPasien) {
        return pasienModel.searchPasien(namaPasien);
    }
}
