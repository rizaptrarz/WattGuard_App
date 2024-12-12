import java.util.Scanner;

public class Chatbot {
    Scanner sc = new Scanner(System.in);
    private int jmlData;
    private String[] jawaban;
    private String[] pertanyaan;


    public Chatbot(int jmlData) {
        this.jmlData = jmlData;
        this.jawaban = new String[]{
                "Buka menu \"Beli Token Listrik,\" pilih nominal, lakukan pembayaran, dan sistem akan mengirimkan kode token.",
                "Periksa kode token dan meteran listrik. Jika tetap gagal, hubungi layanan pelanggan di aplikasi.",
                "Gunakan menu \"Statistik\" untuk melihat data real-time sisa daya listrik Anda.",
                "Mendukung transfer bank, e-wallet, dan gerai ritel untuk pembayaran token.",
                "Notifikasi otomatis muncul jika konsumsi mendekati batas yang ditentukan.",
                "Gunakan fitur \"Kalkulator Biaya Listrik\" di menu \"Statistik\" untuk menghitung biaya.",
                "Gunakan opsi \"Lupa Kata Sandi\" di halaman login untuk mereset kata sandi.",
                "Saat ini hanya mendukung token prabayar, bukan tagihan reguler.",
                "Data historis dapat diakses melalui menu \"Statistik\" di aplikasi.",
                "Ya, tersedia gamifikasi dan tips hemat energi yang disesuaikan untuk pengguna.",
                "Pastikan koneksi internet stabil atau perbarui aplikasi ke versi terbaru.",
                "Tidak, aplikasi membutuhkan koneksi internet untuk bekerja.",
                "Buka menu \"Statistik\" untuk melihat rincian konsumsi energi Anda.",
                "Saat ini hanya mendukung satu meteran per akun pengguna.",
                "Notifikasi membantu memantau konsumsi energi dan mengingatkan pembelian token.",
                "Gunakan menu \"Daftar,\" isi data pribadi seperti nama, email, dan kata sandi.",
                "Ya, tersedia untuk Android dan iOS melalui Google Play Store dan App Store.",
                "Data dilindungi dengan enkripsi dan autentikasi untuk menjaga keamanan.",
                "Fitur ini memperkirakan masa penggunaan listrik berdasarkan konsumsi saat ini.",
                "Ya, layanan pelanggan tersedia melalui menu \"Layanan Pengguna\" di aplikasi."
        };

        this.pertanyaan = new String[]{
                "Bagaimana cara membeli token listrik menggunakan aplikasi WattGuard?",
                "Apa yang harus dilakukan jika token listrik tidak dapat digunakan?",
                "Bagaimana cara mengetahui sisa daya listrik yang tersedia?",
                "Apa saja metode pembayaran yang didukung oleh aplikasi WattGuard?",
                "Bagaimana cara menerima notifikasi batas penggunaan daya listrik?",
                "Bagaimana cara memperkirakan biaya penggunaan listrik bulanan?",
                "Apa langkah yang harus dilakukan jika saya lupa kata sandi akun WattGuard?",
                "Apakah aplikasi WattGuard mendukung pembayaran tagihan listrik reguler?",
                "Bagaimana cara mengakses data historis penggunaan listrik?",
                "Apakah aplikasi ini menyediakan fitur hemat energi?",
                "Apa yang harus dilakukan jika aplikasi WattGuard tidak dapat diakses?",
                "Apakah aplikasi WattGuard dapat digunakan tanpa koneksi internet?",
                "Bagaimana cara mendapatkan informasi penggunaan listrik secara detail?",
                "Apakah aplikasi WattGuard mendukung lebih dari satu meteran listrik?",
                "Apa manfaat dari fitur notifikasi aplikasi WattGuard?",
                "Apa manfaat dari fitur notifikasi aplikasi WattGuard?",
                "Apakah aplikasi WattGuard tersedia untuk perangkat iOS?",
                "Bagaimana aplikasi WattGuard memastikan data pengguna tetap aman?",
                "Apa yang dimaksud dengan fitur \"Cek Masa Pakai\"?",
                "Apakah aplikasi WattGuard memiliki layanan pelanggan?"
        };
    }

    public void displayPertanyaan() {
        System.out.println("====================================");
        System.out.println("       SELAMAT DATANG DI            ");
        System.out.println("       LAYANAN TOKEN LISTRIK        ");
        System.out.println("====================================");
        System.out.println("   Pilih Pertanyaan yang Anda Butuhkan:");
        System.out.println("------------------------------------");


        for (int i = 0; i < pertanyaan.length; i++) {
            System.out.println((i + 1) + ". " + pertanyaan[i]);
        }


        System.out.print("Pilih nomor pertanyaan (1-" + pertanyaan.length + "): ");
        int pilih = sc.nextInt();


        switch (pilih) {
            case 1:
                System.out.println("Jawaban: " + jawaban[0]);
                break;
            case 2:
                System.out.println("Jawaban: " + jawaban[1]);
                break;
            case 3:
                System.out.println("Jawaban: " + jawaban[2]);
                break;
            case 4:
                System.out.println("Jawaban: " + jawaban[3]);
                break;
            case 5:
                System.out.println("Jawaban: " + jawaban[4]);
                break;
            case 6:
                System.out.println("Jawaban: " + jawaban[5]);
                break;
            case 7:
                System.out.println("Jawaban: " + jawaban[6]);
                break;
            case 8:
                System.out.println("Jawaban: " + jawaban[7]);
                break;
            case 9:
                System.out.println("Jawaban: " + jawaban[8]);
                break;
            case 10:
                System.out.println("Jawaban: " + jawaban[9]);
                break;
            case 11:
                System.out.println("Jawaban: " + jawaban[10]);
                break;
            case 12:
                System.out.println("Jawaban: " + jawaban[11]);
                break;
            case 13:
                System.out.println("Jawaban: " + jawaban[12]);
                break;
            case 14:
                System.out.println("Jawaban: " + jawaban[13]);
                break;
            case 15:
                System.out.println("Jawaban: " + jawaban[14]);
                break;
            case 16:
                System.out.println("Jawaban: " + jawaban[15]);
                break;
            case 17:
                System.out.println("Jawaban: " + jawaban[16]);
                break;
            case 18:
                System.out.println("Jawaban: " + jawaban[17]);
                break;
            case 19:
                System.out.println("Jawaban: " + jawaban[18]);
                break;
            case 20:
                System.out.println("Jawaban: " + jawaban[19]);
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                break;
        }
    }
}

