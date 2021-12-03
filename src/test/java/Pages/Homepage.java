package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.internal.IContainer;

public class Homepage extends BasePage {
    @FindBy(xpath = "//td[contains(text(),'mngr')]")
    public WebElement HomePageVerify;

    public void HomepageVerify(String Expectedtext){
        if(HomePageVerify.getText().contains(Expectedtext)){
            System.out.println("Verification passed");
        }else{
            System.out.println("Verification Failed Actual Contains is: "+HomePageVerify.getText());
        }
    }


}
