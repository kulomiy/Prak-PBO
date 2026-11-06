package jobsheet09;

public class Musik implements Media {
    String judul;
    String penyanyi;
    int durasi;

    public Musik(String judul, String penyanyi, int durasi) {
        this.judul = judul;
        this.penyanyi = penyanyi;
        this.durasi = durasi;
    }

    @Override
    public void putar() {
        System.out.println("Musik sedang diputar...");
    }

    @Override
    public void hentikan() {
        System.out.println("Musik dihentikan.");
    }
}
