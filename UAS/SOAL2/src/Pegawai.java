class Pegawai {
    public String nama;
    public String jabatan;
    public String pajak;
    private double gajiPokok;
    private double gajiBersih;

    // konstruktor
    public Pegawai(String nama, String jabatan, double gajiBersih ){
        this.nama = nama;
        this.jabatan = jabatan;
        this.gajiBersih = gajiBersih;
    }

    // Method Setter
    public void setgajiPokok (double gajiPokok){
        this.gajiPokok = gajiPokok;
    }

    // Method Getter
    public double getgajiBersih(){
        return this.gajiBersih;
    }

    public static void main(String[] args) {
        Pegawai p1 = new Pegawai("Adam", "Direktur", 10);
    }

    public void display() {
        System.out.println("Nama Pegawai : " + this.nama);
        System.out.println("Jabatan : " + this.jabatan);
        System.out.println("Gaji Bersih : " + this.gajiBersih);
    }
}
