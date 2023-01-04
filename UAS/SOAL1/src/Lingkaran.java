import java.util.Scanner;

public class Lingkaran {
        public static void main(String[] args) throws Exception {

        Scanner jari_jari = new Scanner(System.in);

        Integer r,d ;
        double Diameter, Luas, Keliling;

        System.out.println("Program Lingkaran");
        System.out.println("====================");

        System.out.println("jari-jari: ");
        r = jari_jari.nextInt();

        d = 2 * r;
        Keliling = Math.PI * d ;
        Luas = Math.PI * Math.pow(r,2);

        System.out.println("Diameter: "+ d);
        System.out.println("Luas: "+ Luas);
        System.out.println("Keliling: "+ Keliling);
    }
}
