package pageclasses;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;



public class HealthCare {
	
	
	 WebDriver driver;
	 WebElement wait;
	 ExtentTest test;
		
	//constructor
	public HealthCare(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);	
	} 
	
	
	private void capture(WebDriver driver, int y) throws IOException {
		//take screenshot interface and casting it to driver
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		//using getScreenshotAs() for taking the SS
		File image = ts.getScreenshotAs(OutputType.FILE);
		
		//create a new file for saving the SS and paste path over here
		File img = new File("C:\\Users\\DELL\\Documents\\workspace-spring-tool-suite-4-4.23.1.RELEASE\\Cucumber-testNG-project2\\Screenshots\\ss"+y+".png");
		
		//copying from my temporary variable to a file in local machine
		
		FileUtils.copyFile(image, img);

		
	}
	
	
	//Locators 
	@FindBy(linkText = "Health")
	private WebElement health;
	
	@FindBy(linkText = "Health Care")
	private WebElement healthcare;
	
	@FindBy(linkText = "With Cash On Delivery")
	private WebElement COD;
	
	@FindBy(linkText = "Products With Free Shipping")
	private WebElement freeshipping;
	
	
	
	@FindBy(xpath = "(//a[@class=\"button_1\"])[1]")
	private WebElement setlink;
	

	
	@FindBy(id = "fromPriceRange")
	private WebElement startprice;
	
	@FindBy(id = "toPriceRange")
	private WebElement toprice;
	
	@FindBy(css = "[onclick=\"productSearch.setPriceRange(false)\"]")
	private WebElement click;
	

	
	
	
	// Action class
	
	public void ClickHealth() {
		health.click();
	
		
	}
	
	
	public void ClickHealthCare() {
		healthcare.click();
		
	}
	

    public void ClickCod() {
    	COD.click();
    	
    }

	public void ClickFreeshipping() {
		freeshipping.click();
	}

	public void ClickSetlink() {
		setlink.click();
	}
	
	
	
	public void Clickstartprice() {
		startprice.sendKeys("1000");
	}
	
	

	public void ClickToprice() {
		toprice.sendKeys("2000");
	}
	
	
	public void Clickclick() throws IOException {
		click.click();
		
		driver.navigate().to("https://www.naaptol.com/shop-online/health-beauty.html");
	
		capture(driver, 2);
		
	}
	

	
	
}
	
