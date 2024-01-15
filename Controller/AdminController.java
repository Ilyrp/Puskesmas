package Controller;

import Entity.AdminEntity;
import Model.AdminModel;

public class AdminController {
    private AdminModel modelAdmin;

    public AdminController(AdminModel modelAdmin) {
        this.modelAdmin = modelAdmin;
    }

    public void insertAdmin(String username, String password) {
        modelAdmin.addAdmin(new AdminEntity(username, password));
    }
}