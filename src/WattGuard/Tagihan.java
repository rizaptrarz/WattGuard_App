package WattGuard;

public class Tagihan {
    // Atribut
    private String idTagihan;
    private boolean status;
    private String metodePembayaran;
    private String tanggal;
    private int biayaAdmin;
    private int total;

    // Konstruktor
    public Tagihan(String idTagihan, boolean status, String metodePembayaran, String tanggal, int biayaAdmin, int total) {
        this.idTagihan = idTagihan;
        this.status = status;
        this.metodePembayaran = metodePembayaran;
        this.tanggal = tanggal;
        this.biayaAdmin = biayaAdmin;
        this.total = total;
    }

    // Metode untuk mencetak informasi tagihan
    public void printTagihan() {
        System.out.println("=== Informasi WattGuard.Tagihan ===");
        System.out.println("ID WattGuard.Tagihan        : " + idTagihan);
        System.out.println("Status            : " + (status ? "Lunas" : "Belum Lunas"));
        System.out.println("Metode Pembayaran : " + metodePembayaran);
        System.out.println("Tanggal           : " + tanggal);
        System.out.println("Biaya Admin       : Rp " + biayaAdmin);
        System.out.println("Total WattGuard.Tagihan     : Rp " + total);
    }

    // Metode untuk membayar tagihan
    public void bayarTagihan(int jumlahBayar) {
        if (jumlahBayar >= total) {
            status = true;
            System.out.println("Pembayaran berhasil! WattGuard.Tagihan telah lunas.");
        } else {
            System.out.println("Pembayaran gagal! Jumlah yang dibayarkan kurang.");
        }
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

    public String getMetodePembayaran() {
        return metodePembayaran;
    }

    public void setMetodePembayaran(String metodePembayaran) {
        this.metodePembayaran = metodePembayaran;
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

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
