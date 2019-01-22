package org.testing.testscripts;

import org.openqa.selenium.By;
import org.testing.loginpage.LoginPage;
import org.testng.annotations.Test;
import org.tseting.base.Baseclass;
import java.io.File;

public class TC1 extends Baseclass {
	
	@Test
	public void f() throws InterruptedException
	{
		LoginPage l = new LoginPage(driver,pr);
     l.signIn("vanditasharma29@gmail.com","kjklhg2");
     
	 driver.findElement(By.xpath(pr.getProperty("trending"))).click();
	 
	 
	}

}
