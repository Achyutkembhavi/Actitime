package Testcase1;

import org.testng.annotations.Test;

import genericLib.Basetest;

public class Actitime_8Test extends Basetest {
@Test(groups= {"smoke"})
public void slow() {
	driver.get("https://www.jio.com");
}
}
