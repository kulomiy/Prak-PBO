package jobsheet04.Pesanan;

public class DetailPesanan {
    private String idDetail;
    private Produk produk;
    private int jumlah;
    private double subTotal;

    public DetailPesanan(String idDetail, Produk produk, int jumlah) {
        this.idDetail = idDetail;
        this.produk = produk;
        this.jumlah = jumlah;
        this.subTotal = 0;
    }

    public String getDetail() {
        return idDetail;
    }

    public double hitungSubTotal() {
        subTotal = produk.getHarga() * jumlah;
        return subTotal;
    }

    public void kurangiStok() {
        produk.ubahStok(-jumlah);
    }

    public void tampilkanDetail() {
        System.out.println("ID Detail   : " + idDetail);
        System.out.println("Produk      : " + produk.getNamaProduk());
        System.out.println("Harga       : " + produk.getHarga());
        System.out.println("Jumlah      : " + jumlah);
        System.out.println("SubTotal    : Rp" + hitungSubTotal());
    }
}
