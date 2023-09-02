package pageFactory;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.PageFactory;

public class ReddiffFactory {

	
        
		WebDriver driver;
	
		@FindBy(xpath="//input[@id='srchquery_tbox']")
	
		WebElement searchfield;
		
		@FindBy(xpath="/html/body/div[4]/div[1]/form/input[2]")
//		@FindAll({@FindBy(xpath="//input[@class='newsrchbtn']"),
//			      @FindBy(xpath="//input[@type='submit']")})
		
		WebElement searchicon;
		
		
		public ReddiffFactory(WebDriver driver)
		{
			this.driver= driver;
			PageFactory.initElements( driver,this);  //in page factory it is imp to intialize the driver
		}
		public void searchtext(String keyword) throws InterruptedException
		{
			searchfield.sendKeys(keyword);
			Thread.sleep(1000);
			
			
		}
		public void clickicon() throws InterruptedException
		{
			
		    searchicon.click();
		
		}
		
	

}
