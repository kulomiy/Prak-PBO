package jobsheet04.RumahSakit;

public class Pegawai {
    private String nip;
    private String nama;

    public Pegawai(String nip, String nama) {
        this.nip = nip; //atribut milik object
        this.nama = nama; //parameter constructor. Jadi nilainya dipindahkan dari parameter ke atribut objek
    }

    public String getNIP() {
        return nip;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getInfo() {
        return nama + " (" + nip + ")";
    }
}
