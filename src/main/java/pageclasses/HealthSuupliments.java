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

public class HealthSuupliments {
	
	WebDriver driver;
	
	// Constructor
	public HealthSuupliments(WebDriver driver) {
	
		this.driver = driver;
		PageFactory.initElements(driver,this);
			
	}
	
	private void capture(WebDriver driver, int j) throws IOException {
		//take screenshot interface and casting it to driver
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		//using getScreenshotAs() for taking the SS
		File image = ts.getScreenshotAs(OutputType.FILE);
		
		//create a new file for saving the SS and paste path over here
		File img = new File("C:\\Users\\DELL\\Documents\\workspace-spring-tool-suite-4-4.23.1.RELEASE\\Cucumber-testNG-project2\\Screenshots\\ss"+j+".png");
		
		//copying from my temporary variable to a file in local machine
		
		FileUtils.copyFile(image, img);

		
	}
	
	
	// Locators
	
	@FindBy(xpath="//a[@title='Health']") // click on health
	private WebElement Health;
	
	@FindBy(xpath="//a[@title='Health Supplements']")//click on health suppliment
	private WebElement health_suppliment;
	
	//clicking on all the checkboxes
	
	@FindBy(xpath="//input[@id='iscod']")
	private WebElement codElement;
	
	@FindBy(xpath="//input[@id='isexoutStock']")
	private WebElement outOfStock;
	
	@FindBy(xpath="//input[@id='isfreeship']")
	private WebElement freeshipping;
	
	
	
	@FindBy(xpath="//span[normalize-space()='Set']")
	private WebElement clickSet;
	
	@FindBy(xpath="//input[@id='brandFilterBox39152']")
	private WebElement clickBrands;
	
	@FindBy(xpath="//input[@id='fromPriceRange']")
	private WebElement fromprice;
	
	@FindBy(xpath="//input[@id='toPriceRange']")
	private WebElement toprice;
	
	@FindBy(xpath="//span[normalize-space()='Go']")
	private WebElement clickGo;
	
	
	//click on the product
	@FindBy(xpath="//a[normalize-space()='Nutrigain Plus Powder & Nutrigain Plus Capsule']")
	private WebElement addtocart;
	
	//Click on tha add to cart
	@FindBy(xpath="//span[normalize-space()='Click here to Buy']")
	private WebElement clickhere;
	
	@FindBy(xpath="//ul[@id='shopCartHead']//a[@class='red_button2'][normalize-space()='Proceed to Checkout']")
	private WebElement checkout;
	
	
	

	public WebElement getHealth() {
		return Health;
	}


	public WebElement getHealth_suppliment() {
		return health_suppliment;
	}

	public WebElement getCodElement() {
		return codElement;
	}


	public WebElement getOutOfStock() {
		return outOfStock;
	}

	public WebElement getFreeshipping() {
		return freeshipping;
	}



	public WebElement getClickSet() throws InterruptedException {
		Thread.sleep(2000);
		return clickSet;
	}


	public WebElement getClickBrands() throws InterruptedException {
		Thread.sleep(2000);
		return clickBrands;
	}

	public WebElement getFromprice() throws InterruptedException {
		Thread.sleep(2000);
		return fromprice;
	}

	

	public WebElement getToprice() throws InterruptedException {
		Thread.sleep(2000);
		return toprice;
	}


	public WebElement getClickGo() throws InterruptedException {
		Thread.sleep(2000);
		return clickGo;
	}

	
	public WebElement getAddtocart() throws InterruptedException {
		Thread.sleep(2000);
		return addtocart;
	}

	public WebElement getClickhere() throws InterruptedException {
		Thread.sleep(2000);
		return clickhere;
	}

	
	public WebElement getCheckout() throws InterruptedException, IOException {
		capture(driver, 3);
		Thread.sleep(2000);
		return checkout;
	}

	public WebDriver getDriver() throws InterruptedException, IOException {
		driver.navigate().to("https://www.naaptol.com/shop-online/health-beauty.html");
		capture(driver, 4);
		Thread.sleep(2000);
		return driver;
		
	}
	
	
	
	
	

}
