class Display{
    private String name;
    static String type = "layar";

    Display(String name){
        this.name = name;
    }

    void setType(String type){
        //cara 1
        this.type = type;
        //cara 2
        Display.type = type;
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        //instasiasi atau penciptaan objek
        Display tampil1 = new Display("Monitor");
        Display tampil2 = new Display("LCD");
        //tampil1.show();

        //menampilkan static atau class atribut
        System.out.println("\nmenampilkan Static Atribut");
        System.out.println("tampil1.type");
        System.out.println("tampil2.type");
        System.out.println("Display.type");

        //mengubah isi dari variabel static menggunakan setter
        Display.type = "Megatrone"; 
        System.out.println("\nmenampilkan Static Atribut");
        System.out.println("tampil1.type");
        System.out.println("tampil2.type");
        System.out.println("Display.type");

    }
}
