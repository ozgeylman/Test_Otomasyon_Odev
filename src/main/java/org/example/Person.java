package org.example;

public class Person {
    String adi;
    String soyadi;
    int yas;
    String eMail;
    String tcNo;
    String adres;
    String telefonNo;
    int maasBeklentisi;



    void calistir(){

        System.out.println(tcNo+" kimlik numarali "+adi+" "+soyadi+" isimli personelimizin bu yil ki maas beklentisi "+ maasBeklentisi+" TL dir.");
    }

    void iletisimBilgileri(){
        System.out.println("Ad Soyad: "+adi+" "+soyadi+"\nikametgah: "+adres+"\nEmail: "+eMail+"\nTelefon Numarasi: "+telefonNo);

    }






}
