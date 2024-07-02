package pages;

  	

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import baseLibrary.BaseClass;

public class IndexPage extends BaseClass {
	
	public IndexPage() 
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//img[@src='/static/images/home/logo.png']")
	private WebElement logo_image;  
	
	@FindBy(xpath = "//a[@href='/login']")
	private WebElement signUp_Login_Btn;
	
	@FindBy(xpath = "//div[@class='signup-form']")
	private WebElement signUpTxt;
	
	@FindBy (xpath = "//input[@name='name']")
	private WebElement sigUpName;
	
	
	@FindBy(xpath = "//input[@data-qa='signup-email']")
	private WebElement signUpEmail;
	
	@FindBy(xpath = "//button[@data-qa='signup-button']")
	 WebElement signUpBtn;
	
	public void verifyurl()
	{
		String expected = getReadData("url");
		String actual = driver.getCurrentUrl();
		Assert.assertEquals(actual, expected);
		System.out.println(" Url Match exact");
	}
	
	public void verify_logo()
	{
		Assert.assertTrue(logo_image.isDisplayed(),"Logo is not displaed");
	}
	
	public void click_on_sign_up_login_btn()
	{
		waitforclick(signUp_Login_Btn);
	}
	
	
	public void verify_sign_uptext()
	{
		String expected = getReadData("SignUpText");
		String actual = signUpTxt.getText();
		Assert.assertEquals(actual, expected);
		System.out.println("SignUpText Present");
	}
	
	public void fill_signup_name()
	{
	    String user_name = getReadData("name");
	    signUpTxt.sendKeys(user_name);
	    
	}
	
	public void fill_signup_email()
	
	{
		String  user_email = getReadData("email");
		signUpEmail.sendKeys(user_email);
		
	}
	
	public void click_on_signup_button()
	{
		waitforclick(signUpBtn);
	}
	
	

	
}
