package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
 for(Gezegen gezegen : Gezegen.values()){
     System.out.println(gezegen.name() + ":");
     System.out.println("Sıralama: " + gezegen.getSıralama());
     System.out.println("Uzaklık: " + gezegen.getUzaklık() + "milyon km");
     System.out.println("Yarıçap: " + gezegen.getYaricap() + " km");
     System.out.println("Dönme Süresi: " + gezegen.getDönmeSüresi() + " gün");
     System.out.println();
 }
    }
}