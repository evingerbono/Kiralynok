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
    
    public boolean uresOszlop(int oszlop){
        int i = 0;
        while(i < 8 && !(T[i][oszlop] == 'K')){
            i++;
        }
        return i >= 8;
    }
    
    public boolean uresSor(int sor){
        int i = 0;
        while(i < 8 && !(T[sor][i] == 'K')){
            i++;
        }
        return i >= 8;
    }
    
    public int uresOszlopokSzama(){
        int oszlopDb = 0;
        for (int i = 0; i < 8; i++) {
            if(uresOszlop(i)){
                oszlopDb++;
            }
        }
        return oszlopDb;
    }
    
    public int uresSorokSzama(){
        int sorDb = 0;
        for (int i = 0; i < 8; i++) {
            if(uresSor(i)){
                sorDb++;
            }
        }
        return sorDb;
    }
}
