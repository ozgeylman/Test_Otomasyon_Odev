package org.example;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


     Person person1= new Person();   //person1 nesnesinin oluşturulması ve değer atamaları.
     person1.adi= "Özge";
     person1.soyadi= "Yilman";
     person1.yas=25;
     person1.tcNo="12345678910";
     person1.eMail="ozgeyilman01@gmail.com";
     person1.adres="Ankara";
     person1.telefonNo="5430000000";
     person1.maasBeklentisi=30000;


     //-----------------------------------------------------------------------------------------------

     Person person2 = new Person();  //person2 nesnesinin oluşturulması ve değer atamaları.

     person2.adi= "Nefise";
     person2.soyadi= "Yilman";
     person2.yas=23;
     person2.tcNo="12345678911";
     person2.eMail="example@gmail.com";
     person2.adres="Ankara";
     person2.telefonNo="5430000001";
     person2.maasBeklentisi=31000;



     //----------------------------------------------------------------------------------------


     ArrayList<Person> personel = new ArrayList<>();  //türetilen nesnelerin tutulduğu liste

     personel.add(person1);
     personel.add(person2);


     System.out.println("Personel Listesi:");
     for(Person pe: personel){

      pe.iletisimBilgileri();

      pe.calistir();

      System.out.println();

     }


    }

}