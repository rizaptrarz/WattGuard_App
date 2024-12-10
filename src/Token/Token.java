package Token;

public class Token{
    private int nominal;
    private long nomor_token;
    private double Kwh;
    private String metodePembayaran;

    public Token(int nominal, long nomor_token, double Kwh, String metodePembayaran){
        this.nominal = nominal;
        this.nomor_token = nomor_token;
        this.Kwh = Kwh;
        this.metodePembayaran = metodePembayaran;
    }

    public int getNominal(){
        return nominal;
    }

    public long getNomorToken(){
        return nomor_token;
    }

    public double getKwh(){
        return Kwh;
    }

    public String getMetodePembayaran(){
        return metodePembayaran;
    }

    @Override
    public String toString() {
        return "Token [Nominal: " + nominal + ", Nomor Token: " + nomor_token + ", Kwh: " + Kwh + "Jenis Pembayaran: " + getMetodePembayaran() + "]";
    }
}

