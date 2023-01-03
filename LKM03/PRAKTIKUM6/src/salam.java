public class salam {
    String slm = "Assalamualaikum...";
    public void info1(){
        System.out.println(slm);
    }
}

class PanggilSalam extends salam{
    String salamku = "Salam Sejahtera Untuk Kita Semua";
    public void info2(){
        System.out.println(salamku);
    }

    public static void main(String[] args) throws Exception {
        PanggilSalam obj = new PanggilSalam();
        obj.info1();
        obj.info2();
    }
}
