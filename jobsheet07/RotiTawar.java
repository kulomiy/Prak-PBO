package jobsheet07;

public class RotiTawar extends Dessert {
    public String ragi;
    public String bijiBijian;

    // Constructor tanpa parameter
    public RotiTawar() {
        super();
        this.ragi = "";
        this.bijiBijian = "";
    }

    // Constructor berparameter
    public RotiTawar(String tepung, String air, String mentega,
                    String telur, String ragi, String bijiBijian) {
        super(tepung, air, mentega, telur);
        this.ragi = ragi;
        this.bijiBijian = bijiBijian;
    }

    // Overriding method getInfo()
    public String getInfo() {
        return "=== INFORMASI ROTI TAWAR ===\n"
                + super.getInfo()
                + "\nRagi: " + ragi
                + "\nBiji-bijian: " + bijiBijian;
    }
}
