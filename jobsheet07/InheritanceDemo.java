package jobsheet07;

public class InheritanceDemo {
    public static void main(String[] args) {

        // Membuat objek RotiTawar
        RotiTawar roti1 = new RotiTawar(
                "Terigu", "Air mineral", "Mentega",
                "Telur ayam", "Ragi instan", "Wijen"
        );

        // Membuat objek Brownies
        Brownies brownies1 = new Brownies(
                "Terigu", "Air mineral", "Mentega",
                "Telur ayam", "Cokelat batang", "Choco chips",
                "Krim cokelat", "Baking powder"
        );

        // Menampilkan informasi kedua objek
        System.out.println(roti1.getInfo());
        System.out.println();

        System.out.println(brownies1.getInfo());
    }
}