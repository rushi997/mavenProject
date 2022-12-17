package neoOStoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import neOStoxUtility.UtilityNew;



public class NeoStoxPassword 
{
	@FindBy(id="txt_accesspin")private WebElement password;
	
	@FindBy(xpath = "//a[text()='Submit']")private WebElement submitButton;
	
	public NeoStoxPassword(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void sendPassword(WebDriver driver,String passWord)
	{
		UtilityNew.wait(driver, 1000);
		password.sendKeys(passWord);
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	public void clickSubmitButton(WebDriver driver)
	{
		submitButton.click();
		
		
		
		
		
	}
	
	
}
