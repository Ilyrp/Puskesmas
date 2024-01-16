package Controller;

import Entity.PasienEntity;
import Model.PasienModel;

public class PasienController {
    private PasienModel pasienModel;

    
    public PasienController(PasienModel pasienModel) {
        this.pasienModel = pasienModel;
    }

    // Create
    public void insertPasien(String nik, String namaPasien, String kelamin, String alamat, String bpjs) {
        pasienModel.addPasien(new PasienEntity(namaPasien, kelamin, nik, alamat, bpjs));
    }

    // public int ambilAntrian(String namaPoli) {
    //     ArrayList<PoliEntity> listPoli = poliModel.getAllPoli();
    //     int nomorAntrian = 0;

    //     for (PoliEntity poli : listPoli) {
    //         if (poli.getNamaPoli().equalsIgnoreCase(namaPoli)) {
    //             nomorAntrian = poli.getNomorAntrian();
    //             poli.setNomorAntrian(nomorAntrian + 1);
    //             pasienModel.commitData();
    //             break;
    //         }
    //     }

    //     return nomorAntrian;
    // }

    public int ambilAntrian(String namaPoli) {
        return pasienModel.ambilAntrian(namaPoli);
    }

    public PasienEntity searchPasien(String namaPasien) {
        return pasienModel.searchPasien(namaPasien);
    }
}
