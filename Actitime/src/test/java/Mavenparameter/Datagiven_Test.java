package Mavenparameter;


import org.testng.annotations.Test;

public class Datagiven_Test {
	@Test
	public void logg(){
		
		String uname = System.getProperty("urlname");
		String bname = System.getProperty("browsername");
	
		System.out.println(uname);
        System.out.println(bname);	
	} 

}
