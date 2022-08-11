package Testcase1;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import genericLib.Basetest;

public class Actitime_Test extends Basetest {
@Test(groups= {"regression"})
public void login() throws InterruptedException 
{
	
	driver.get("https://www.cocacola.com");
	driver.findElement(By.xpath("//span[text()='MENU']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[text()='Our Company']")).click();
	
}
}
