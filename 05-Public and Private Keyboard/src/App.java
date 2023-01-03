class Mahasiswa{ //default, class dapat diakses (ditulis dan dibaca) oleh class lain
    public String nama; //Bisa dibaca dan ditulis oleh class lain
    private double nilai; //private, hanya bisa diakses (ditulis dan dibaca) oleh class asalnya saja

    Mahasiswa(String nama, double nilai){
        this.nama = nama;
        this.nilai = nilai;
    }

    void display() {
        System.out.println("Nama\t\t : " + this.nama);
        System.out.println("Nilai\t\t : " + this.nilai);
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Mahasiswa mhs = new Mahasiswa("nura",100);

        mhs.display();

    }
}
