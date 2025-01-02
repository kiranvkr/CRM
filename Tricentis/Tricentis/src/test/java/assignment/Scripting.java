package assignment;

import java.time.Duration;

import java.util.List;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Scripting extends TestCaseExecution {
	
public void registration() throws InterruptedException {

	WebElement Gender=driver.findElement(By.xpath("//input[@id='gender-male']"));
	Gender.click();	
	WebElement FirstName=driver.findElement(By.xpath("//input[@id='FirstName']"));
	FirstName.sendKeys("Kiran");
	WebElement LastName=driver.findElement(By.xpath("//input[@id='LastName']"));
	LastName.sendKeys("Kumar");
	WebElement Email=driver.findElement(By.xpath("//input[@id='Email']"));
	Email.sendKeys("kiranvkr27@gmail.com");
	WebElement Password=driver.findElement(By.xpath("//input[@id='Password']"));
	Password.sendKeys("mahirakiran");
	WebElement CPassword=driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
	CPassword.sendKeys("mahirakiran");
	WebElement Register=driver.findElement(By.xpath("//input[@id='register-button']"));
	Register.click();
	
	
	/*WebElement successMessage = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]"));
    if (successMessage.isDisplayed()) {
        System.out.println("Registration successful: " + successMessage.getText());
    } else {
        System.out.println("Registration failed.");
    }*/
    
	WebElement Continue=driver.findElement(By.xpath("//input[@class='button-1 register-continue-button']"));
	Continue.click();
	Thread.sleep(5000);
	
	
	
	WebElement logout=driver.findElement(By.xpath("//a[@href='/logout']"));
	logout.click();
	Thread.sleep(5000);
	
}

public void login() {
	
	WebElement login=driver.findElement(By.xpath("//a[@href='/login']"));
	login.click();
	WebElement Email=driver.findElement(By.xpath("//input[@id='Email']"));
	Email.sendKeys("kiranvkr27@gmail.com");
	WebElement Password=driver.findElement(By.xpath("//input[@id='Password']"));
	Password.sendKeys("mahirakiran");
	/*
	WebElement RememberMe=driver.findElement(By.id("RememberMe"));
	 if (!RememberMe.isSelected()) {
		 RememberMe.click();
     }*/
	WebElement Login=driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
	Login.click();
	
}

public void search() {
	try {
		 System.out.println("Executing Test Case 1: Valid Search");
         WebElement searchBox = driver.findElement(By.xpath("//input[@id='small-searchterms']"));
         searchBox.sendKeys("Laptop");
         WebElement searchButton = driver.findElement(By.xpath("//input[@value='Search']"));
         searchButton.click();
         WebElement results = driver.findElement(By.xpath("//div[@class='search-results']"));
         if (results.isDisplayed()) {
             System.out.println("Results displayed successfully for the search query 'Laptop'.");
         } else {
             System.out.println("No results found for the query 'Laptop'.");
         }
         Thread.sleep(5000);
         System.out.println("\nExecuting Test Case 2: Invalid Search");
         WebElement searchBox1 = driver.findElement(By.id("Q"));
         searchBox1.clear(); 
         searchBox1.sendKeys("birds");
         WebElement searchButton1 = driver.findElement(By.xpath("//input[@class='button-1 search-button']"));
         searchButton1.click();
         Thread.sleep(5000);
         WebElement noResultsMessage = driver.findElement(By.xpath("//div[@class='search-results']//strong"));
         if (noResultsMessage.isDisplayed()) {
             System.out.println("Correct message displayed: 'No products were found that matched your criteria'.");
         } else {
             System.out.println("Unexpected behavior for invalid search.");
         } 
         Thread.sleep(5000);
          System.out.println("\nExecuting Test Case 3: Empty Search");
          
          WebElement searchBox2 = driver.findElement(By.id("Q"));
          searchBox2.clear(); 
          WebElement searchButton2 = driver.findElement(By.xpath("//input[@class='button-1 search-button']"));
          searchButton2.click();
          WebElement emptySearchError = driver.findElement(By.xpath("//div[@class='search-results']//strong"));
          if (emptySearchError.isDisplayed()) {
              System.out.println("Correct message displayed: 'Please enter a search term'.");
          } else {
              System.out.println("Unexpected behavior for empty search.");
          }
          
	} catch (Exception e) {
        System.out.println("An error occurred during registration testing: " + e.getMessage());
    } finally {
        // Close the browser
    }
}
}
