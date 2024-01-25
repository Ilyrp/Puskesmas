package controller;

import entity.AntrianEntity;
import entity.PasienEntity;
import entity.PoliEntity;
import model.AntrianModel;
import model.PasienModel;
import model.PoliModel;

public class PasienController {
    private PasienModel pasienModel;
    private PoliModel poliModel;
    AntrianModel antrianModel;
    PoliEntity poliEntity;

    public PasienController() {
        this.pasienModel = new PasienModel();
        this.poliModel = new PoliModel();
        this.antrianModel = new AntrianModel();
    }

    // Create
    public void insertPasien(String nik, String namaPasien, String kelamin, String alamat, String bpjs) {
        pasienModel.addPasien(new PasienEntity(namaPasien, kelamin, nik, alamat, bpjs));
    }

    public int ambilAntrian(String namaPoli, String nik) {
        return pasienModel.ambilAntrian(namaPoli);
    }

    // buat cetak struk nanti
    public PasienEntity searchPasien(String nik) {
        for (PasienEntity pasien : pasienModel.getAllPasien()) {
            if (pasien.getNik().equalsIgnoreCase(nik) || pasien.getBpjs().equalsIgnoreCase(nik)) {
                return pasien;
            }
        }
        return null;
    }

    public void addAntrian(String namaPoli, PasienEntity pasienEntity) {
        PoliEntity poliEntity = poliModel.searchPoli(namaPoli);
        if (poliEntity != null) {
            AntrianEntity antrian = new AntrianEntity(poliEntity.getNomorAntrian() + 1, namaPoli);
            antrian.addPasien(pasienEntity);
            antrianModel.addAntrian(antrian);
        }
    }

    public AntrianEntity searchAntrian(int nomorAntrian, String namaPoli) {
        return antrianModel.searchAntrian(nomorAntrian, namaPoli);
    }

}
