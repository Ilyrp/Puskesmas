package entity;

public class DokterEntity {
    private String namaDokter;
    private String spesialis;
    private String hariKerja;
    private String jamKerja;

    public DokterEntity(String namaDokter, String spesialis,String hariKerja,String jamKerja) {
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