package pageFactory;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;


public class DemoqaPF {
	    

	    WebDriver driver;

	    

	    @FindBy(xpath="//input[@id='userName']")

	    WebElement  fullName;

	    

	    @FindBy(xpath="//input[@id='userEmail']")

	    WebElement Email;

	    

	    @FindBy(xpath="//textarea[@id='currentAddress']")

	    WebElement CurAddress;

	    

	    @FindBy(xpath="//textarea[@id='permanentAddress']")

	    WebElement PerAddress;

	    

	    @FindBy(xpath="//button[@id='submit']")

	    WebElement submitBtn;

	    

	    

	    public DemoqaPF(WebDriver driver)

	    {

	        this.driver= driver;

	        PageFactory.initElements( driver,this);  //in page factory it is imp to intialize the driver

	    }

	    public void textform(String fname,String email,String curadd,String peradd)

	    {

	        fullName.sendKeys(fname);

	        Email.sendKeys(email);

	        CurAddress.sendKeys(curadd);

	        PerAddress.sendKeys(peradd);

	    }

	    

	    public void submitbtn()

	    {

	        submitBtn.click();

	    }

	

	 
}
