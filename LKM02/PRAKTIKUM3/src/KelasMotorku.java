// class dengan penambahan properti (class declaration)
class MOTOR{
    String merk;
    int tahun;
    String noPolisi;
    String warna;

//class body
    // Konstruktor dengan parameter string dan int
    public MOTOR(String merk, int tahun, String noPolisi, String warna){
        this.merk = merk;
        this.tahun = tahun;
        this.noPolisi = noPolisi;
        this.warna = warna;
    }
    // Method
    void showInfoMotor(){
        System.out.println("Merk : "+this.merk);
        System.out.println("Tahun : "+this.tahun);
        System.out.println("No Polisi : "+this.noPolisi);
        System.out.println("warna : "+this.warna);
    }
}

// Object
public class KelasMotorku {
    public static void main(String[] args) throws Exception {
        MOTOR motorku = new MOTOR("Honda GL Pro", 1997, "G 5879 BF", "Hitam");
        motorku.showInfoMotor();
    }
}
