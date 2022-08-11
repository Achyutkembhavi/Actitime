package Testcase1;

import org.testng.annotations.Test;

import genericLib.Basetest;

public class Data extends Basetest {
@Test
public void read() {
	driver.get("https://www.flipkart.com");
}
}
