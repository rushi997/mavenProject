package neOStoxTest;

import org.testng.annotations.Test;

import neOStoxBase.Base;
import neOStoxUtility.UtilityNew;
import neoOStoxPOM.NeoStoxHomePage;
import neoOStoxPOM.NeoStoxPassword;
import neoOStoxPOM.NeoStoxSignIn;
import neoOStoxPOM.NeoStoxStart;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;


@Listeners(listener1.Listener.class)
public class ValidateUserNameAndFundsusingPropertyTest  extends Base
{
	NeoStoxStart start;
	NeoStoxSignIn signIn;
	NeoStoxPassword password;
	NeoStoxHomePage home;
	
	
  
	 @BeforeClass
	  public void launch() throws EncryptedDocumentException, IOException
	  {
		 launchBrowser();
		 
		 start =new NeoStoxStart(driver);
		 signIn =new NeoStoxSignIn(driver);
		 password =new NeoStoxPassword(driver);
		 home =new NeoStoxHomePage(driver);
		 
		 
	  }
	
	 @BeforeMethod
	  public void loginToNeoStox() throws EncryptedDocumentException, IOException, InterruptedException
	 {
		 start.clickSign(driver);
		 
		 Reporter.log("clicking on signIn", true);
		 Thread.sleep(1000);
		 signIn.sendMoNum( driver,UtilityNew.readpropData("mobNum"));
		 Reporter.log("sending moNum ", true);
		 signIn.clickSignInButton(driver);
		 Reporter.log("clicking on sign-in Button", true);
		 password.sendPassword(driver, UtilityNew.readpropData("password"));
		 Reporter.log("sending password ", true);
		 password.clickSubmitButton(driver);
		 Reporter.log("clicking on submit button", true);
		 Thread.sleep(1000);
		 home.popupHandle(driver);
		 Reporter.log("Handling popup if present", true);
		 	 
	  }
	 
	
	@Test
  public void validateUserName() throws EncryptedDocumentException, IOException, InterruptedException 
  {
		Thread.sleep(1000);
	
		Assert.assertEquals(home.userName(driver),UtilityNew.readpropData("userName"), "TC failed actual not equal expected");
		
		
  }
	
	@Test
	  public void getFunds() throws EncryptedDocumentException, IOException, InterruptedException 
	  {
		Thread.sleep(1000);
			Assert.assertNotNull(home.funds(driver), "TC failed as Funds Are null");
			
			Reporter.log("funds are "+home.funds(driver), true);
			
		
	  }
	
 

  @AfterMethod
  public void logoutFromApplication() throws InterruptedException 
  {
	  
	  Thread.sleep(1000);
	  home.logoutfromNeoStox(driver);
	  Reporter.log("logout from neostox", true);
	  
  }

 

  @AfterClass
  public void closingBrowser() throws InterruptedException 
  {
	  Thread.sleep(1000);
	  closingbrowser();
  }

}
