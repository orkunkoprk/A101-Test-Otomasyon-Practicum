package pageObjectModel;

import Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.Assert;


import java.time.Duration;

public class AbstractClass {
    private WebDriver driver= Driver.getDriver();
    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
    public void clickFunction(WebElement clickElement){
        wait.until(ExpectedConditions.elementToBeClickable(clickElement));
        clickElement.click();
    }
    public void sendKeysFunction(WebElement sendKeysElement,String value){
        wait.until(ExpectedConditions.visibilityOf(sendKeysElement));
        sendKeysElement.sendKeys(value);
    }
    public void AssertFunction(WebElement actual, String expected){
        wait.until(ExpectedConditions.visibilityOf(actual));
        Assert.assertEquals(actual.getText(),expected);

    }
    public void selectElementFromDropdown(WebElement dropdown,String element){
        wait.until(ExpectedConditions.visibilityOf(dropdown));
        Select slc = new Select(dropdown);
        slc.selectByVisibleText(element);
    }
    public void isElementExist(WebElement actual){
        wait.until(ExpectedConditions.visibilityOf(actual));
        boolean flag=false;
        if (actual == null)
        { flag = false; }
        flag=true;
        Assert.assertTrue(flag);
    }


}
