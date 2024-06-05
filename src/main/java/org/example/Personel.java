package org.example;

import java.util.Scanner;

public class Personel {

    static String adi;
    static double calisilanGun;
    static double temelMaas;


   public double maasHesaplama(){

      double prim= (calisilanGun > 25) ? (calisilanGun - 25) * 1000 : 0;

       return temelMaas+prim;

   }


}
