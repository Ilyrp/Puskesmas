package Model;

import java.time.LocalDateTime;
import java.util.ArrayList;

import com.google.gson.reflect.TypeToken;

import Entity.PasienEntity;
// import Entity.PasienEntity.Antrian;
import Entity.PoliEntity;
import ModelGson.GsonModel;

public class PasienModel {
    ArrayList<PasienEntity> listPasien;
    GsonModel<PasienEntity> modelGsonPasien;
    PoliModel poliModel;

    
    public PasienModel(PoliModel poliModel) {
        this.listPasien = new ArrayList<PasienEntity>();
        this.modelGsonPasien = new GsonModel<>("Database/DatabasePasien.json");
        this.poliModel = poliModel;
        loadData();
    }

    public void addPasien(PasienEntity pasien) {
        listPasien.add(pasien);
        commitData();
    }

    public ArrayList<PasienEntity> getAllPasien() {
        return listPasien;
    }

    // nanti buat cetak struck
    public PasienEntity searchPasien(String namaPasien) {
        for (PasienEntity pasien : listPasien) {
            if (pasien.getNamaPasien().equalsIgnoreCase(namaPasien)) {
                return pasien;
            }
        }
        return null;
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
