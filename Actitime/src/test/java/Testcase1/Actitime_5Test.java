package Testcase1;

import org.testng.annotations.Test;

import genericLib.Basetest;

public class Actitime_5Test extends Basetest {
	@Test(groups = {"regression"})
	public void book() {
		driver.get("https://www.amazon.com");
	}
}
