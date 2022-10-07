package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class crossBrowser {
	  WebDriver driver;
	
	  public WebDriver browser_initate()
	  {
		  String browser_name="chrome";
	  switch(browser_name)
	  {
	case "chrome":
		  {
			  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\chromedriver.exe");  
		      
		      // Instantiate a ChromeDriver class.     
			  driver=new ChromeDriver();  
			  
			  driver.get("https://www.amazon.in/");
			  
			  driver.manage().window().maximize();
			 break;
		  }
		  case "firefox":
		  
		  
			  break;
		  
		  case "edge":
		  
		  
			  break;
	  }
	  return driver;
	  }
	  
   
   
	 // System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\chromedriver.exe");  
     
     // Instantiate a ChromeDriver class.     
	  //WebDriver driver=new ChromeDriver();  
	  
	  //driver.get("https://www.mycontactform.com/samples.php\r\n");
	  
	  
	  //driver.manage().window().maximize();*/
	  
	  
   
 }

