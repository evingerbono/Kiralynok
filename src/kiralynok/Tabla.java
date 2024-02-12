package kiralynok;

import java.util.Random;

public class Tabla {

    private char[][] T;
    private char uresCella;

    public Tabla(char uresCella) {
        T = new char[8][8];
        this.uresCella = uresCella;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                T[i][j] = uresCella;
            }
        }
    }

    public void Megjelenit() {
        for (int i = 0; i < T.length; i++) {
            for (int j = 0; j < T[i].length; j++) {
                System.out.print(T[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void Elhelyez(int N) {
        Random rnd = new Random();
        int db = 0;

        while (db < N) {
            int sor = rnd.nextInt(8);
            int oszlop = rnd.nextInt(8);
            if (T[sor][oszlop] != 'K') {
                T[sor][oszlop] = 'K';
                db++;
            }
        }
    }
}
