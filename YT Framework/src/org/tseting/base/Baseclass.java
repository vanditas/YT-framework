package org.tseting.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Baseclass {
	
	public ChromeDriver driver;
	public Properties pr;
	@BeforeMethod
	public void bmethod() throws IOException, InterruptedException
	{
	   File f = new File("C:\\Users\\Abhishek\\eclipse-workspace\\YT Framework\\src\\org\\testing\\testscripts\\OR.properties");
	   FileInputStream fi = new FileInputStream(f);
	   pr = new Properties();
	   pr.load(fi);
	   System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	   driver = new ChromeDriver();
	   driver.get("https://www.youtube.com/");
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	 
    }
	

}
