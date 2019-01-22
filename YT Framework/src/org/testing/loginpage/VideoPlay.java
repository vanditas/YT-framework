package org.testing.loginpage;

import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VideoPlay {

	ChromeDriver driver;
	Properties pr;
	
	public VideoPlay(ChromeDriver driver, Properties pr)
	{
		this.driver=driver;
		this.pr=pr;
		
	}
    public void videop()
    {
	 List <WebElement> ls= driver.findElements(By.id(pr.getProperty("title")));
	 System.out.println("total videos" +ls.size());
	 ls.get(0).click();
	 
    }

}
