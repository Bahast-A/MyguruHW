package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.jws.soap.SOAPBinding;

public class LoginPage extends BasePage{
    @FindBy(xpath = "//h2[@class='barone']")
    public WebElement VerifiedGuru;

    @FindBy(xpath = "//input[@name='uid']")
    public WebElement Useridbox;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement Passwordbox;

    @FindBy(xpath = "//input[@value='LOGIN']")
    public WebElement Loginbutton;

    public void headerverify(){
        boolean header = VerifiedGuru.isDisplayed();
        System.out.println(VerifiedGuru.getText()+" is displayed "+header);
    }

    public void loginguru(String userid,String password) {
        Useridbox.sendKeys(userid);
        Passwordbox.sendKeys(password);
        Loginbutton.click();
    }
}
