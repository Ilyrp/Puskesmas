package Entity;

import java.util.ArrayList;

public class PoliEntity {
    private int antrian;
    private String namaPoli;
    private String alamatPoli;
    public ArrayList<Dokter> listDokter;

    public PoliEntity(int antrian,String namaPoli, String alamatPoli) {
        this.antrian = antrian;
        this.namaPoli = namaPoli;
        this.alamatPoli = alamatPoli;
        this.listDokter = new ArrayList<>(); // Inisialisasi listDokter biar bikin arraylist baru
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

    public ArrayList<Dokter> getAllDokter() {
        return this.listDokter;
    }

    public void addDokter(String namaDokter, String spesialis, String hariKerja, String jamKerja) {
        Dokter dokter = new Dokter(namaDokter, spesialis, hariKerja, jamKerja);
        listDokter.add(dokter);
    }
    

    public void updateDokterPoli(ArrayList<Dokter> listDokters) {
        this.listDokter = listDokters;
    }

    public static class Dokter {
        private String namaDokter;
        private String spesialis;
        private String hariKerja;
        private String jamKerja;

        public Dokter(String namaDokter, String spesialis,String hariKerja,String jamKerja) {
            this.namaDokter = namaDokter;
            this.spesialis = spesialis;
            this.hariKerja = hariKerja;
            this.jamKerja = jamKerja;
        }

        public String getNamaDokter() {
            return namaDokter;
        }

        public String getSpesialis() {
            return spesialis;
        }

        public void setNamaDokter(String namaDokter) {
            this.namaDokter = namaDokter;
        }

        public void setSpesialis(String spesialis) {
            this.spesialis = spesialis;
        }

        public String getHariKerja() {
            return hariKerja;
        }

        public void setHariKerja(String hariKerja) {
            this.hariKerja = hariKerja;
        }

        public void setJamKerja(String jamKerja){
            this.jamKerja = jamKerja;
        }

        public String getJamKerja(){
            return jamKerja;
        }
    }
}
