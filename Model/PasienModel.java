package Model;

import java.util.ArrayList;

import com.google.gson.reflect.TypeToken;

import Entity.PasienEntity;
import ModelGson.GsonModel;

public class PasienModel {
    ArrayList<PasienEntity> listPasien;
    GsonModel<PasienEntity> modelGsonPasien;

    public PasienModel(){
        listPasien = new ArrayList<PasienEntity>();
        modelGsonPasien = new GsonModel<>("Database/DatabasePasien.json");
        loadData();
    }

    public void addPasien(PasienEntity pasien) {
        listPasien.add(pasien);
        commitData();
    }

    public ArrayList<PasienEntity> getAllPasien() {
        return listPasien;
    }
  
    // public void deletePoli(PasienEntity pasien) {
    //     listPasien.remove(pasien);
    // }

    // public void updatePoli(String namaGame, PasienEntity poli) {
    //     listPasien.contains(poli);
    //     commitData();
    // }

    public PasienEntity searchPasien(String namaPasien) {
        for (PasienEntity pasien : listPasien) {
            if (pasien.getNamaPasien().equalsIgnoreCase(namaPasien)) {
                return pasien;
            }
        }
        return null;
    }

    // public Dokter searchDokter (String namaDokter, ArrayList<Dokter> listDokter){
    //     Dokter dokter = null;
    //     for (Dokter dataDokter : listDokter) {
    //         if (dataDokter.getNamaDokter().equalsIgnoreCase(namaDokter)){
    //             return dataDokter;
    //         }
    //     }
    //     return dokter;
    // }

    
    public void loadData(){
        listPasien = modelGsonPasien.readFromFile(new TypeToken<ArrayList<PasienEntity>>()
            {}.getType());
    }

    public void commitData(){
        modelGsonPasien.WriteToFile(listPasien);
    }
    
}

