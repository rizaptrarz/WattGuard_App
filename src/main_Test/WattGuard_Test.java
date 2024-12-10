package main_Test;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in th
import java.util.ArrayList;
import Token.Token;
import Token.Tagihan;

public class WattGuard_Test {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        ArrayList<Token> daftarToken = new ArrayList<>();

        daftarToken.add(new Token(50000, 1234567890123456L, 30.0, "Transfer Bank"));
        daftarToken.add(new Token(100000, 1234567890123457L, 60.0, "Transfer Bank"));

        for (Token token : daftarToken) {
            System.out.println(token);
        }

    }
}