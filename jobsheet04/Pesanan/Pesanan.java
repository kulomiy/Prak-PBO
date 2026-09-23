package jobsheet04.Pesanan;

import java.util.ArrayList;

public class Pesanan {
    private String idPesanan;
    private String namaPelanggan;
    private ArrayList<DetailPesanan> daftarDetailPesanan;
    private double totalHarga;

    public Pesanan(String idPesanan, String namaPelanggan) {
        this.idPesanan = idPesanan;
        this.namaPelanggan = namaPelanggan;
        this.daftarDetailPesanan = new ArrayList<>();
        this.totalHarga = 0;
    }

    public void tambahDetailPesanan(DetailPesanan detailPesanan) {
        daftarDetailPesanan.add(detailPesanan);

        detailPesanan.kurangiStok();
    }

    public double hitungTotal() {
        totalHarga = 0;

        for (DetailPesanan detail : daftarDetailPesanan) {
            totalHarga += detail.hitungSubTotal();
        }

        return totalHarga;
    }

    public void tampilkanPesanan() {
        System.out.println("================================");
        System.out.println("          DATA PESANAN          ");
        System.out.println("ID Pesanan     : " + idPesanan);
        System.out.println("Nama Pelanggan : " + namaPelanggan);
        System.out.println("\nDetail Pesanan");

        for (DetailPesanan detail : daftarDetailPesanan) {
            detail.tampilkanDetail();
            System.out.println();
        }

        System.out.println("--------------------------------");
        System.out.println("Total Harga     : Rp" + hitungTotal());
        System.out.println("================================");
    }
}
