package controller;

import java.util.ArrayList;

import entity.DokterEntity;
import entity.PoliEntity;
import model.PoliModel;

public class PoliController {
    private PoliModel poliModel;
    private PoliEntity poliEntity;

    public PoliController() {
        this.poliModel = new PoliModel();
    }

    // Create
    public void insertPoli(int poli,String namaPoli, String alamatPoli) {
        poliModel.addPoli(new PoliEntity(poli,namaPoli, alamatPoli));
    }

    // View
    public ArrayList<PoliEntity> viewAllPoli() {
    return poliModel.getAllPoli();
}


    // Delete
    public void deletePoli(String namaPoli) {
        PoliEntity poli = poliModel.searchPoli(namaPoli);
        if (poli != null) {
            poliModel.deletePoli(poli);
            System.out.println("Poli " + namaPoli + " berhasil dihapus.");
        } else {
            System.out.println("Poli tidak ditemukan!");
        }
        poliModel.commitData();
    }




    // Insert Praktek
    public void addDokter(PoliEntity poli, String namaDokter, String spesialis, String hariKerja, String jamKerja) {
        poli.getAllDokter().add(new DokterEntity(namaDokter, spesialis, hariKerja, jamKerja));
    }
    public void insertPraktek(String namaPoli, String namaDokter, String spesialis, String hariKerja, String jamKerja) {
        PoliEntity poli = poliModel.searchPoli(namaPoli);
        if (poli != null) {
            addDokter(poli, namaDokter, spesialis, hariKerja, jamKerja);
            poliModel.updatePoli(namaPoli, poli);
            poliModel.commitData();
            System.out.println("Praktek " + namaDokter + " di Poli " + namaPoli + " berhasil ditambahkan.");
        } else {
            System.out.println("Poli tidak ditemukan!");
        }
    }



    // UpdateDokter
    public void updateDokterPoli(ArrayList<DokterEntity> listDokters) {
        if (poliEntity != null) {
            poliEntity.listDokter = listDokters;
        }
    }
    public void updateDokter(String namaPoli, String namaDokter, String prevHariKerja, String newHariKerja, String prevJamKerja, String newJamKerja) {
        PoliEntity poli = poliModel.searchPoli(namaPoli);
        if (poli != null) {
            ArrayList<DokterEntity> listDokter = poli.getAllDokter();
            DokterEntity dokter = poliModel.searchDokter(namaDokter, listDokter);
            if (dokter != null) {
                dokter.setHariKerja(newHariKerja);
                dokter.setJamKerja(newJamKerja);
                updateDokterPoli(listDokter);
                poliModel.commitData();
            } else {
                System.out.println("Dokter Tidak Ditemukan!!!");
            }
        } else {
            System.out.println("Poli Tidak Ditemukan!!!");
        }
    }
    
    

    // buat cari data poli
    public PoliEntity searchPoli(String namaPoli) {
        return poliModel.searchPoli(namaPoli);
    }

}
