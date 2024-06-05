package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Personel person = new Personel();
        Scanner scanner = new Scanner(System.in);


        System.out.println("Kişi adi giriniz:");
        Personel.adi= scanner.nextLine();

        System.out.println("Calisilan günü giriniz:");
        Personel.calisilanGun= scanner.nextDouble();

        System.out.println("Temel maası giriniz:");
        Personel.temelMaas= scanner.nextDouble();


        System.out.println(Personel.adi+" isimli personelin bu ay ki maasi "+ person.maasHesaplama()+" TL dir.");

        scanner.close();





    }

}