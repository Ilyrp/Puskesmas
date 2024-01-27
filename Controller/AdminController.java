package controller;

import entity.AdminEntity;
import model.AdminModel;

public class AdminController {
    private AdminModel modelAdmin;

    public AdminController() {
        this.modelAdmin = new AdminModel();
    }

    public void insertAdmin(String username, String password) {
        modelAdmin.addAdmin(new AdminEntity("admin", "admin"));
    }
}