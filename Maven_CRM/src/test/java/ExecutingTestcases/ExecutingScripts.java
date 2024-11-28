package ExecutingTestcases;

import org.testng.annotations.Test;

import BaseClass.BaseClass;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;

public class ExecutingScripts extends BaseClass {
	@Test
	  public void TestCase() throws InterruptedException, AWTException, IOException {
		  
		Scripting S = new Scripting();
		S.login();
		S.addemployee();
		  
		 
		  
	}
  
  
}
