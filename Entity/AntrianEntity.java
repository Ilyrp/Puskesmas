package Entity;

import java.util.ArrayList;

public class AntrianEntity {
    private int antri;
    private String namaPoli;
    private ArrayList<PasienEntity> detailPasien;

    public AntrianEntity(int antri, String namaPoli) {
        this.antri = antri;
        this.namaPoli = namaPoli;
        this.detailPasien = new ArrayList<>();
    }

    public int getAntri() {
        return antri;
    }

    public String getNamaPoli() {
        return namaPoli;
    }

    public ArrayList<PasienEntity> getAntrianDetails() {
        return detailPasien;
    }

    public void addPasien(PasienEntity pasien) {
        detailPasien.add(pasien);
    }
}
