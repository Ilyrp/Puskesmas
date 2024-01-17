package Controller;

import java.util.ArrayList;
import Entity.PoliEntity;
import Model.PoliModel;

public class PoliController {
    private PoliModel poliModel;

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
    public void insertPraktek(String namaPoli, String namaDokter, String spesialis,String hariKerja,String jamKerja) {
        PoliEntity poli = poliModel.searchPoli(namaPoli);
        if (poli != null) {
            poli.addDokter(namaDokter, spesialis, hariKerja, jamKerja);
            poliModel.updatePoli(namaPoli, poli);
            System.out.println("Praktek " + namaDokter + " di Poli " + namaPoli + " berhasil ditambahkan.");
        } else {
            System.out.println("Poli tidak ditemukan!");
        }
    }

    public void updateDokter(String namaPoli, String namaDokter, String prevHariKerja, String newHariKerja, String prevJamKerja, String newJamKerja) {
        PoliEntity poli = poliModel.searchPoli(namaPoli);
        if (poli != null) {
            ArrayList<PoliEntity.Dokter> listDokter = poli.getAllDokter();
            PoliEntity.Dokter dokter = poliModel.searchDokter(namaDokter, listDokter);
            if (dokter != null) {
                dokter.setHariKerja(newHariKerja);
                dokter.setJamKerja(newJamKerja);
                poli.updateDokterPoli(listDokter);
            } else {
                System.out.println("Dokter Tidak Ditemukan!!!");
            }
        } else {
            System.out.println("Poli Tidak Ditemukan!!!");
        }
        poliModel.commitData();
    }
    
    

    public PoliEntity searchPoli(String namaPoli) {
        return poliModel.searchPoli(namaPoli);
    }
}
