package neOStoxUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;


import net.bytebuddy.utility.RandomString;

public class UtilityNew 
{

	public static void screenshot(WebDriver driver,String name) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String a = RandomString.make(1);
		
		File dest=new File("C:\\Users\\rushi\\OneDrive\\Desktop\\software testing\\selenium screenshots\\"+name+a+".png");
		
		FileHandler.copy(src, dest);
		
		//Reporter.log("taking screenshot", true);
		
	}
	
	
	
	
	
	
	
	public static void wait(WebDriver driver,int waittime)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(waittime));
		
		//Reporter.log("waiting for "+waittime+" millis",true);
	}
	
	
	
	
	
	public static void scrolling(WebDriver driver,WebElement element)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView(true)",element);
		
		//Reporter.log("scrolling to element "+element.getText(), true);
	}
	
	
	
	public static  String readpropData(String key) throws EncryptedDocumentException, IOException
	{
		Properties p=new Properties();
		FileInputStream xl=new FileInputStream("C:\\Users\\rushi\\eclipse-workspace\\mavenProjectNeostox\\mavenprop.properties");
		
      	p.load(xl);
      	
		String value = p.getProperty(key);
		
		
		//Reporter.log("taking value from property "+value, true);
		return value;
	}
}
