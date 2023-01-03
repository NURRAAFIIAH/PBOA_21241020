package com.tutorial;

public class Segitiga {
   float alas;
   float tinggi;
   
   public void setSegitiga(float alas, float tinggi) {
       this.alas = alas;
       this.tinggi = tinggi;
   }
   void luas(){
       float luas = alas * tinggi;
       System.out.println("Luas segitiga: " + luas);

   }
   void keliling(){
       float kll = 18 * alas + 4 * tinggi;
       System.out.println("Keliling segitiga: " + kll);
   }
}
