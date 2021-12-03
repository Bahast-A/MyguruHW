package Pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Customerpage extends BasePage{

    @FindBy(xpath = "//p[@class='heading3']")
    public WebElement newcustomerheader;

    @FindBy(xpath = "//a[@href='addcustomerpage.php']")
    public WebElement newcustomerbutton;
    // verified and found locator for new customer button - next steps find locators for data entry below


    @FindBy(xpath = "//input[@onkeyup='validatecustomername();']")
    public WebElement csname;

    @FindBy(id ="dob" )
    public WebElement dob;

    @FindBy(xpath = "//textarea[@name='addr']")
    public WebElement addy;

    @FindBy(xpath = "//input[@name='city']" )
    public WebElement city;

    @FindBy(xpath = "//input[@name='state']")
    public WebElement state;

    @FindBy(xpath = "//input[@name='pinno']")
    public WebElement pin;

    @FindBy(xpath = "//input[@name='telephoneno']" )
    public WebElement MNumber;

    @FindBy(xpath = "//input[@name='emailid']")
    public WebElement email;

    @FindBy(xpath = "//input[@name='password']" )
    public WebElement password;

    @FindBy(xpath = "//input[@name='sub']" )
    public WebElement submitButton;

    //Verifying that customer was added successfully
    @FindBy(xpath = "//p[@class='heading3']")
    public WebElement verifyNewCustomerAddedSuccessfully;





    public void Customerpageverify(){
        newcustomerbutton.click();
        boolean header1 = newcustomerheader.isDisplayed();
        System.out.println(newcustomerheader.getText()+" is displayed "+header1);

    }

    public void Customerdataentry(){
        Faker faker = new Faker();
        csname.sendKeys(faker.letterify("BassTheFisher"));
        dob.sendKeys(faker.letterify("07/25/1997"));
        addy.sendKeys(faker.letterify("123 gamestop st"));
        city.sendKeys(faker.address().city());
        state.sendKeys(faker.address().state());
        pin.sendKeys(faker.numerify("931023"));
        MNumber.sendKeys(faker.numerify("5402928530"));
        email.sendKeys(faker.internet().emailAddress());
        password.sendKeys(faker.internet().password());
        submitButton.click();


    }
    public void verifynewcustomeraddedsuccess(){
        String expected="Customer Registered Successfully!!!";
        Assert.assertEquals(verifyNewCustomerAddedSuccessfully.getText(),expected,"Customer Verifcation Failed");
    }








}
