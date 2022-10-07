package TestNg;

import org.testng.annotations.Test;

import utilities.crossBrowser;
import utilities.utilities_class;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
	
	WebDriver driver;
  /*@Test(dataProvider = "dp")
  public void f(Integer n, String s) {
  }*/
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Inside beforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Outside beforeMethod");
  }


  //@DataProvider
  /*public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };*/
    
    
    
    
    
   /* public String[][] TestDataFeed(){

    	// Create object array with 2 rows and 2 column- first parameter is row and second is //column
    	String [][] data=new String[2][3];

    	// Enter data to row 0 column 0
    	data[0][0]="7993772263";
    	// Enter data to row 0 column 1
    	data[0][1]="Kumar@123#";
    	
    	data[0][2]="iphone 14";
    	// Enter data to row 1 column 0
    	data[0][0]="7993772263";
    	// Enter data to row 0 column 1
    	data[0][1]="kumar@123#";
    	
    	data[0][2]="iphone 14";
    	
    	return data;
  }*/
  @BeforeClass
  public void beforeClass() {
	crossBrowser brows=new crossBrowser();
	 driver=brows.browser_initate();
  }

  @AfterClass
  public void afterClass() {
	  
	  
	  //driver.close();
  }

 /* @BeforeTest
  public void beforeTest() {
  }*/
  
  @Test(priority=1)
  public void valid() 
  {
	  System.out.println("Inside test");
	  
	
	 
	  driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
	  utilities_class obj1=new utilities_class();
	 String[][] obj=obj1.TestDataFeed();
      
	  /*driver.findElement(By.id("ap_email")).sendKeys("7993772263");
	  driver.findElement(By.id("continue")).click();
	  driver.findElement(By.id("ap_password")).sendKeys("Kumar@123#");
	  driver.findElement(By.id("signInSubmit")).click();
	  
	  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 14");
	 driver.findElement(By.id("nav-search-submit-button")).click();*/
	 String phone=obj[0][0];
	 driver.findElement(By.id("ap_email")).sendKeys(phone);
	  driver.findElement(By.id("continue")).click();
	  driver.findElement(By.id("ap_password")).sendKeys(obj[0][1]);
	  driver.findElement(By.id("signInSubmit")).click();
	  
	  driver.findElement(By.id("twotabsearchtextbox")).sendKeys(obj[0][2]);
	 driver.findElement(By.id("nav-search-submit-button")).click();
	 
	 
	 
	 
	  
  }
 /*@Test(priority=2)
  public void invalid() throws InterruptedException
  {
	  driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
	  driver.findElement(By.id("ap_email")).sendKeys("7993772263");
	  driver.findElement(By.id("continue")).click();
	  driver.findElement(By.id("ap_password")).sendKeys("kumar@123#");
	  driver.findElement(By.id("signInSubmit")).click();
	  Thread.sleep(10000);
	  //driver.findElement(By.id("continue")).click();
	  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 14");
	 driver.findElement(By.id("nav-search-submit-button")).click();
  }*/
  /*@AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }*/

}
