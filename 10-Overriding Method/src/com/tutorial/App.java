package com.tutorial;

class Hero{
    String name;

    void display(){
        System.out.println("Nama Hero : " + this.name);
    }
}

class HeroStrength extends Hero {
    // Kosong
}

class HeroIntell extends Hero {
    // Kosong
}

public class App {
    public static void main(String[] args) throws Exception {
        
        //instansiasi atau penciptaan objek
        Hero hero1 = new Hero();
        hero1.name = "Iron Man";
        hero1.display();

        HeroStrength hero2 = new HeroStrength();
        hero2.name = "Spiderman";
        hero2.defencePower = 100;
        hero2.display();

        HeroIntell hero3 = new HeroIntell();
        hero3.name = "Doraemon";
        hero3.display();

    }
}
