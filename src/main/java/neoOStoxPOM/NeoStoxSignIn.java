package neoOStoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import neOStoxUtility.UtilityNew;



public class NeoStoxSignIn 
{
	
	@FindBy(id="MainContent_signinsignup_txt_mobilenumber")private WebElement moNum;
	
	@FindBy(xpath = "(//a[text()='Sign In'])[2]")private WebElement signInButton;
	
	public NeoStoxSignIn(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void sendMoNum(WebDriver driver,String moNumber)
	{
		
		moNum.sendKeys(moNumber);
		
		UtilityNew.wait(driver, 1000);
			
	}
	
	
	public void clickSignInButton(WebDriver driver)
	{
		UtilityNew.wait(driver, 1000);
		signInButton.click();
		
		
	}
	
	
	
	

}
