package testsCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseLibrary.BaseClass;
import pages.IndexPage;

public class IndexTest extends BaseClass {
	IndexPage ob ;
	@BeforeTest
	public void getlaunch_Url()
    
	{
		getlaunchurl("Chrome");
		ob = new IndexPage();
	}
	
	@Test(priority = 1)
	public void verifUrl()
	{
		ob.verifyurl();
	}
	@Test(priority = 2)
	public void  verify_Logo()
	{
		ob.verify_logo();
	}
	
	@Test(priority = 3)
	public void Click_sign_Up_Login_Btn()
	{
		ob.click_on_sign_up_login_btn();
	}
	
	@Test(priority = 4)
	public void verify_Sign_UpText()
	{
		ob.verify_sign_uptext();
	}
	
	@Test(priority = 5)
	public void fill_Signup_Name()
	{
		ob.fill_signup_name();
	}
	
	@Test(priority = 6)
	public void fill_Signup_Email()
	{
		ob.fill_signup_email();
	}
	
	@Test(priority = 7)
	public void Click_On_Signup_Button()
	{
		ob.click_on_signup_button();
	}
}
