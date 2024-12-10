package Informasi;

public class Statistik {
    private double masaPakai;
    private int biaya;
    private int bulan;

    public Statistik(double masaPakai, int biaya, int bulan) {
        this.masaPakai = masaPakai;
        this.biaya = biaya;
        this.bulan = bulan;
    }

    public void setBiaya(int biaya) {
        this.biaya = biaya;
    }

    public void setMasaPakai(double masaPakai) {
        this.masaPakai = masaPakai;
    }

    public String showMasaPakai() {
        return "Statistik{" +
                "masaPakai=" + masaPakai +
                '}';
    }

    public String showBiaya() {
        return "Statistik{" +
                "biaya=" + biaya +
                '}';
    }
}
