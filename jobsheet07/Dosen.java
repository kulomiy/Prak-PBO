package jobsheet07;

public class Dosen extends Pegawai { //dosen merupakan child class dari pegawai
    public String nidn;

    public Dosen(String nip, String nama, double gaji, String nidn) {
        super(nip, nama, gaji);
        this.nidn = nidn;
    }

    public String getInfo() {
        return "NIDN:   : " + this.nidn + "\n";
    }
    public String getAllInfo() {
        // String info = super.getInfo();
        // info += "NIP:    : " + super.nip + "\n";
        // info += "Nama:   : " + super.nama + "\n";
        // info += "Gaji:   : " + super.gaji + "\n";
        // info += "NIDN:   : " + this.nidn + "\n";
        
        String info = super.getInfo();
        info += this.getInfo();

        return info;
    }
}
// System.out.println("Ini constructor class Dosen");