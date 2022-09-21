package pageObjectModel;

import Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class A101Page extends AbstractClass{
    WebDriver driver;
    public A101Page(){
        driver= Driver.getDriver();
        PageFactory.initElements(driver,this);
    }

@FindBy(xpath = "//button[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll']")
    private WebElement Cookies;
    public void setCookies(){
        isElementExist(Cookies);
        System.out.println("A101 Web sitesindesiniz.");
    }
    public void setClickCookies(){
        clickFunction(Cookies);

    }
@FindBy(xpath = "(//ul[@class='desktop-menu']//li[@class='js-navigation-item '])[4]")
    private WebElement GiyimVeAksesuaraGel;
    public void setGiyimVeAksesuaraGel(){
        Actions actions=new Actions(driver);
        actions.moveToElement(GiyimVeAksesuaraGel).perform();
    }
@FindBy(xpath = "//a[@title='Dizaltı Çorap']")
    private WebElement DizAltiCorabaTikla;
    public void setDizAltiCorabaTikla(){
        clickFunction(DizAltiCorabaTikla);
    }
@FindBy(xpath = "(//figure[@class='product-image '])[1]")
    private WebElement SiyahDizAltiCorabaTikla;
    public void setSiyahDizAltiCorabaTikla(){
        clickFunction(SiyahDizAltiCorabaTikla);
    }
@FindBy(xpath = "//span[text()='SİYAH']")
    private WebElement SecilenUrunSiyahMiKontrolEt;
    public void setSecilenUrunSiyahMiKontrolEt(){
        AssertFunction(SecilenUrunSiyahMiKontrolEt,"SİYAH");
        System.out.println("Secilen urun: "+SecilenUrunSiyahMiKontrolEt.getText()+". Tebrikler!");
    }
@FindBy(xpath = "//i[@class='icon-sepetekle']")
    private WebElement SepeteEkleButonunaTiklanir;
    public void setSepeteEkleButonunaTiklanir()  {
        clickFunction(SepeteEkleButonunaTiklanir);
    }
@FindBy(xpath = "(//a[@title='Sepeti Görüntüle'])[2]")
    private WebElement SepetiGoruntule;
    public void setSepetiGoruntule(){
        clickFunction(SepetiGoruntule);
    }
@FindBy(xpath = "//a[@class='button green checkout-button block js-checkout-button']")
    private WebElement SepetiOnayla;
    public void setSepetiOnayla(){
        clickFunction(SepetiOnayla);
    }
@FindBy(xpath = "//a[@title='ÜYE OLMADAN DEVAM ET']")
    private WebElement UyeOlmadanDevamEt;
    public void setUyeOlmadanDevamEt(){
        clickFunction(UyeOlmadanDevamEt);
    }
@FindBy(xpath = "//input[@name='user_email']")
    private WebElement MailGirilir;
@FindBy(xpath = "//button[@class='button block green']")
    private WebElement DevamEtButonunaTiklanir;
    public void setMailGirilir(){
        sendKeysFunction(MailGirilir,"orkun123@gmail.com");
        clickFunction(DevamEtButonunaTiklanir);
    }
@FindBy(xpath = "(//a[@class='new-address js-new-address'])[1]")
    private WebElement AdresOlusturaTiklanir;
    public void setAdresOlusturaTiklanir(){
        clickFunction(AdresOlusturaTiklanir);
    }
@FindBy(xpath = "//input[@name='title']")
    private WebElement AdresBasligi;
@FindBy(xpath = "//input[@name='first_name']")
    private WebElement Ad;
@FindBy(xpath = "//input[@name='last_name']")
    private WebElement SoyAd;
@FindBy(xpath = "//input[@name='phone_number']")
    private WebElement CepTelefon;
@FindBy(xpath = "//select[@name='city']")
    private WebElement selectIl;
@FindBy(xpath = "//select[@name='township']")
    private WebElement selectIlce;
@FindBy(xpath = "//select[@name='district']")
    private WebElement selectMahalle;
@FindBy(xpath = "//textarea[@name='line']")
    private WebElement DetayliAdres;
@FindBy(xpath = "//input[@class='js-post-code']")
    private WebElement PostaKodu;

    public void setAdresBasligi(String adresBasligi){
        sendKeysFunction(AdresBasligi,adresBasligi);
    }
    public void setAd(String ad){
        sendKeysFunction(Ad,ad);
    }
    public void setSoyAd(String soyAd){
        sendKeysFunction(SoyAd,soyAd);
    }
    public void setCepTelefon(String telefon){
        sendKeysFunction(CepTelefon,telefon);
    }
    public void setDetayliAdres(String detayliAdres) throws InterruptedException {
        Thread.sleep(1000);
        sendKeysFunction(DetayliAdres,detayliAdres);
        Thread.sleep(1000);
    }



    public void SelectAdresBilgiler() throws InterruptedException {
        Thread.sleep(500);
        selectElementFromDropdown(selectIl,"ADANA");
        Thread.sleep(500);
        selectElementFromDropdown(selectIlce,"SEYHAN");
        Thread.sleep(1000);
        selectElementFromDropdown(selectMahalle,"İSTİKLAL MAH");
        Thread.sleep(500);
    }
@FindBy(xpath = "//button[@class='button green js-set-country js-prevent-emoji']")
    private WebElement AdresiKaydet;
    public void setAdresiKaydet(){
        clickFunction(AdresiKaydet);
    }
@FindBy(xpath = "(//div[@class='check']//span)[3]")
    private WebElement SendeoKargoTiklanir;
    public void setSendepKargoTiklanir()  {
        clickFunction(SendeoKargoTiklanir);
    }
@FindBy(xpath = "//button[@class='button block green js-proceed-button']")
    private WebElement KaydetVeDevamEtButonunaTiklanir;
    public void setKaydetVeDevamEtButonunaTiklanir(){
        clickFunction(KaydetVeDevamEtButonunaTiklanir);
    }
@FindBy(xpath = "(//input[@name='name'])[2]")
    private WebElement fullName;
@FindBy(xpath = "//input[@class='js-masterpassbin-payment-card']")
    private WebElement cardNumbers;
@FindBy(xpath = "(//select[@name='card_month'])[2]")
    private WebElement lastMonth;
@FindBy(xpath = "(//select[@name='card_year'])[2]")
    private WebElement lastYear;
@FindBy(xpath = "(//input[@name='card_cvv'])[2]")
    private WebElement cvv;
    public void cardInformations(){
        sendKeysFunction(fullName,"Orkun Köprek");
        sendKeysFunction(cardNumbers,"1111000022223333");
        selectElementFromDropdown(lastMonth,"3");
        selectElementFromDropdown(lastYear,"2028");
        sendKeysFunction(cvv,"111");
    }
@FindBy(xpath = "//div[@data-pk='2']")
    private WebElement GarantiPayTiklanir;
    public void setGarantiPayTiklanir(){
        clickFunction(GarantiPayTiklanir);
    }
@FindBy(xpath = "(//input[@class='checkout__contract__checkbox js-checkout-agreement'])[1]")
    private WebElement OnBilginlendirmeButonunaTiklanir;
    public void setOnBilginlendirmeButonunaTiklanir(){
        clickFunction(OnBilginlendirmeButonunaTiklanir);
    }
@FindBy(xpath = "//a[@class='button green js-gpay-payment']")
    private WebElement GarantiPayileOdeTiklanir;
    public void setGarantiPayileOdeTiklanir(){
        clickFunction(GarantiPayileOdeTiklanir);
    }
@FindBy(xpath = "//span[text()=' GarantiPay Nedir? ']")
    private WebElement GarantiPayinSonAdimindaMisin;
    public void setGarantiPayinSonAdimindaMisin(){
        AssertFunction(GarantiPayinSonAdimindaMisin,"GarantiPay Nedir?");
        System.out.println("Testiniz basariyla tamamlanmistir. Tebrikler!!!!");
    }








}
