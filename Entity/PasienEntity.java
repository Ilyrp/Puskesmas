package Entity;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class PasienEntity {
    private String nama;
    private String kelamin;
    private String nik;
    private String alamat;
    private String bpjs;  
    // ArrayList <Antrian> antrian;

    public PasienEntity(String nama, String kelamin, String nik, String alamat, String bpjs) {
        this.nama = nama;
        this.kelamin = kelamin;
        this.nik = nik;
        this.alamat = alamat;
        this.bpjs = bpjs;
        // this.antrian = new ArrayList<>(); 
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
    public String getNik(){
        return nik;
    }
    public void setNik(String nik){
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


    

    // public class Antrian{
        
    //     LocalDateTime time = LocalDateTime.now();

    //     public Antrian(LocalDateTime time){
    //         this.time = time;
    //     }

    //     public LocalDateTime getTime(){
    //         return time;
    //     }
// 
    // }
}
