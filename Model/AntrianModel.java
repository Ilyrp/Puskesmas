package Model;

import java.util.ArrayList;

import com.google.gson.reflect.TypeToken;

import Entity.PasienEntity;
import Entity.PoliEntity;
import ModelGson.GsonModel;

public class AntrianModel {
    ArrayList<PasienEntity> listPasien;
    GsonModel<PasienEntity> modelGsonPasien;
    PoliModel poliModel;


    public AntrianModel(PoliModel poliModel) {
        this.listPasien = new ArrayList<PasienEntity>();
        this.modelGsonPasien = new GsonModel<>("Database/DatabaseAntrian.json");
        this.poliModel = poliModel;
        loadData();
    }

    public ArrayList<PasienEntity> getAllPasien() {
        return listPasien;
    }

    public int ambilAntrian(String namaPoli) {
        ArrayList<PoliEntity> listPoli = poliModel.getAllPoli();
        int nomorAntrian = 0;

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