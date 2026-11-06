package jobsheet09;

public class Podcast implements Media {
    String judul;
    String host;
    int durasi;
    int episode;

    public Podcast(String judul, String host, int durasi, int episode) {
        this.judul = judul;
        this.host = host;
        this.durasi = durasi;
        this.episode = episode;
    }

    @Override
    public void putar() {
        System.out.println("Podcast sedang diputar...");
    }

    @Override
    public void hentikan() {
        System.out.println("Podcast dihentikan.");
    }
}