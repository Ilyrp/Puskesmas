package entity;

import java.util.ArrayList;

public class PoliEntity {
    private int antrian;
    private String namaPoli;
    private String alamatPoli;
    public ArrayList<DokterEntity> listDokter;

    public PoliEntity(int antrian,String namaPoli, String alamatPoli) {
        this.antrian = antrian;
        this.namaPoli = namaPoli;
        this.alamatPoli = alamatPoli;
        this.listDokter = new ArrayList<>();
    }
    public void setNomorAntrian(int antrian){
        this.antrian = antrian;
    }
    public int getNomorAntrian(){ 
        return antrian;
    }

    public String getNamaPoli() {
        return namaPoli;
    }

    public void setNamaPoli(String namaPoli) {
        this.namaPoli = namaPoli;
    }

    public String getAlamatPoli() {
        return alamatPoli;
    }

    public void setAlamatPoli(String alamatPoli) {
        this.alamatPoli = alamatPoli;
    }

    public ArrayList<DokterEntity> getAllDokter() {
        return this.listDokter;
    

 

    }
}
