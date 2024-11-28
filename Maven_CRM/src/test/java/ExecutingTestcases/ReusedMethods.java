package ExecutingTestcases;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class ReusedMethods extends ExecutingScripts {

	public static WebElement xp(String n)
	{
		return driver.findElement(By.xpath(obj.getProperty(n)));
		
	}
	public void t(int a) throws InterruptedException
	{
		int x = 1000*a;
		Thread.sleep(x);
		
	}
	public void sc(String f) throws IOException
	{
		File S = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File T = new File("C:\\Users\\kiran\\Eclipse workspace\\Maven_Project\\Screenshots\\" +f+ ".jpg");
		FileHandler.copy(S, T);
		
	}

}
