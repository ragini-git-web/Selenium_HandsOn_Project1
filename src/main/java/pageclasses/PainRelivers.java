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
import org.openqa.selenium.support.ui.Wait;


public class PainRelivers {
	
	WebDriver driver;
	
	
	//constructor

	public PainRelivers(WebDriver driver ) {
		this.driver = driver;
		PageFactory.initElements(driver,this);	
	}
	
	private void capture(WebDriver driver, int i) throws IOException {
		//take screenshot interface and casting it to driver
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		//using getScreenshotAs() for taking the SS
		File image = ts.getScreenshotAs(OutputType.FILE);
		
		//create a new file for saving the SS and paste path over here
		File img = new File("C:\\Users\\DELL\\Documents\\workspace-spring-tool-suite-4-4.23.1.RELEASE\\Cucumber-testNG-project2\\Screenshots\\ss"+i+".png");
		
		//copying from my temporary variable to a file in local machine
		
		FileUtils.copyFile(image, img);

		
	}


//Locators



	@FindBy(css ="[title=\"Health\"]")
	private WebElement health;
	
	@FindBy(xpath="//a[@title='Pain Relievers']")
	private WebElement painrelieve;
	
	@FindBy(xpath="//input[@id='iscod']")
	private WebElement Checkbox1;
	
	@FindBy(xpath="//input[@id='isexoutStock']")
	private WebElement Checkbox2;
	
	@FindBy(xpath="//input[@id='isfreeship']")
	private WebElement Checkbox3;
	
	@FindBy(xpath="//input[@id='pincode']")
	private WebElement pincode;
	
	@FindBy(xpath="//span[normalize-space()='Set']")
	private WebElement setclick;
	
	
	
	
	
	
	// action class
	
	public void clickHealth() throws InterruptedException, IOException {
		Thread.sleep(2000);
		health.click();
		capture(driver, 7);
	}
	
	public void clickPainrelievers() {
		painrelieve.click();
		
	}
	
	
	public void clickCheckbox1() {
		Checkbox1.click();
		
	}
	
	public void clickCheckbox2() {
		
		Checkbox2.click();
		
	}
	
	public void clickCheckbox3 () {
		
		Checkbox3.click();
		
	}
	


   public void sendKeys() {
	
	pincode.sendKeys("413304");
	
   }
	
	public void clickSet() throws IOException {
		capture(driver, 8);
		setclick.click();
		driver.navigate().to("https://www.naaptol.com/shop-online/health-beauty.html");
	   capture(driver, 9);
	}
	
	
	

}
