package neoOStoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import neOStoxUtility.UtilityNew;



public class NeoStoxHomePage 
{
	@FindBy(xpath = "(//a[text()='OK'])[2]")private WebElement okButton;
	
	@FindBy(xpath="(//a[text()='Close'])[5]")private WebElement closeButton;
	
	@FindBy(id="lbl_username")private WebElement Username;
	
	@FindBy(id="lbl_curbalancetop")private WebElement balance;
	
	@FindBy(xpath = "//span[text()='Logout']")private WebElement logoutButton;
	
	
	
	
	
	
	public NeoStoxHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	
		
		
		
		
		
		
		
		
		
		
		
		
	
	}
	
	
	
	
	
	public void popupHandle(WebDriver driver)
	{
		UtilityNew.wait(driver, 1000);
		
		if(okButton.isDisplayed())
		{
		okButton.click();
		
		closeButton.click();
		
		}
		else
		{
			//Reporter.log("no popup present", true);
		}
		
		
	}
	
	
	
	
	
	public String userName(WebDriver driver)
	{
		UtilityNew.wait(driver, 1000);
		String actualUserName = Username.getText();
		
		//Reporter.log("actual username is "+actualUserName, true);
		return actualUserName;
	}
	
	public void logoutfromNeoStox(WebDriver driver)
	{
		Username.click();
		UtilityNew.wait(driver, 1000);
		
		logoutButton.click();
		
	}
	public String funds(WebDriver driver)
	{
		balance.getText();
		UtilityNew.wait(driver, 1000);
		return balance.getText();
	}
	
	
	

}
