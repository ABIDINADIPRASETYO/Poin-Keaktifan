package ub.poros.divisimobile.poinkeaktifan.Model;

public class model {
    String nama, divisi;

    public model(String nama, String divisi){
        this.nama = nama;
        this.divisi = divisi;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDivisi() {
        return divisi;
    }

    public void setDivisi(String divisi) {
        this.divisi = divisi;
    }

}
