package jobsheet07;

public class Dessert {
    public String tepung;
    public String air;
    public String mentega;
    public String telur;

    // Constructor tanpa parameter
    public Dessert() {
        this.tepung = "";
        this.air = "";
        this.mentega = "";
        this.telur = "";
    }

    // Constructor berparameter
    public Dessert(String tepung, String air, String mentega, String telur) {
        this.tepung = tepung;
        this.air = air;
        this.mentega = mentega;
        this.telur = telur;
    }

    // Method untuk menampilkan informasi dessert
    public String getInfo() {
        return "Tepung: " + tepung
                + "\nAir: " + air
                + "\nMentega: " + mentega
                + "\nTelur: " + telur;
    }
}
