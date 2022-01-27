package sample2;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sampletest2{
	@Test
	public void loadGoogle()  {
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver();
		wd.get("https://www.bing.com/");
		wd.findElement(By.name("q")).sendKeys("chennai");
		wd.findElement(By.name("q")).submit();
		
		
	}
	
	
	@AfterMethod
	public void tearDown() throws IOException {
		
		File src = ((TakeScreenShot)wd).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("C:\\Selenium_Workspace\\GitHubTest\src\ScreenShot")
		
	}

}
