package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utility.WebDriverUtility;


public class automation extends WebDriverUtility{ 
	public static WebDriver driver;
	
	  @Test(priority=1)
	  public void f() {
		  String myurl = "https://www.saucedemo.com/"; 		  
			String applicationurl =  driver.getCurrentUrl(); 
			if(myurl.equals(applicationurl)) { 			 
				System.out.println("passed"); 		  
				}
			else { 			  
				System.out.println("failed");
			}
	  }
	  
	  @Test(priority=2)
	  public void g() throws InterruptedException {
		  
		   WebElement username= driver.findElement(By.id("user-name"));
		   username.sendKeys("standard_user");
		   WebElement password= driver.findElement(By.id("password"));
		   password.sendKeys("secret-sauce");
		   WebElement loginbutton= driver.findElement(By.id("login-button"));
		   loginbutton.click();
		   WebElement addtocart= driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]"));
		   addtocart.click();
		   WebElement addtocart1= driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]"));
		   addtocart1.click();
		   WebElement shopping_cart_link = driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a"));
		   shopping_cart_link.click();
		   WebElement checkout = driver.findElement(By.xpath("//*[@id=\"checkout\"]"));
		   checkout.click();
		  
		   
	  }
	  
	@BeforeTest
	  public void beforeTest() {
		    String driverpath="D:\\\\library\\\\chromedriver.exe";
			String url="https://www.saucedemo.com/";
			launchBrowser(driverpath,url);
			  }

	  @AfterTest
	  public void afterTest() {
		  driver.close();
	  }

}
