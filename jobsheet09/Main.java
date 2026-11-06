package jobsheet09;

public class Main {
    public static void main(String[] args) {
        TV tv = new TV();
        tv.merk = "Samsung";
        tv.warna = "Hitam";
        tv.harga = 3500000.0;
        tv.jenisLayar = "LED";
        tv.naikkanVolume();

        Kulkas kulkas = new Kulkas();
        kulkas.merk = "Sharp";
        kulkas.warna = "Silver";
        kulkas.harga = 2800000.0;
        kulkas.jumlahPintu = 2;

        tv.getInfo();
        System.out.println();
        kulkas.getInfo();
    }
}