public class identitas {
    private String universitas = "Universitas Pendidikan Mandalika";
    private String jurusan = "Pendidikan teknologi Informasi";
    private String nama;
    private String nim;

// Konstruktor
public identitas(String nama, String nim){
    this.nama = nama;
    this.nim = nim;
}

// Method
public void info(){
    System.out.println("Perguruan Tinggi : "+universitas);
    System.out.println("Jurusan : "+jurusan);
    System.out.println("Nama : "+nama);
    System.out.println("Nim : "+nim);
  }
}

// Klass Extends
class keterangan extends identitas {
    protected String angkatan;
    protected String alamat; 

    // Konstruktor
    public keterangan(String nama, String nim, String angkatan, String alamat){
        super(nama, nim);
        this.angkatan = angkatan;
        this.alamat = alamat;
    }

    // Method
    public void info(){
        super.info();
        System.out.println("Angkatan : "+angkatan);
        System.out.println("Alamat : "+alamat);
    }
}

// Main class
class construktorSuperKlass{
    public static void main(String[] args) {
        keterangan mahasiswa = new keterangan("Al Fatih", "24051453", "Tahun 1453", "Istanbul/Konstantinopel");
        mahasiswa.info();
    }
}