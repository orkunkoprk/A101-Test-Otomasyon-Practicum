@RegressionTest

Feature: A101 Web Automation Test Project
  Scenario Outline: A101 Automation Test Project
    Given Websitesine Gidilir
    And Web sitesine gidilidigi gorulur
    And Acilan Cookiesler kapatilir
    And Giyim ve Aksesuara Gelinir
    And Diz Altı Corap Bolumune Girilir
    And Siyah Diz Alti Coraba Tiklanir
    And Acilan Urun Siyah Oldugu Kontrol Edilir
    And Sepete Ekle Butonuna Tiklanir
    And Sepeti Goruntule Butonuna Tiklanir
    And Sepeti Onayla Butonuna Tiklanir
    And Uye Olmadan Devam Et Butonuna Tiklanir
    And Mail Adresi Girilir ve Devam Et Butonuna Tiklanir
    And Yeni Adres Olustura Tiklanir
    And Ilk Bilgi "<AdresBasligi>" girilir
    And Ikinci Bilgi"<Ad>" girilir
    And Ucuncu Bilgi"<Soyad>" girilir
    And Dorduncu Bilgi"<TelefonNo>" girilir
    And Adres Bilgilerinin Select Kisimlari tamamlanir
    And Altinci Bilgi"<DetayliAdres>" girilir
    And Kaydet Butonuna Tiklanir
    And Sendeo Kargo Secilir
    And Kaydet ve Devam Et Butonuna Tiklanir
    And Kredi Karti Bilgileri Temsili Olarak Girilir
    And Garanti Pay Odeme Ekranina Gidilir
    And On Bilgilendirme Kosulunu Onaylanir
    When Garanti Pay Ile Ode Butonuna Tiklanir
    Then Garanti ile Odeme Ekraninda Oldugu Verify Edilir

    Examples:
    |AdresBasligi|Ad|Soyad|TelefonNo|PostaKodu|DetayliAdres|
    |Ev           |Orkun|Köprek|5312089853|01010 |40036 sokak no 301|



