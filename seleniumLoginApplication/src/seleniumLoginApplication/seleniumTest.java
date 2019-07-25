package seleniumLoginApplication;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class seleniumTest {
//	        public static void main(String[] args) throws IOException, InterruptedException {
//	                System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
//	 
//	                WebDriver driver = new ChromeDriver();
//	 
//	                driver.get("http://127.0.0.1:5500/");
//	                Thread.sleep(1000);
//	                driver.findElement(By.linkText("Register")).click();
//	 
//	                Thread.sleep(1000);
//	                driver.findElement(By.id("validationCustom01")).sendKeys("abcd");
//	                driver.findElement(By.id("validationCustom02")).sendKeys("efgh");
//	                driver.findElement(By.id("validationCustomUsername")).sendKeys("abc@gmail.com");
//	                driver.findElement(By.id("validationCustom03")).sendKeys("9878906789");
//	                driver.findElement(By.id("validationCustom04")).sendKeys("abcd");
//	    
//	                driver.findElement(By.id("submitRegButton")).click();
//	                
//	                
//	              
//	                //driver.quit();
//	        }
	@Test
	public void seleniumTest1() throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
		 
		                WebDriver driver = new ChromeDriver();
		 
//		                driver.get("http://127.0.0.1:5500/");
		                driver.get("http://dev2.app.cloudlytics.com/main");
		                Thread.sleep(1000);
//		                driver.findElement(By.linkText("Register")).click();
		 driver.findElement(By.id("loginBtn")).click();
		                Thread.sleep(1000);
//		                driver.findElement(By.id("validationCustom01")).sendKeys("abcd");
//		                driver.findElement(By.id("validationCustom02")).sendKeys("efgh");
//		                driver.findElement(By.id("validationCustomUsername")).sendKeys("abc@gmail.com");
//		                driver.findElement(By.id("validationCustom03")).sendKeys("9878906789");
//		                driver.findElement(By.id("validationCustom04")).sendKeys("abcd");
//		    
//		                driver.findElement(By.id("submitRegButton")).click();
		                
		                
	}
}
