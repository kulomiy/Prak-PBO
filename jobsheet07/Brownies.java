package jobsheet07;

public class Brownies extends Dessert {
    public String cokelat;
    public String chocoChips;
    public String krim;
    public String pengembang;

    // Constructor tanpa parameter
    public Brownies() {
        super();
        this.cokelat = "";
        this.chocoChips = "";
        this.krim = "";
        this.pengembang = "";
    }

    // Constructor berparameter
    public Brownies(String tepung, String air, String mentega,
                    String telur, String cokelat, String chocoChips,
                    String krim, String pengembang) {
        super(tepung, air, mentega, telur);
        this.cokelat = cokelat;
        this.chocoChips = chocoChips;
        this.krim = krim;
        this.pengembang = pengembang;
    }

    // Overriding method getInfo()
    public String getInfo() {
        return "=== INFORMASI BROWNIES ===\n"
                + super.getInfo()
                + "\nCokelat: " + cokelat
                + "\nChoco chips: " + chocoChips
                + "\nKrim: " + krim
                + "\nPengembang: " + pengembang;
    }
}
