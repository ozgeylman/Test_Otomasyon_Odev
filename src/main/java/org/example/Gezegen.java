package org.example;

public enum Gezegen {

    MERKÜR(1, 57.9, 2439.7, 58.6),
    VENÜS(2, 108.2, 6051.8, 243.0),
    DÜNYA(3, 149.6, 6371.0, 1.0),
    MARS(4, 227.9, 3389.5, 1.03),
    JÜPİTER(5, 778.3, 69911.0, 0.41),
    SATÜRN(6, 1427.0, 58232.0, 0.44),
    URANÜS(7, 2871.0, 25362.0, 0.72),
    NEPTÜN(8, 4497.1, 24622.0, 0.67);

   private final int sıralama;
   private final double uzaklık;
   private final double yaricap;
   private final double dönmeSüresi;

  Gezegen(int sıralama, double uzaklık, double yaricap, double dönmeSüresi){
      this.sıralama=sıralama;
      this.uzaklık=uzaklık;
      this.yaricap=yaricap;
      this.dönmeSüresi=dönmeSüresi;
  }

  public int getSıralama(){
      return sıralama;
  }

  public double getUzaklık(){
      return uzaklık;
  }

  public double getYaricap(){
      return yaricap;
  }

  public double getDönmeSüresi(){
      return dönmeSüresi;
  }


}
