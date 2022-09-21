import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class a101Test {
    AppiumDriver driver;
    @BeforeTest
    public void setUp() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName","Android");
        caps.setCapability("automationName","UiAutomator2");
        caps.setCapability("platformVersion","11.0");
        caps.setCapability("deviceName","emulator-5554");
        caps.setCapability("appPackage", "org.studionord.a101");
        caps.setCapability("appActivity", "org.studionord.a101.MainActivity");

        driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"),caps);



    }
    @Test
    public void a101Test() throws InterruptedException {

        Thread.sleep(30000);
        MobileElement iptal = (MobileElement) driver.findElementById("android:id/button2");
        iptal.click();

        Thread.sleep(1000);
        MobileElement menuBar = (MobileElement) driver.findElementByXPath("//android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView");
        menuBar.click();

        Thread.sleep(500);
        MobileElement giyimAksesuar = (MobileElement) driver.findElementByXPath("//android.widget.TextView[@text=\"GİYİM & AKSESUAR\"]");
        giyimAksesuar.click();

        Thread.sleep(500);
        MobileElement kadinIcGiyim = (MobileElement) driver.findElementByXPath("//android.widget.TextView[@text=\"Kadın İç Giyim\"]");
        kadinIcGiyim.click();

        Thread.sleep(500);
        MobileElement dizaltiCorap = (MobileElement) driver.findElementByXPath("//android.widget.TextView[@text=\"Dizaltı Çorap\"]");
        dizaltiCorap.click();

        Thread.sleep(1000);
        MobileElement urun = (MobileElement) driver.findElementByXPath("//android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[5]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]");
        urun.click();

        Thread.sleep(500);
        MobileElement urunRengi = (MobileElement) driver.findElementByXPath("//android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.TextView[1]");
        MobileElement sepeteEkle = (MobileElement) driver.findElementByXPath("//android.widget.TextView[@text=\"SEPETE EKLE\"]");
        Assert.assertEquals("Penti Kadın 50 Denye Pantolon Çorabı Siyah",urunRengi.getText());
        System.out.println("Ürünün siyah olduğu kontrol edildi");
        Thread.sleep(500);
        sepeteEkle.click();

        Thread.sleep(500);
        MobileElement sepeteGit = (MobileElement) driver.findElementByXPath("//android.widget.TextView[@text=\"SEPETE GİT\"]");
        sepeteGit.click();

        Thread.sleep(500);
        MobileElement sepetiOnyala = (MobileElement) driver.findElementByXPath("//android.widget.TextView[@text=\"SEPETİ ONAYLA\"]");
        sepetiOnyala.click();

        Thread.sleep(500);
        MobileElement uyeOlmadanDevamEt = (MobileElement) driver.findElementByXPath("//android.widget.TextView[@text=\"ÜYE OLMADAN DEVAM ET\"]");
        uyeOlmadanDevamEt.click();

        Thread.sleep(1000);
        MobileElement emailText = (MobileElement) driver.findElementByXPath("//android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText");
        emailText.click();
        emailText.sendKeys("orkun.koprek2@gmail.com");

        Thread.sleep(500);
        MobileElement aydinlanmaMetniCheckBox = (MobileElement) driver.findElementByXPath("//android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]");
        aydinlanmaMetniCheckBox.click();

        Thread.sleep(500);
        MobileElement gonder = (MobileElement) driver.findElementByXPath("//android.widget.TextView[@text=\"GÖNDER\"]");
        gonder.click();

        Thread.sleep(8000);
        MobileElement kabulEt = (MobileElement) driver.findElementByXPath("//android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.webkit.WebView/android.webkit.WebView/android.app.Dialog/android.view.View[3]/android.view.View/android.view.View/android.widget.Button[2]");
        kabulEt.click();

        Thread.sleep(500);
        MobileElement odemeBaslik = (MobileElement) driver.findElementByXPath("//android.widget.TextView[@text=\"GÜVENLİ ÖDEME\"]");
        Assert.assertEquals("GÜVENLİ ÖDEME",odemeBaslik.getText());
        System.out.println("Ödeme sayfası kontrol edildi");

        Thread.sleep(500);
        MobileElement adresEkle = (MobileElement) driver.findElementByXPath("//android.view.View[@content-desc=\" Yeni adres oluştur\"]/android.widget.TextView");
        adresEkle.click();

        Thread.sleep(500);
        MobileElement  adresbaslik = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[4]/android.view.View/android.view.View/android.widget.EditText");
        adresbaslik.sendKeys("ev");

        Thread.sleep(500);
        MobileElement  ad = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[6]/android.view.View/android.view.View/android.widget.EditText");
        ad.sendKeys("Orkun");

        Thread.sleep(500);
        MobileElement  soyad = (MobileElement) driver.findElementByXPath("//android.view.View/android.view.View[7]/android.view.View/android.view.View/android.widget.EditText");
        soyad.sendKeys("KOPREK");

        Thread.sleep(500);
        MobileElement  telno = (MobileElement) driver.findElementByXPath("//android.view.View/android.view.View[9]/android.view.View/android.view.View/android.widget.EditText");
        telno.sendKeys("5312089853");

        Thread.sleep(500);
        MobileElement  il = (MobileElement) driver.findElementByXPath("//android.view.View[11]/android.view.View/android.view.View/android.view.View/android.view.View[2]");
        il.click();

        Thread.sleep(1000);
        MobileElement  ilismi = (MobileElement) driver.findElementByXPath("//android.widget.CheckedTextView[3]");
        ilismi.click();

        Thread.sleep(3000);
        MobileElement  ilce = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[12]/android.view.View/android.view.View/android.view.View");
        ilce.click();

        Thread.sleep(2000);
        MobileElement  ilceismi = (MobileElement) driver.findElementByXPath("//android.widget.CheckedTextView[3]");
        ilceismi.click();

        Thread.sleep(2000);
        MobileElement  mahalle = (MobileElement) driver.findElementByXPath("//android.view.View/android.view.View[13]/android.view.View/android.view.View/android.view.View[2]");
        mahalle.click();

        Thread.sleep(1000);
        MobileElement  mahalleismi = (MobileElement) driver.findElementByXPath("//android.widget.CheckedTextView[4]");
        mahalleismi.click();

        Thread.sleep(2000);
        MobileElement  tamadres = (MobileElement) driver.findElementByXPath("//android.view.View[14]/android.view.View/android.widget.EditText");
        tamadres.click();
        tamadres.sendKeys("ankara altındağ aydınlıkevler");

        Thread.sleep(1000);
        MobileElement  kaydet = (MobileElement) driver.findElementByXPath("//android.view.View/android.view.View[2]/android.view.View/android.widget.Button");
        kaydet.click();


        Thread.sleep(2000);
        MobileElement kaydetVeDevamEt  = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[3]/android.view.View[3]/android.widget.Button");
        kaydetVeDevamEt.click();

        Thread.sleep(2000);
        MobileElement garantiPay = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]");
        garantiPay.click();

        Thread.sleep(500);
        MobileElement garantiOdemeBaslik = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[4]/android.view.View/android.view.View[1]");
        Assert.assertEquals("Garanti Pay ile Ödeme",garantiOdemeBaslik.getText());
        System.out.println("Garanti Pay baslik kontrol edildi ");
        System.out.println("Test başarılı!!");

    }
    @AfterTest
    public void tearDown(){
        if (null!=driver){
            driver.quit();
        }
    }


}
