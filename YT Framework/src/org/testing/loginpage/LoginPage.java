package org.testing.loginpage;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
	ChromeDriver driver;
	Properties pr;
	
	public LoginPage (ChromeDriver driver, Properties pr)
	{
		this.driver=driver;
		this.pr=pr;
	}
    public void signIn(String username, String password)
    
    {
   	 driver.findElement(By.xpath(pr.getProperty("signin"))).click();
   	 driver.findElement(By.xpath(pr.getProperty("username"))).sendKeys(username);
   	 driver.findElement(By.xpath(pr.getProperty("next"))).click();
   	 driver.findElement(By.xpath(pr.getProperty("password"))).sendKeys(password);
   	 driver.findElement(By.xpath(pr.getProperty("nextt"))).click();
    }
}
