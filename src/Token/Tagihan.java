package Token;

public class Tagihan extends Token{
    // Atribut
    private String idTagihan;
    private boolean status;
    private String tanggal;
    private int biayaAdmin;

    // Konstruktor
    public Tagihan(int nominal, long nomor_token, double Kwh, String metodePembayaran, String idTagihan, boolean status, String tanggal, int biayaAdmin) {
        super(nominal, nomor_token, Kwh, metodePembayaran);
        this.idTagihan = idTagihan;
        this.status = status;
        this.tanggal = tanggal;
        this.biayaAdmin = biayaAdmin;
    }

    // Getter dan Setter (opsional, jika diperlukan)
    public String getIdTagihan() {
        return idTagihan;
    }

    public void setIdTagihan(String idTagihan) {
        this.idTagihan = idTagihan;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public int getBiayaAdmin() {
        return biayaAdmin;
    }

    public void setBiayaAdmin(int biayaAdmin) {
        this.biayaAdmin = biayaAdmin;
    }



    // Metode untuk mencetak informasi tagihan
    public void printTagihan() {
        System.out.println("=== Informasi Tagihan ===");
        System.out.println("ID Tagihan        : " + idTagihan);
        System.out.println("Status            : " + (status ? "Lunas" : "Belum Lunas"));
        System.out.println("Metode Pembayaran : " + super.getMetodePembayaran());
        System.out.println("Tanggal           : " + tanggal);
        System.out.println("Biaya Admin       : Rp " + biayaAdmin);
        System.out.println("Total Tagihan     : Rp " + super.getNominal());
    }

    // Metode untuk membayar tagihan
    public void bayarTagihan(int jumlahBayar) {
        if (jumlahBayar >= super.getNominal()) {
            status = true;
            System.out.println("Pembayaran berhasil! Tagihan telah lunas.");
        } else {
            System.out.println("Pembayaran gagal! Jumlah yang dibayarkan kurang.");
        }
    }
}
