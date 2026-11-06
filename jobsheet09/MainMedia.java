package jobsheet09;

public class MainMedia {
    public static void main(String[] args) {
        Media musik = new Musik("Blue", "Yung Kai", 3);
        Media podcast = new Podcast("Cerita Tengah Malam", "Andi", 30, 5);

        System.out.println("=== MUSIK ===");
        System.out.println("Judul: " + ((Musik) musik).judul);
        System.out.println("Penyanyi: " + ((Musik) musik).penyanyi);
        System.out.println("Durasi: " + ((Musik) musik).durasi + " menit");
        musik.putar();
        musik.hentikan();
        System.out.println();

        System.out.println("=== PODCAST ===");
        System.out.println("Judul: " + ((Podcast) podcast).judul);
        System.out.println("Host: " + ((Podcast) podcast).host);
        System.out.println("Durasi: " + ((Podcast) podcast).durasi + " menit");
        System.out.println("Episode: " + ((Podcast) podcast).episode);
        podcast.putar();
        podcast.hentikan();
    }
}