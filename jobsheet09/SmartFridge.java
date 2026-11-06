package jobsheet09;

public class SmartFridge extends Kulkas implements Audible {
    public int volume;
    public String ukuranLayar;

    @Override
    public void naikkanVolume() {
        volume =+ 1;
    }

    @Override
    public void turunkanVolume() {
        volume =- 1;
    }

    @Override
    public void getInfo() {
        System.out.println("--- Informasi Smart Fridge ---");
        System.out.println("Merk        : " + merk);
        System.out.println("Warna       : " + warna);
        System.out.println("Harga       : " + harga);
        System.out.println("Jumlah Pintu: " + jumlahPintu);
        System.out.println("Ukuran Layar: " + ukuranLayar);
        System.out.println("Volume      : " + volume);
    }
}