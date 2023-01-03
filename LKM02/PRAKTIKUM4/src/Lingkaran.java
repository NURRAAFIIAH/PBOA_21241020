class HitungLingkaran{
    double jarijari;
    double phi;
    double Keliling,Luas;

    HitungLingkaran(int jarijari){
        this.jarijari = jarijari;
        this.phi = 3.14;
        this.Keliling = 2*phi*jarijari;
        this.Luas = phi*jarijari*jarijari;
    }
    void show(){
        System.out.println("jari-jari Lingkaran : " + this.jarijari+" cm");
        System.out.println("Keliling Lingkaran  : " + this.Keliling+" cm");
        System.out.println("Luas Lingkaran      : " + this.Luas+" cm");
    }
}

public class Lingkaran {
    public static void main(String[] args) throws Exception {
        HitungLingkaran hl = new HitungLingkaran(25);
        hl.show();
        HitungLingkaran h2 = new HitungLingkaran(5);
        h2.show();
        HitungLingkaran h3 = new HitungLingkaran(11);
        h3.show();
    }
}
