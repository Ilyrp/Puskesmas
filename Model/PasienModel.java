package model;


import java.time.LocalDateTime;
import java.util.ArrayList;

import com.google.gson.reflect.TypeToken;

import entity.PasienEntity;
import entity.PoliEntity;
import modelGson.GsonModel;

public class PasienModel {
    ArrayList<PasienEntity> listPasien;
    GsonModel<PasienEntity> modelGsonPasien;
    PoliModel poliModel;

    
    public PasienModel() {
        this.listPasien = new ArrayList<PasienEntity>();
        this.modelGsonPasien = new GsonModel<>("Database/DatabasePasien.json");
        this.poliModel = new PoliModel();
        loadData();
    }

    public void addPasien(PasienEntity pasien) {
        listPasien.add(pasien);
        commitData();
    }

    public ArrayList<PasienEntity> getAllPasien() {
        return listPasien;
    }

    public int ambilAntrian(String namaPoli) {
        ArrayList<PoliEntity> listPoli = poliModel.getAllPoli();
        int nomorAntrian = -1;

        for (PoliEntity poli : listPoli) {
            if (poli.getNamaPoli().equalsIgnoreCase(namaPoli)) {
                nomorAntrian = poli.getNomorAntrian() + 1;
                poli.setNomorAntrian(nomorAntrian);
                poliModel.commitData();
                
                break;
            }
        }
        return nomorAntrian;
    }


    public void loadData() {
        listPasien = modelGsonPasien.readFromFile(new TypeToken<ArrayList<PasienEntity>>() {
        }.getType());
    }

    public void commitData() {
        modelGsonPasien.WriteToFile(listPasien);
    }
}
