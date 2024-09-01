package pageclasses;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.relevantcodes.extentreports.model.Test;

public class Beauty {
	
	WebDriver driver;

	
	public Beauty(WebDriver driver) {
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
	
	//click on beauty fromBeauty and click all checkboxes 
	
	@FindBy(xpath="//a[@class='cate_mother'][normalize-space()='Beauty']")
	private WebElement Beauty;
	
	@FindBy(xpath="//body")
	private WebElement beauty;
	
	@FindBy(xpath="//input[@id='iscod']")
	private WebElement cod;
	
	@FindBy(xpath="//input[@id='isexoutStock']")
	private WebElement outofstock;
	
	@FindBy(xpath="//input[@id='pincode']")
	private WebElement pincode;
	
	@FindBy(xpath="//span[normalize-space()='Set']")
	private WebElement clickset;
	
	
	public void BeautyClick() {
		
		Beauty.click();
		
		
	}
	
	public void beautyClick() {
		
		beauty.click();
		
		
	}
	
	public void Codcheckbox() {
		
		cod.click();
		
		
	}
	
	public void  outofstockclick() {
		outofstock.click();
		
	}
	
	public void Pincode() {
		
		pincode.click();
		
		
	}
	
	public void setclick() throws IOException {
		
		clickset.click();
		
		driver.navigate().to("https://www.naaptol.com/shop-online/health-beauty.html");
		
		capture(driver, 1);
	}



}
