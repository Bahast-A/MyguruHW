package Base;

import Util.BrowserUtils;
import Util.DriverUtil;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    @BeforeMethod
    public void setup(){
        DriverUtil.getDriver().manage().window().maximize();


    }
    @AfterMethod
    public void closing(){
        BrowserUtils.wait(2);
        DriverUtil.closeDriver();
    }
}
