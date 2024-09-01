
package org.example;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PersonelTest {

    @Test
    public void testMaasHesaplama25GundenAz() {
        Personel.adi = "Test User";
        Personel.calisilanGun = 20;
        Personel.temelMaas = 5000;

        Personel personel = new Personel();
        double hesaplananMaas = personel.maasHesaplama();

        Assert.assertEquals(hesaplananMaas, 5000.0, "Maaş hesaplaması hatalı!");
    }

    @Test
    public void testMaasHesaplama25GundenFazla() {
        Personel.adi = "Test User";
        Personel.calisilanGun = 28;
        Personel.temelMaas = 5000;

        Personel personel = new Personel();
        double hesaplananMaas = personel.maasHesaplama();

        Assert.assertEquals(hesaplananMaas, 8000.0, "Maaş hesaplaması hatalı!"); // 3 gün prim: 3 * 1000
    }

    @DataProvider(name = "maasVerileri")
    public Object[][] maasVerileriSaglayici() {
        return new Object[][]{
                {"Test User 1", 20, 5000, 5000.0},
                {"Test User 2", 28, 5000, 8000.0}, // 3 gün prim: 3 * 1000
                {"Test User 3", 25, 4000, 4000.0}, // Prim yok
                {"Test User 4", 30, 6000, 11000.0} // 5 gün prim: 5 * 1000
        };
    }

    @Test(dataProvider = "maasVerileri")
    public void testMaasHesaplama(String adi, double calisilanGun, double temelMaas, double beklenenMaas) {
        Personel.adi = adi;
        Personel.calisilanGun = calisilanGun;
        Personel.temelMaas = temelMaas;

        Personel personel = new Personel();
        double hesaplananMaas = personel.maasHesaplama();

        Assert.assertEquals(hesaplananMaas, beklenenMaas, "Maaş hesaplaması hatalı!");
    }
}
