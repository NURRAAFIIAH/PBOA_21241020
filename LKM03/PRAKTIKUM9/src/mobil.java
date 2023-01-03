public class mobil extends kendaraan {
    // overriding method
    @Override
    void bergerak(){
        System.out.println("Mobil Bergerak");
    }

    // Main class
    public static void main(String[] args) {
        // Membuat objek mobil
        mobil car = new mobil();

        // objek car menggunakan metode bergerak()
        car.bergerak();
    }
}
