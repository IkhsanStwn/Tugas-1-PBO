package ruang3D;
import bidang2D.Lingkaran;

public class Tabung extends Lingkaran{
    public double tinggi;

    public Tabung(double r, double keliling, double luas, double tinggi) {
        super(r, keliling, luas);
        this.tinggi = tinggi;
    }

    public double hitungLuas() {
        double luasTabung = keliling * (r + tinggi);
        return luasTabung;
    }

    public double hitungVolume() {
        //volumeTabung= luas*tinggi;
        return luas*tinggi;
    }

}
