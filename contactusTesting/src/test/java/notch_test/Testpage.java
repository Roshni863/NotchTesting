package notch_test;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import notch_pages.contactus_page;



public class Testpage {

	 WebDriver driver;
	  
	  @BeforeSuite
		public void Open_browser()
		{
			System.setProperty("webdriver.chrome.driver", "src//test//resources//Chrome//chromedriver.exe");
			 driver=new ChromeDriver(); 
		    
		}
		
		@BeforeTest
		public void Enter_url()
		{
			
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
			driver.get("https://wearenotch.com/contact/");
		}
		
		@BeforeClass
		public void DB_details()
		{
			System.out.println("Database details");
		}
		
		@BeforeMethod
		public void Getcookies()
		{
			Set<Cookie> cookies=driver.manage().getCookies();
			int count=cookies.size();
			System.out.println(count);
					
		}
		
		@Test(priority = 1)
		public void Reject() {
			
			
		    contactus_page cp =PageFactory.initElements(driver, contactus_page.class);
		   
		    cp.RejectPopup();
		}
		
		
		@Test(priority = 2)
		public void Contactdata() throws Exception {
			
			
		    contactus_page cp =PageFactory.initElements(driver, contactus_page.class);
		    cp.Data();
		    
			
		}
		@Test(priority = 3)
		public void service() throws InterruptedException {
			
			
		    contactus_page cp =PageFactory.initElements(driver, contactus_page.class);
		    cp.selectservice();
		    
		    
		}
		
		@Test(priority = 4)
		public void fileup() throws InterruptedException, IOException {
			
			
		    contactus_page cp =PageFactory.initElements(driver, contactus_page.class);
		    cp.uploadFile("src/test/resources/Fileuplod/Notchfile.exe");
		    
		    
		    boolean isbuttonenabled = cp.isGetintouchbuttonenabled();
		    
		    Assert.assertTrue(isbuttonenabled, "'Get in touch' button is not enabled.");
		}
		
		@AfterMethod
		public void Test_screenshot() throws IOException, InterruptedException
		{
		Thread.sleep(2000);
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFileToDirectory(src, new File("src/test/resources/Screenshot"));
			
		}
		@AfterClass
		public void DelCookies()
		{
			driver.manage().deleteAllCookies();	
		}
		
		@AfterTest
		public void DBclose()
		{
			System.out.println("After test  Database close");
		}
		
		@AfterSuite
		public void browser_close()
		{
			System.out.println("Aftersuite is closing browser");
		}

	}
	  

