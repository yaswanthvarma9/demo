package StepDefinition;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;


import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageFactory.LoginFactory;

public class SwagLog1Test {
	WebDriver driver;
	LoginFactory logg;
	FileInputStream fileInputStream;
	File file;
	Workbook w ;
	Sheet s ;
	String uname;
	String password;
	
	@Given("User should landed on log page")
	public void user_should_landed_on_log_page() throws IOException {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		fileInputStream =  new FileInputStream("C:\\Report\\swaglogdata.xlsx");
		 w = new XSSFWorkbook(fileInputStream);
		 Sheet s = w.getSheetAt(0);
		
		
		
	}

	@When("User entered username1  password1")
	public void user_entered_username1_password1() throws IOException {
		
		logg=new LoginFactory(driver);
	   // List<List<String>> cell1 = dataTable.cells();
		fileInputStream =  new FileInputStream("C:\\Report\\swaglogdata.xlsx");
		 w = new XSSFWorkbook(fileInputStream);
		 Sheet s = w.getSheetAt(0);
	    String uname= s.getRow(0).getCell(0).getStringCellValue();
	    String password =s.getRow(0).getCell(1).getStringCellValue();
	    System.out.println(uname);
	    logg.swagu(uname);
	    logg.swagp(password);
	    
//	    logg.swagu(cell1.get(0).get(0));
//	     logg.swagp(cell1.get(0).get(1));
		
	    
	}

	@When("user clicks login")
	public void user_clicks_login() throws InterruptedException {
	   logg.clickbtn();
	}

	@Then("Login successfully done")
	public void login_successfully_done() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


}
