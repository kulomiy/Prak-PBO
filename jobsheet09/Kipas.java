package jobsheet09;

public class Kipas extends AlatElektronik {
    public String jenis;

    @Override
    public void getInfo() {
        System.out.println("--- Informasi Kipas ---");
        super.getInfo();
        System.out.println("Jenis : " + jenis);
    }
}
