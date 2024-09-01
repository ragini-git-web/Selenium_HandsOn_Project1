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


public class WomensCare {

	WebDriver driver;
	
	public WomensCare(WebDriver driver) {
		
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
	
	@FindBy(xpath="//a[@class='cate_mother'][normalize-space()='Beauty']")
	private WebElement Beauty;
	
	
	@FindBy(xpath="//a[normalize-space()='Womens Care']")
	private WebElement womensCare;
	
	@FindBy(xpath="//input[@id='iscod']")
	private WebElement checkbox1;
	
	@FindBy(xpath="//input[@id='isexoutStock']")
	private WebElement checkbox2;
	
	@FindBy(xpath="//input[@id='brandFilterBox39142']")
	private WebElement checkbox3;
	
	@FindBy(xpath="//a[normalize-space()='12 Hours Leak-Proof Reusable Menstrual Cup']")
	private WebElement Clickproduct;

	
	public void BeautyClick() {
		Beauty.click();
	
	}
	
	public void WomensCareClick() {
		
		womensCare.click();
		
	}
	
	public void Checkbox1click() {
		
		checkbox1.click();
		
	}
	
	public void Checkbox2click() {
		
		checkbox2.click();
	}
	
	public void Checkbox3click() throws InterruptedException, IOException {
		
		Thread.sleep(2000);
		checkbox3.click();
        capture(driver, 5);
	}

   
    public void productclick() throws InterruptedException, IOException {
    	
    	Thread.sleep(2000);
		
    	Clickproduct.click();
    	capture(driver, 6);
    	
    	driver.navigate().to("https://www.naaptol.com/shop-online/health-beauty.html");
	}
	

	
	
	
	
}
