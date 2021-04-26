package bidang2D;

public class Lingkaran implements Bidang2D {
    public double r, keliling, luas;

    public Lingkaran(double r){
        this.r = r;
        this.keliling = hitungKeliling();
        this.luas = hitungLuas();
    }

    @Override
    public double hitungKeliling() {
        return  2*PHI*r;
    }

    @Override
    public double hitungLuas() {
        return  PHI*Math.pow(r,2);
    }
}
