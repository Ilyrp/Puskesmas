package Controller;

import java.util.ArrayList;

import Entity.PasienEntity;
import Entity.PoliEntity;
import Model.PasienModel;

public class PasienController {
    private PasienModel pasienModel;

    public PasienController() {
        this.pasienModel = new PasienModel();
    }

    // Create
    public void insertPasien(String nik, String namaPasien, String kelamin, String alamat, String bpjs) {
        pasienModel.addPasien(new PasienEntity(namaPasien, kelamin, nik, alamat, bpjs));
    }



    public int ambilAntrian(String namaPoli) {
        return pasienModel.ambilAntrian(namaPoli);
    }

    // public void updatePasien(String nik, int antrian) {
    //     PasienEntity pasien = pasienModel.searchPasien(nik);
    //     if (pasien != null) {
    //         pasien.setAntrian(antrian);
    //         pasienModel.updatePasien(nik, pasien);
    //     } else {
    //         System.out.println("pasien Tidak Ditemukan!!!");
    //     }
    //     pasienModel.commitData();
    // }

    // buat cetak struk nanti
    public PasienEntity searchPasien(String nik) {
        for (PasienEntity pasien : pasienModel.getAllPasien()) {
            if (pasien.getNik().equalsIgnoreCase(nik) || pasien.getBpjs().equalsIgnoreCase(nik)) {
                return pasien;
            }
        }
        return null;
    }

}
