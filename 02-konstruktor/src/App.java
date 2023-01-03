// class tanpa konstruktor
class polos{
    String dataString;
    int dataInteger;
}

// class tanpa konstruktor
class Mahasiswa{
    String nama;
    String NIM;
    String jurusan;

    // Konstruktor parameter
    Mahasiswa(String inputnama, String inputNIM, String inputjurusan){
        nama = inputnama;
        NIM = inputNIM;
        jurusan = inputjurusan;
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Mahasiswa Mhs = new Mahasiswa("otong", "987654321", "PTI");
        Mahasiswa Mhs1 = new Mahasiswa("jamal", "876543210", "PTI");

        System.out.println(Mhs.nama);
        System.out.println(Mhs.NIM);
        System.out.println(Mhs.jurusan);
    }
}
