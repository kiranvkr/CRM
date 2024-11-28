package BaseClass;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class BaseClass {
  
	public static WebDriver driver;
	
	public static Properties obj;
  
  @BeforeClass
  public void openbrowser() throws IOException {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\kiran\\Eclipse workspace\\Maven_Project\\DataFile\\chromedriver.exe");
	   driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  FileInputStream fis = new FileInputStream("C:\\Users\\kiran\\Eclipse workspace\\Maven_Project\\src\\data\\java\\TestFile");
	  
	  obj = new Properties();
	  obj.load(fis);
	  
	  
  }
}
