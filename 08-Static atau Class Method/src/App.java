import java.util.ArrayList;

class Player{
    private static int numberOfPlayer;
    private static ArrayList<String> nameList = new ArrayList<String>();

    private String name;

    Player(String name){
        this.name = name;
        Player.numberOfPlayer++;
        Player.nameList.add(this.name);
    }

    void show(){
        System.out.println("Nama Player : " + this.name);
    }

    //membuat static method
    static void showNumberOfPlayer(){
        System.out.println("Number of player : + Player.numberOfPlayer");
    }

    static ArrayList<String> getNames(){
        return Player.nameList;
    }
    }


public class App {
    public static void main(String[] args) throws Exception {
        //instasiasi atau penciptaan objek
        Player player1 = new Player("Messi");
        Player player2 = new Player("Mbape");
        Player player3 = new Player("Ronaldo");
        Player player4 = new Player("Naymar");
        
        player1.show();
        player2.show();
        player3.show();

        Player.showNumberOfPlayer();
        System.out.println()
    }
}
