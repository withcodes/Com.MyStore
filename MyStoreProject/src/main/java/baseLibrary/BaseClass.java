package baseLibrary;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import applicationUtility.ApplicationUtility;

public class BaseClass implements ApplicationUtility{
	 
	protected WebDriver driver  = null ;
	
	public void getlaunchurl(String browser_type)
	{
		if(browser_type.equalsIgnoreCase("Chrome"))
		{
			driver = new ChromeDriver();
		}
		
		else if(browser_type.equalsIgnoreCase("Firefox"))
		{
			driver  = new FirefoxDriver();
		}
		
		else if(browser_type.equalsIgnoreCase("Safari"))
			
		{
			driver = new SafariDriver();
		}
		
		else if(browser_type.equalsIgnoreCase("Edge"))
			
		{
			driver = new EdgeDriver();
		}
		
		else 
		{
			System.out.println("Plese provide my broewser name ");
		}
		    driver.get(getReadData("url"));
		    driver.manage().window().maximize();
		    
		}

	@Override
	public String getReadData(String key)
	{
		// TODO Auto-generated method stub
		String value = " ";
		
		try {
			String path = System.getProperty("user.dir") + "\\Configuration\\Config.properties";
			FileInputStream fis = new FileInputStream(path);
			Properties prop = new Properties();
			prop.load(fis);
			value = prop.getProperty(key);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("File not found " + e);
		}
		return value;
	}
	 
	
	
	
                 // !<-----------Wait For Click ---------------------------->!
	@Override
	public void waitforclick(WebElement ele)
	{
		// TODO Auto-generated method stub
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(6));
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		ele.click();	
	}

	
	
	
	
	
	
	
	
	
	

}
