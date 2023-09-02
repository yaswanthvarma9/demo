package pageFactory;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class BKLogin {
		
		WebDriver driver;
		//one method find by locator name
		
		@FindBy(how=How.XPATH,using="//img[@alt='/static/media/login-inactive.de941b20.svg']")
		WebElement clName;
		
		@FindBy(id="mobileNumber")
		WebElement mobile;
		
		@FindBy(how=How.XPATH,using="//button[@class='button delivery block false is-medium login-number__button_inactive ']")
		WebElement getbtn;
		
		@FindBy(how=How.XPATH,using="//button[@class='button delivery block false is-medium login-otp__button_active ']")
		WebElement verifyotp;
		
		@FindBy(how=How.XPATH,using="//input[@placeholder='One time password']")
		WebElement placecursor;
		
		//second method find by how and value of locator
		//@FindBy(how=How.XPATH,using="//input[@id='login-button']")
	    // WebElement logBtn;
		
		public BKLogin(WebDriver driver)
		{
			this.driver= driver;
			PageFactory.initElements( driver,this);  //in page factory it is imp to intialize the driver
		}
		public void BKlog(String mobileNum) throws InterruptedException
		{  
			
			clName.click();
			Thread.sleep(1000);
			mobile.sendKeys(mobileNum);
			Thread.sleep(1000);
			getbtn.click();
			Thread.sleep(2000);
			placecursor.click();
			Thread.sleep(4000);
			verifyotp.click();
			
		}
		public void clickbtn()
		{
			//logBtn.click();
		}
	


}
