package com.tutorial;

class HeroStrength extends Hero {

    // Atribut
    double defencePower;

    // Method Overriding
    void display(){
        System.out.println("Hero Strength");
        System.out.println("Nama Hero : " + this.name);
        System.out.println("Defance Power : " + this.defencePower);
    }
}
