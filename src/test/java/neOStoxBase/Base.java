package neOStoxBase;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import neOStoxUtility.UtilityNew;



public class Base 
{
	protected static WebDriver driver;
	
	public void launchBrowser() throws EncryptedDocumentException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rushi\\OneDrive\\Desktop\\software testing\\chromedriver\\chromedriver.exe");
		
		
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get(UtilityNew.readpropData("url"));
		
		Reporter.log("launching browser", true);
		
	}
	
	
	public void closingbrowser()
	{
		Reporter.log("closing browser", true);
		driver.close();
	}
	

}
