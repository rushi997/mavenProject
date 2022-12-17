package neoOStoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import neOStoxUtility.UtilityNew;


public class NeoStoxStart 
{
	@FindBy(xpath = "(//a[text()='Sign In'])[1]")private WebElement signButton;
	
	public NeoStoxStart(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickSign(WebDriver driver)
	{
		UtilityNew.wait(driver, 2000);
		signButton.click();
	}

}
