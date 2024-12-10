import java.util.Scanner;

public class Chatbot {
    Scanner sc = new Scanner(System.in);
    private int jmlData;
    private String[] jawaban;
    private String[] pertanyaan;

    public Chatbot(int jmlData) {
        this.jmlData = jmlData;
        this.jawaban = new String[jmlData];
        this.pertanyaan = new String[jmlData];
    }

    public void setPertanyaanDanJawaban() {
        for (int i = 0; i < jmlData; i++) {
            pertanyaan[i] = sc.next();
            jawaban[i] = sc.next();
        }
    }

    public int menuPertanyaan(int input) {
        for (String q : pertanyaan) {
            System.out.println(q);
        }
        input = sc.nextInt();
        return input;
    }

    public void jawabanPertanyaan(int n) {
        System.out.println(jawaban[n]);
    }
}
