package model;

import java.util.ArrayList;

import entity.AdminEntity;
import modelGson.GsonModel;

import com.google.gson.reflect.TypeToken;
public class AdminModel {
    ArrayList<AdminEntity> listAdmin;
    GsonModel<AdminEntity> modelGSONAdmin;

    public AdminModel(){
        listAdmin = new ArrayList<AdminEntity>();
        modelGSONAdmin = new GsonModel<>("Database/DatabaseAdmin.json");
        loadData();
    }

    public void addAdmin(AdminEntity Admin) {
        listAdmin.add(Admin);
        commitData();
    }

    private void loadData(){
        listAdmin = modelGSONAdmin.readFromFile(new TypeToken<ArrayList<AdminEntity>>()
            {}.getType());
    }

    public void commitData(){
        modelGSONAdmin.WriteToFile(listAdmin);
    }
}