package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Basepack.BaseClass;

public class TestCaseExecution extends BaseClass{
	
@Test(priority = 1)
	
	public void TestCase1() throws InterruptedException {
		Scripting script = new Scripting();
		 script.registration();
		 Thread.sleep(5000);
    }	

@Test(priority = 2)
	public void TestCase2() throws InterruptedException {
	Scripting script = new Scripting();
	 script.login();
	 Thread.sleep(5000);
}	
@Test(priority = 3)
public void TestCase3() throws InterruptedException {
	Scripting script = new Scripting();
	 script.search();
	 Thread.sleep(3000);


}

}		
	



	


