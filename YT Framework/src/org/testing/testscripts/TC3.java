package org.testing.testscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testing.loginpage.LoginPage;
import org.testing.loginpage.VideoPlay;
import org.testng.annotations.Test;
import org.tseting.base.Baseclass;

public class TC3 extends Baseclass {
	
	@Test
	public void f() throws InterruptedException
	{
		LoginPage l = new LoginPage(driver,pr);
     l.signIn("vanditasharma29@gmail.com","kjkjghj2");
     Thread.sleep(5000);
     VideoPlay v = new VideoPlay(driver,pr);
     v.videop();
     Thread.sleep(5000);
     List<WebElement> like = driver.findElements(By.xpath(pr.getProperty("like")));
     like.get(0).click();
     
	// driver.findElement(By.xpath(pr.getProperty("trending"))).click();
	 
	 
	}

}
