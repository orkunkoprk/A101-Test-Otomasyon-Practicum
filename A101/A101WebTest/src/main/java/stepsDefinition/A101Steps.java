package stepsDefinition;

import Utilities.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjectModel.A101Page;
import pageObjectModel.AbstractClass;

public class A101Steps  {
    WebDriver driver;
    A101Page a101Page = new A101Page();
    @Given("^Websitesine Gidilir$")
    public void websitesine_Gidilir() throws Throwable {
        driver= Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("https://www.a101.com.tr/?utm_campaign=yillik-kullan%C4%B1m_branding&utm_medium=cpc&utm_source=google&utm_content=search&utm_term=yillik&gclid=Cj0KCQjwguGYBhDRARIsAHgRm4--Jzno65FpJFNytsOUTFvBknPsaI6lO3hjULSIaCQzr1SKk_2Rp00aAllAEALw_wcB");

    }
    @Given("^Web sitesine gidilidigi gorulur$")
    public void web_sitesine_gidilidigi_gorulur() throws Throwable {
        a101Page.setCookies();

    }
    @Given("^Acilan Cookiesler kapatilir$")
    public void acilan_Cookiesler_kapatilir() throws Throwable {
        a101Page.setClickCookies();
    }


    @Given("^Giyim ve Aksesuara Gelinir$")
    public void giyim_ve_Aksesuara_Gelinir() throws Throwable {
        a101Page.setGiyimVeAksesuaraGel();

    }

    @Given("^Diz Altı Corap Bolumune Girilir$")
    public void diz_Alti_Corap_Bolumune_Girilir() throws Throwable {
        a101Page.setDizAltiCorabaTikla();

    }

    @Given("^Siyah Diz Alti Coraba Tiklanir$")
    public void siyah_Diz_Alti_Coraba_Tiklanir() throws Throwable {
        a101Page.setSiyahDizAltiCorabaTikla();

    }

    @Given("^Acilan Urun Siyah Oldugu Kontrol Edilir$")
    public void acilan_Urun_Siyah_Oldugu_Kontrol_Edilir() throws Throwable {
        a101Page.setSecilenUrunSiyahMiKontrolEt();
    }

    @Given("^Sepete Ekle Butonuna Tiklanir$")
    public void sepete_Ekle_Butonuna_Tiklanir() throws Throwable {
        a101Page.setSepeteEkleButonunaTiklanir();

    }

    @Given("^Sepeti Goruntule Butonuna Tiklanir$")
    public void sepeti_Goruntule_Butonuna_Tiklanir() throws Throwable {
        a101Page.setSepetiGoruntule();
    }


    @Given("^Sepeti Onayla Butonuna Tiklanir$")
    public void sepeti_Onayla_Butonuna_Tiklanir() throws Throwable {
        a101Page.setSepetiOnayla();

    }

    @Given("^Uye Olmadan Devam Et Butonuna Tiklanir$")
    public void uye_Olmadan_Devam_Et_Butonuna_Tiklanir() throws Throwable {
        a101Page.setUyeOlmadanDevamEt();

    }

    @Given("^Mail Adresi Girilir ve Devam Et Butonuna Tiklanir$")
    public void mail_Adresi_Girilir_ve_Devam_Et_Butonuna_Tiklanir() throws Throwable {
        a101Page.setMailGirilir();
    }

    @Given("^Yeni Adres Olustura Tiklanir$")
    public void yeni_Adres_Olustura_Tiklanir() throws Throwable {
        a101Page.setAdresOlusturaTiklanir();

    }

    @Given("^Adres Bilgilerinin Select Kisimlari tamamlanir$")
    public void adres_Bilgilerinin_Select_Kisimlari_tamamlanir() throws Throwable {
        a101Page.SelectAdresBilgiler();
    }

    @Given("^Ilk Bilgi \"([^\"]*)\" girilir$")
    public void ilk_Bilgi_girilir(String adresBasligi) throws Throwable {
        a101Page.setAdresBasligi(adresBasligi);
    }

    @Given("^Ikinci Bilgi\"([^\"]*)\" girilir$")
    public void ikinci_Bilgi_girilir(String ad) throws Throwable {
        a101Page.setAd(ad);
    }

    @Given("^Ucuncu Bilgi\"([^\"]*)\" girilir$")
    public void ucuncu_Bilgi_girilir(String soyAd) throws Throwable {
        a101Page.setSoyAd(soyAd);
    }

    @Given("^Dorduncu Bilgi\"([^\"]*)\" girilir$")
    public void dorduncu_Bilgi_girilir(String telefon) throws Throwable {
        a101Page.setCepTelefon(telefon);
    }
    @Given("^Altinci Bilgi\"([^\"]*)\" girilir$")
    public void altinci_Bilgi_girilir(String acikAdres) throws Throwable {
        a101Page.setDetayliAdres(acikAdres);
    }



    @Given("^Kaydet Butonuna Tiklanir$")
    public void kaydet_Butonuna_Tiklanir() throws Throwable {
        a101Page.setAdresiKaydet();
    }

    @Given("^Sendeo Kargo Secilir$")
    public void sendeo_Kargo_Secilir() throws Throwable {
        a101Page.setSendepKargoTiklanir();

    }

    @Given("^Kaydet ve Devam Et Butonuna Tiklanir$")
    public void kaydet_ve_Devam_Et_Butonuna_Tiklanir() throws Throwable {
        a101Page.setKaydetVeDevamEtButonunaTiklanir();
    }

    @Given("^Kredi Karti Bilgileri Temsili Olarak Girilir$")
    public void kredi_Karti_Bilgileri_Temsili_Olarak_Girilir() throws Throwable {
        a101Page.cardInformations();
    }

    @Given("^Garanti Pay Odeme Ekranina Gidilir$")
    public void garanti_Pay_Odeme_Ekranina_Gidilir() throws Throwable {
        a101Page.setGarantiPayTiklanir();

    }


    @Given("^On Bilgilendirme Kosulunu Onaylanir$")
    public void on_Bilgilendirme_Kosulunu_Onaylanir() throws Throwable {
        a101Page.setOnBilginlendirmeButonunaTiklanir();

    }

    @When("^Garanti Pay Ile Ode Butonuna Tiklanir$")
    public void garanti_Pay_Ile_Ode_Butonuna_Tiklanir() throws Throwable {
        a101Page.setGarantiPayileOdeTiklanir();

    }

    @Then("^Garanti ile Odeme Ekraninda Oldugu Verify Edilir$")
    public void garanti_ile_Odeme_Ekraninda_Oldugu_Verify_Edilir() throws Throwable {
        a101Page.setGarantiPayinSonAdimindaMisin();

    }





}
