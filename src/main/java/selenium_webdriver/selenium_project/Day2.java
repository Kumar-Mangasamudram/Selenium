package selenium_webdriver.selenium_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Day2 {

	void fun()
	{
		
		//TakeScreenshot scr=(TakeScreenshot)driver;
		//
		System.out.print("Haii");
		
		ChromeOptions options = new ChromeOptions();
		  options.addArguments("start-maximized");
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\chromedriver.exe");  
	      
	      // Instantiate a ChromeDriver class.     
		  WebDriver driver=new ChromeDriver();  
		  
		  driver.get("https://www.mycontactform.com/samples.php\r\n");
		  
		  driver.manage().window().maximize();
		  
		  driver.findElement(By.id("subject")).sendKeys("ToolsQA");
		  
		  driver.findElement(By.xpath("//*[@id=\"contactForm\"]/table/tbody/tr[1]/td/div/input[1]")).click();
		  
		//*[@id="contactForm"]/table/tbody/tr[1]/td/div/input[1]

	}
	
}
