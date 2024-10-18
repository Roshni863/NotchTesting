package notch_pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class contactus_page {
	WebDriver driver;
    WebDriverWait wait;

public contactus_page(WebDriver driver)
{
    this.driver = driver;
    this.wait = new WebDriverWait(driver, 10);
    
} 
	
@FindBy(xpath = "//button[contains(@class, 'cky-btn-reject')]")
WebElement rejectButton;
	
public void RejectPopup()
{
	
    wait.until(ExpectedConditions.visibilityOf(rejectButton));
    
    wait.until(ExpectedConditions.elementToBeClickable(rejectButton)).click();
    
}
	
@FindBy(xpath="//*[@id=\"firstname\"]")
WebElement fname;

@FindBy(xpath="//*[@id=\"lastname\"]")
WebElement lname;

@FindBy(xpath="//*[@id=\"email\"]")
WebElement email;

@FindBy(xpath="//*[@id=\"phone\"]")
WebElement phone;

@FindBy(xpath="//*[@id=\"source\"]")
WebElement hear;

@FindBy(xpath ="//*[@id=\"company\"]")
WebElement company;

@FindBy(xpath="/html/body/main/div/section[1]/div/div/div/div/form/div[2]/div[2]/div[2]/div/div/div[6]/label")
WebElement QA;

@FindBy(xpath="/html/body/main/div/section[1]/div/div/div/div/form/div[2]/div[2]/div[2]/div[1]/div/div[7]/label")
WebElement dev;

@FindBy(xpath="//*[@id=\"budget\"]")
WebElement budget;

@FindBy(xpath="//*[@id=\"message\"]")
WebElement projectinfo;

@FindBy(css=".filepond--label-action")
WebElement browse;

@FindBy(css=".color-space-gray")
WebElement checkbox;

@FindBy(xpath="//*[@id=\"contact-form-v2\"]/div[2]/div[2]/div[7]/button")
WebElement getintouch;

public void Data() throws InterruptedException, Exception
{
	
fname.sendKeys("Roshni");
lname.sendKeys("Nikale");
email.sendKeys("roshni2@gmail.com");
phone.sendKeys("098765432");

Thread.sleep(2000);
WebElement a=driver.findElement(By.xpath("//*[@id=\"source\"]"));
Select s=new Select(a);
s.selectByVisibleText("Google");


Thread.sleep(3000);
company.sendKeys("project XYZ");

}

    public void selectservice() throws InterruptedException 
    {
	
	Actions actions = new Actions(driver);
	
    JavascriptExecutor js = (JavascriptExecutor) driver;

   
    js.executeScript("arguments[0].scrollIntoView(true);", dev);
    wait.until(ExpectedConditions.elementToBeClickable(dev));
    Thread.sleep(6000);
   actions.moveToElement(dev).click().perform();
 

  
    js.executeScript("arguments[0].scrollIntoView(true);", QA);
    wait.until(ExpectedConditions.elementToBeClickable(QA));
    Thread.sleep(6000);
    actions.moveToElement(QA).click().perform();
	    
    Thread.sleep(2000);
    WebElement a1=driver.findElement(By.xpath("//*[@id=\"budget\"]"));
    Select s1=new Select(a1);
    s1.selectByIndex(4);
    
    Thread.sleep(1000);
    
    projectinfo.sendKeys("abcd");
    
       
	}

public void MultipleServices(String[] services) 
{
    for (String service : services) 
    {
        switch (service) 
        {
            case "qualityAssurance":
                wait.until(ExpectedConditions.elementToBeClickable(QA)).click();
                break;
            case "Devops":
                wait.until(ExpectedConditions.elementToBeClickable(dev)).click();
                break;
        }
    }
}
public void uploadFile(String filePath) throws InterruptedException, IOException 
{
    wait.until(ExpectedConditions.visibilityOf(browse)); 
    
    browse.click();
    
    Thread.sleep(5000);
    Runtime.getRuntime().exec("src/test/resources/Fileuplod/Notchfile.exe");
    
    Thread.sleep(10000);
    
    checkbox.click();  
}


public boolean isGetintouchbuttonenabled()
{
    wait.until(ExpectedConditions.elementToBeClickable(getintouch));
    return getintouch.isEnabled();
}

}


