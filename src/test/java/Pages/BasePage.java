package Pages;

import Util.DriverUtil;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public BasePage(){
        PageFactory.initElements(DriverUtil.getDriver(),this);
    }
}
