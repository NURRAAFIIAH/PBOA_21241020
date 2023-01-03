
public class TestMahasiswaRevisi {
    public static void main(String [] args) throws Exception {
        Mahasiswa mhsTI = new Mahasiswa();
        System.out.println("/nIDENTITAS AWAL");
        mhsTI.cetak();

        mhsTI.ubah("NURA", 2003, "SUMBAWA");
        System.out.println("/nIDENTITAS AKHIR");
        mhsTI.cetak();

        Mahasiswa mhsTE = new Mahasiswa();
        System.out.println("/nIDENTITAS AWAL");
        mhsTE.cetak();
        
        mhsTE.ubah("MIRNA", 2004, "MATARAM");
        System.out.println("/nIDENTITAS AKHIR");
        mhsTE.cetak();
    }
}