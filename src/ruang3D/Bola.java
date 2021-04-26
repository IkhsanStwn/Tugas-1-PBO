package ruang3D;
import bidang2D.Lingkaran;

public class Bola extends Lingkaran{
    public Bola(double r, double keliling, double luas){
        super(r,keliling,luas);
    }

    public double hitungLuas(){
        double luasBola = 4 * luas;
        return luasBola;
    }

    public double hitungVolume(){
        double volumeBola = (4/3)*luas*r;
        return volumeBola;
    }

}
