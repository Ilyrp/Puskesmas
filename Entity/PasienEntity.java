package Entity;

public class PasienEntity {
    private String nama;
    private String kelamin;
    private int nik;
    private String alamat;
    private String bpjs;  

    public PasienEntity(String nama, String kelamin, int nik, String alamat, String bpjs) {
        this.nama = nama;
        this.kelamin = kelamin;
        this.nik = nik;
        this.alamat = alamat;
        this.bpjs = bpjs;
    }

    public String getNamaPasien() {
        return nama;
    }
    public void setNamaPasien(String nama) {
        this.nama = nama;
    }
    public String getKelamin(){
        return kelamin;
    }
    public void setKelamin(String kelamin){
        this.kelamin = kelamin;
    }
    public int getNik(){
        return nik;
    }
    public void setNik(int nik){
        this.nik = nik;
    }  
    public String getAlamat(){
        return alamat;
    }
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    public String getBpjs(){
        return bpjs;
    }
    public void setBpjs(String bpjs){
        this.bpjs = bpjs;
    }
}
