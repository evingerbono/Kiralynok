package kiralynok;

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
}
