package kiralynok;

import java.io.IOException;

public class Kiralynok {

    public static void main(String[] args) throws IOException {
        Tabla tabla = new Tabla('*');
        tabla.Elhelyez(8);
        tabla.Megjelenit();

        System.out.println("Oszlopok: " + tabla.uresOszlopokSzama());
        System.out.println("Sorok: " + tabla.uresSorokSzama());
        
        String fajlnev = "tablak64.txt";
        for (int i = 1; i <= 64; i++) {
            tabla.Elhelyez(i);
            tabla.fajlbaIr(fajlnev);
        }
    }

}
