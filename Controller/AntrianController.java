package Controller;

import Model.PasienModel;

public class AntrianController {
    private PasienModel pasienModel;

    public AntrianController(PasienModel pasienModel) {
        this.pasienModel = pasienModel;
    }
    public int ambilAntrian(String namaPoli) {
        return pasienModel.ambilAntrian(namaPoli);

    }
    
}
