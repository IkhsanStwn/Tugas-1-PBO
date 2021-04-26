import java.util.Scanner;

import bidang2D.*;
import ruang3D.*;


public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        Lingkaran lingkaran = new Lingkaran(0,0,0);
        Bola bola;

        System.out.print("jari-jari = ");
        lingkaran.r = input.nextInt();

        lingkaran.luas = lingkaran.hitungLuas();
        System.out.println("luas = " + lingkaran.luas);

        lingkaran.keliling = lingkaran.hitungKeliling();
        System.out.println("Keliling = " + lingkaran.keliling);

        bola = new Bola(lingkaran.r,lingkaran.keliling,lingkaran.luas);

        System.out.println("luas = " + bola.hitungLuas());
        System.out.println("volume = " + bola.hitungVolume());

        Tabung tabung = new Tabung(lingkaran.r,lingkaran.keliling,lingkaran.luas,0);

        System.out.print("tinggi = ");
        tabung.tinggi = input.nextInt();

        System.out.println("luas = " + tabung.hitungLuas());
        System.out.println("volume = " + tabung.hitungVolume());
    }
}
