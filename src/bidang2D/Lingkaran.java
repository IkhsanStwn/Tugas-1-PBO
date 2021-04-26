package bidang2D;

public class Lingkaran implements Bidang2D {
    public double r, keliling, luas;

    public Lingkaran(double r, double keliling, double luas){
        this.r = r;
        this.keliling = keliling;
        this.luas = luas;
    }

    @Override
    public double hitungKeliling() {
        keliling = 2 * PHI * r;
        return keliling;
    }

    @Override
    public double hitungLuas() {
        luas = PHI*r*r;
        return luas;
    }
}
