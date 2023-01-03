class Mahasiswa{
    String nama;
    String NIM;
    String jurusan;
    double IPK;
    int umur;
}

public class App {
    public static void main(String[] args) throws Exception {
        //Objek Mahasiswa 1
        Mahasiswa mhs = new Mahasiswa();

        mhs.nama = "Ronaldinho";
        mhs.NIM = "2021001001";
        mhs.jurusan = "PTI";
        mhs.IPK = 3.09;
        mhs.umur = 20;

        System.out.println("==========================================");
        System.err.println("Object Mahasiswa 1");
        System.out.println("==========================================");
        System.out.println("Nama          : " + mhs.nama);
        System.out.println("NIM           : " + mhs.NIM);
        System.out.println("jurusan       : " + mhs.jurusan);
        System.out.println("IPK           : " + mhs.IPK);
        System.out.println("umur          : " + mhs.umur);

        Mahasiswa mhs2 = new Mahasiswa();

        mhs2.nama = "Nurrafi,ah";
        mhs2.NIM = "21241020";
        mhs2.jurusan = "PTI";
        mhs2.IPK = 4.0;
        mhs2.umur = 19;

        System.out.println("==========================================");
        System.err.println("Object Mahasiswa 2");
        System.out.println("==========================================");
        System.out.println("Nama          : " + mhs2.nama);
        System.out.println("NIM           : " + mhs2.NIM);
        System.out.println("jurusan       : " + mhs2.jurusan);
        System.out.println("IPK           : " + mhs2.IPK);
        System.out.println("umur          : " + mhs2.umur);
    }
}
