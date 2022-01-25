package sample1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleTest {
	@Test
	public void loadGoogle()  {
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver();
		wd.get("https://www.google.com/");
		wd.findElement(By.name("q")).sendKeys("chennai");
		wd.findElement(By.name("q")).submit();
		
		
	}
	
	
	@AfterMethod
	public void tearDown() throws IOException {
		
		File src = ((TakeScreenShot)wd).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("C:\Selenium_Workspace\GitHubTest\src\ScreenShot")
		
	}

}
