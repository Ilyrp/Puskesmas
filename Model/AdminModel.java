package Model;

import java.util.ArrayList;

import ModelGson.GsonModel;
import Entity.AdminEntity;

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