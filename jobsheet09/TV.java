package jobsheet09;

public class TV extends AlatElektronik implements Audible {
    public String jenisLayar;
    public int volume;

    @Override
    public void naikkanVolume() {
        volume =+ 1;
        // Implementation for increasing volume
    }

    @Override
    public void turunkanVolume() {
        volume =- 1;
        // Implementation for decreasing volume
    }

    public void getInfo() {
        System.out.println("--- Informasi TV ---");
        super.getInfo();
        System.out.println("Jenis Layar: " + jenisLayar);
        System.out.println("Volume     : " + volume);
    }
}
