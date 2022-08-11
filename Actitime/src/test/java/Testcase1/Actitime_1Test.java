package Testcase1;

import org.testng.annotations.Test;

import genericLib.Basetest;

public class Actitime_1Test  extends Basetest{

	@Test(groups = {"Smoke"})
	public void logoff() {
		driver.get("https://www.pepsi.com");
		driver.get("https://www.redbus.com");
	}
}
