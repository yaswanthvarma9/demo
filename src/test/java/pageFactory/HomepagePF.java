package pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomepagePF {
	
	WebDriver driver;
	//one method find by locator name
	
	@FindBy(xpath="//select[@class='product_sort_container']")
     WebElement filter2;
	
	@FindBy(id="item_3_title_link")
	WebElement item1;
	
	@FindBy(id="add-to-cart-test.allthethings()-t-shirt-(red)")
	WebElement addToCartItem1;
	
	@FindBy(id="back-to-products")
	WebElement backToProducts;
	
	@FindBy(id="item_4_title_link")
	WebElement item2;
	
	@FindBy(id="add-to-cart-sauce-labs-backpack")
	WebElement addToCartitem2;
	
	public HomepagePF(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements( driver,this);  //in page factory it is imp to intialize the driver
	}
	public void filter1() throws InterruptedException
	
	{
		Thread.sleep(1000);
		Select s = new Select(filter2);
		Thread.sleep(2000);
		s.selectByValue("za");
		
	}
	public void addtocart() throws InterruptedException
	{
		item1.click();
		
		addToCartItem1.click();
		Thread.sleep(1000);
		backToProducts.click();
		Thread.sleep(1000);
		item2.click();
		Thread.sleep(1000);
		addToCartitem2.click();
		Thread.sleep(1000);
		
		
	}

}
