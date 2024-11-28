package ExecutingTestcases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Scripting extends ReusedMethods {

	
		
		public void login()
		{
			  driver.get(obj.getProperty("URL"));
			  
			  xp("XUN").sendKeys(obj.getProperty("UN"));
			  
			  
			  xp("XPWD").sendKeys(obj.getProperty("PWD"));
			  
			  xp("XSUB").click();
			
			
		}
		public void addemployee() throws InterruptedException, AWTException, IOException 
		{
			
			
			t(2);
			
			Actions A = new Actions(driver);
			
			A.moveToElement(xp("XPIM")).perform();
			
			t(1);
			
			xp("XADD").click();
			
			driver.switchTo().frame(xp("XFRAME"));
			t(1);
			xp("XID").clear();
			
			sc("Before adding");
			
			t(1);
			xp("XID").sendKeys("1429");
			xp("XLAST").sendKeys("Kumar");
			xp("XFIRST").sendKeys("Kiran");
			xp("XMIDDLE").sendKeys("kirankk");
			xp("XNICK").sendKeys("KK");
			t(1);
			A.moveToElement(xp("XPHOTO")).click().perform();
			
			t(1);
			
			
			StringSelection SS = new StringSelection("C:\\Users\\kiran\\Downloads\\ss.jpeg");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(SS, null);
			
			t(1);
			
			Robot R = new Robot();
			
			R.keyPress(KeyEvent.VK_CONTROL);
			R.keyPress(KeyEvent.VK_V);
			R.keyRelease(KeyEvent.VK_CONTROL);
			R.keyRelease(KeyEvent.VK_V);
			
			t(1);
			
			R.keyPress(KeyEvent.VK_ENTER);
			R.keyRelease(KeyEvent.VK_ENTER);
			t(1);
			sc("Before save");
			
			xp("XSAVE").click();
			
			sc("after save");
			
			t(1);
			
			
			xp("XBACK").click();
			//Screenshot
			
			
				
		}
		
		
		
			
}
		

