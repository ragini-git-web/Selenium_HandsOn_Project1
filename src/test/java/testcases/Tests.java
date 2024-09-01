

package testcases;


import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import pageclasses.Beauty;
import pageclasses.HealthCare;
import pageclasses.HealthSuupliments;
import pageclasses.PainRelivers;
import pageclasses.WomensCare;

public class Tests {

	WebDriver driver;
	HealthCare he;
	PainRelivers pr;
	HealthSuupliments hs;
	Assert assert1;
	Beauty beauty;
	ExtentReports report;
	ExtentTest test;


	public class ExtendDemo {
		
		@BeforeClass
		public void reportconfig() {
			
		report = new ExtentReports("C:\\Users\\DELL\\Documents\\workspace-spring-tool-suite-4-4.23.1.RELEASE\\SeleniumHandsOn-project-1\\report.html");
		test = report.startTest("Page Object model Testing Extent Report");	
			
		}
	
	
	
	@BeforeMethod
	public void setup() {
		
		 
		test.log(LogStatus.PASS, "Chrome browser is opened");
		driver  = new ChromeDriver();	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.naaptol.com/shop-online/health-beauty.html");
		driver.manage().window().maximize();
		if(driver.getCurrentUrl().equals(null)) {
			test.log(LogStatus.FAIL,"URl not entered");
		}
		else {
			test.log(LogStatus.PASS,"URL is entered");
		}
		
		
	}
	
	
	
	@Test(priority = 2)
	public void testHealth() throws InterruptedException, IOException {
		
		 HealthCare he = new  HealthCare(driver);
		 he.ClickHealth();
		 test.log(LogStatus.PASS, "Click On the Health");
		 he.ClickHealthCare();
		 test.log(LogStatus.PASS, "Click On Health Care");
		 he.ClickCod();
		 test.log(LogStatus.PASS, "Click on the cash on delivery checkbox");
		 he.ClickFreeshipping();
		 test.log(LogStatus.PASS, "Click On the Free Delivery Checkbox ");
		 he.ClickSetlink();
		 test.log(LogStatus.PASS, "Click On the Set button");
		 he.Clickstartprice();
		 test.log(LogStatus.PASS, "Enter Satrt price ");
		 he.ClickToprice();
		 test.log(LogStatus.PASS, "Enter upto price ");
		 he.Clickclick();
		 test.log(LogStatus.PASS, "click on the click button ");
	
		
	}	
	
	
	
	@Test(priority = 3)
	public void testHealthSuupliments() throws InterruptedException {
		
		HealthSuupliments hs = new HealthSuupliments(driver);
		hs.getHealth();
		test.log(LogStatus.PASS, "Click On the Health");
		hs.getHealth_suppliment();
		test.log(LogStatus.PASS, "Click On the Health Suppliments");
		hs.getOutOfStock();
		test.log(LogStatus.PASS, "Click On out of stock checkbox");
		hs.getFreeshipping();
		 test.log(LogStatus.PASS, "Click On the Free Delivery Checkbox ");
		hs.getClickSet();
		test.log(LogStatus.PASS, "Click On the Set button");
		hs.getClickBrands();
		test.log(LogStatus.PASS, "Click On the Branded");
		hs.getFromprice();
		test.log(LogStatus.PASS, "Enter Satrt price ");
		hs.getToprice();
		test.log(LogStatus.PASS, "Enter upto price ");
		hs.getClickGo();
		 test.log(LogStatus.PASS, "Click On the Go button");
		hs.getAddtocart();
		test.log(LogStatus.PASS, "Click On the Add to cart button");
		hs.getClickhere();
		test.log(LogStatus.PASS, "Click Here");
		test.log(LogStatus.PASS, "Naviagted to the Main page");
	
	}
	
	
	
	@Test(priority = 4)
	public void Beauty() throws IOException {
		
		Beauty beauty = new Beauty(driver);
		beauty.BeautyClick();
		test.log(LogStatus.PASS, "Click On the Beauty");
		beauty.beautyClick();
		test.log(LogStatus.PASS, "Click On beauty under Beauty");
		beauty.Codcheckbox();
		test.log(LogStatus.PASS, "Click on the cash on delivery checkbox");
		beauty.outofstockclick();
		test.log(LogStatus.PASS, "Click On the Checkbox Exclude out of stock");
		beauty.Pincode();
		test.log(LogStatus.PASS, "Enter the pincode for the Pandharpur ");
		beauty.setclick();
		test.log(LogStatus.PASS, "Click On the Set button");
		test.log(LogStatus.PASS, "Naviagted to the Main page");
		
		Assert.assertEquals("No product found for this filter combination, remove some of the filters to see products",
				"No product found for this filter combination, remove some of the filters to see products");
		

	}
	
	
	
	@Test(priority = 1)
	public void testpainrelievers() throws IOException {
		
	
		PainRelivers pr = new PainRelivers(driver);
		try {
			pr.clickHealth();
			test.log(LogStatus.PASS, "Click On the Health");
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		pr.clickPainrelievers();
		test.log(LogStatus.PASS, "Click On the Pain Relivers ");
		pr.clickCheckbox1();
		test.log(LogStatus.PASS, "Click on the cash on delivery checkbox");
		pr.clickCheckbox2();
		test.log(LogStatus.PASS, "Click on the Out o stock checkbox");
		pr.clickCheckbox3();
		 test.log(LogStatus.PASS, "Click On the Free Delivery Checkbox ");
		pr.sendKeys();
		test.log(LogStatus.PASS, "Enter the pincode for the Pandharpur ");
		pr.clickSet();
		test.log(LogStatus.PASS, "Click On the Set button");
		test.log(LogStatus.PASS, "Naviagted to the Main page");
		
		
	}
	  
	    
	
	@Test(priority = 1)
	public void testWomensCare() throws InterruptedException, IOException {
		
		 WomensCare wc = new  WomensCare(driver);
		 wc.BeautyClick();
		 test.log(LogStatus.PASS, "Click On the Beauty");
		 wc.WomensCareClick();
		 test.log(LogStatus.PASS, "Click On the Women's Care");
		 wc.Checkbox1click();
		 test.log(LogStatus.PASS, "Click on the cash on delivery checkbox");
		 wc.Checkbox2click();
	     test.log(LogStatus.PASS, "Click on the Out o stock checkbox");
		 wc.Checkbox3click();
		 test.log(LogStatus.PASS, "Click On the Branded");
		 wc.productclick();
		 test.log(LogStatus.PASS, "Click On the Product");
		
	}
	
	
@AfterMethod
public void teardown() {
	
	driver.quit();
	test.log(LogStatus.PASS, "Browser Closed");
	report.flush();
	report.endTest(test);
	
	
}

	
	
	
}


	}
	
	