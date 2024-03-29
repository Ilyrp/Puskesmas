package model;

import java.util.ArrayList;

import com.google.gson.reflect.TypeToken;

import entity.DokterEntity;
import entity.PoliEntity;
import modelGson.GsonModel;

public class PoliModel {
    ArrayList<PoliEntity> listPoli;
    PoliEntity poliEntity;
    GsonModel<PoliEntity> modelGsonPoli;

    public PoliModel(){
        listPoli = new ArrayList<PoliEntity>();
        modelGsonPoli = new GsonModel<>("Database/DatabasePoli.json");
        loadData();
    }

    public void addPoli(PoliEntity Poli) {
        listPoli.add(Poli);
        commitData();
    }

    public ArrayList<PoliEntity> getAllPoli() {
        loadData();
        return listPoli;
    }
  
    public void deletePoli(PoliEntity poli) {
        listPoli.remove(poli);
    }

    public void updatePoli(String namaPoli, PoliEntity poli) {
        listPoli.contains(poli);
        commitData();
    }

    public PoliEntity searchPoli(String namaPoli) {
        for (PoliEntity Poli : listPoli) {
            if (Poli.getNamaPoli().equalsIgnoreCase(namaPoli)) {
                return Poli;
            }
        }
        return null;
    }

    public DokterEntity searchDokter (String namaDokter, ArrayList<DokterEntity> listDokter){
        DokterEntity dokter = null;
        for (DokterEntity dataDokter : listDokter) {
            if (dataDokter.getNamaDokter().equalsIgnoreCase(namaDokter)){
                return dataDokter;
            }
        }
        return dokter;
    }
    
    
    public void loadData(){
        listPoli = modelGsonPoli.readFromFile(new TypeToken<ArrayList<PoliEntity>>()
            {}.getType());
    }

    public void commitData(){
        modelGsonPoli.WriteToFile(listPoli);
    }
    
}
