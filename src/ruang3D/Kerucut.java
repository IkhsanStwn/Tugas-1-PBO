package ruang3D;
import bidang2D.Lingkaran;

public class Kerucut extends Lingkaran{
    double tinggi, selimut;
    public Kerucut(double r, double keliling, double luas){
        super(r,keliling,luas);
    }

    public double apotema(){
        //selimut = Math.sqrt(Math.pow(r,2) + Math.pow(tinggi,2));
        return selimut;
    }


    public double hitungKeliling(){

        return 0;
    }

    public double hitungLuas(){
        double luasKerucut = luas + (PHI*r*selimut);
        return luasKerucut;
    }

    public double hitungVolume(){
        //volumeKerucut = luas*tinggi/3;
        return luas*tinggi/3;
    }
}
