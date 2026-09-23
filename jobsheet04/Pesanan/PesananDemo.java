package jobsheet04.Pesanan;

public class PesananDemo {
    public static void main(String[] args) {

        Produk produk1 = new Produk("P001", "Cheese Cake", 45000, 10);
        Produk produk2 = new Produk("P002", "Tiramisu", 50000, 8);
        Produk produk3 = new Produk("P003", "Croissant", 25000, 15);

        DetailPesanan detail1 = new DetailPesanan("D001", produk1, 2);
        DetailPesanan detail2 = new DetailPesanan("D002", produk2, 1);
        DetailPesanan detail3 = new DetailPesanan("D003", produk3, 3);
        Pesanan pesanan = new Pesanan("P001", "Hendery");
        pesanan.tambahDetailPesanan(detail1);
        pesanan.tambahDetailPesanan(detail2);
        pesanan.tambahDetailPesanan(detail3);
        pesanan.tampilkanPesanan();

        System.out.println("\nInformasi Produk:");
        produk1.tampilkanInfo();
        System.out.println();
        produk2.tampilkanInfo();
        System.out.println();
        produk3.tampilkanInfo();
        System.out.println();
    }
}
