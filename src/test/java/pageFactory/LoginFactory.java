package pageFactory;

import java.util.List;


import org.openqa.selenium.WebDriver;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginFactory {
	
	WebDriver driver;
	//one method find by locator name
	@FindBy(xpath="//input[@id='user-name']")
	@CacheLookup
	WebElement uname;
	
	@FindBy(xpath="//input[@id='password']")
//	@CacheLookup
	WebElement pass;
	
	//second method find by how and value of locator
	@FindBy(how=How.XPATH,using="//input[@id='login-button']")
     WebElement logBtn;
	
//	@FindBys({@FindBy(xpath="//input[@type='password']"),
//	          @FindBy(name="password")}) //FindBys is not working here....		      
//    WebElement pass;
	
//	@FindAll({
//			@FindBy(xpath="/input[@type='password']"),
//			@FindBy(name="password"),
//			@FindBy(id="password")})
//	WebElement pass;
	
	
	public LoginFactory(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements( driver,this);  //in page factory it is imp to intialize the driver
	}
	public void swagu(String uid)
	{
		uname.sendKeys(uid);
		
		
	}
	public void swagp(String pass1)
	{
		pass.sendKeys(pass1);
		
		
	}
	public void swagLogs(String uid,String pass1)
	{
		uname.sendKeys(uid);
		pass.sendKeys(pass1);
	}
	public void swagLabsLoginByDefault()
    {
        uname.sendKeys("standard_user");
        pass.sendKeys("secret_sauce");
    }
	public void clickbtn() throws InterruptedException
	{
		Thread.sleep(1000);
		logBtn.click();
		
	}
}
