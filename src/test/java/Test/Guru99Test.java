package Test;

import Base.BaseTest;
import Pages.Customerpage;
import Pages.Homepage;
import Pages.LoginPage;
import Util.DriverUtil;
import Util.PropertiesReadingUtil;
import org.testng.annotations.Test;

public class Guru99Test extends BaseTest {
    LoginPage loginpage;
    Homepage homepage;
    Customerpage customerpage;


    @Test
    public void TestCase1VerifyHeader(){
        DriverUtil.getDriver().get(PropertiesReadingUtil.getProperties("guru99_url"));
        loginpage = new LoginPage();
        loginpage.headerverify();

    }



    @Test
    public void TestCase2Login(){
        DriverUtil.getDriver().get(PropertiesReadingUtil.getProperties("guru99_url"));
        loginpage = new LoginPage();
        loginpage.loginguru(PropertiesReadingUtil.getProperties("guru99_userID"),PropertiesReadingUtil.getProperties("guru99_password"));
    }
    @Test
    public void TestCase3HomepageVerify() {
        DriverUtil.getDriver().get(PropertiesReadingUtil.getProperties("guru99_url"));
        loginpage = new LoginPage();
        loginpage.loginguru(PropertiesReadingUtil.getProperties("guru99_userID"), PropertiesReadingUtil.getProperties("guru99_password"));
        homepage = new Homepage();
        homepage.HomepageVerify(PropertiesReadingUtil.getProperties("guru99_homepage_contains"));
        //This failed becuz its different from our configuration properties page - PO FUCKED UP;
    }
    @Test
    public void Testcase4CustomerModulePage(){
            DriverUtil.getDriver().get(PropertiesReadingUtil.getProperties("guru99_url"));
            loginpage = new LoginPage();
            loginpage.loginguru(PropertiesReadingUtil.getProperties("guru99_userID"),PropertiesReadingUtil.getProperties("guru99_password"));
            customerpage = new Customerpage();
            customerpage.Customerpageverify();
            customerpage.Customerdataentry();
            customerpage.verifynewcustomeraddedsuccess();
        }




}


