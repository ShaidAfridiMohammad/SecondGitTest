package firstTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SecondTest {
	@Test
	public void validateTest() throws IOException {
		WebDriver wd = new FirefoxDriver();
				wd.manage().window().maximize();
		wd.get("https://www.bing.com/");
		WebElement user = wd.findElement(By.name("q"));
		user.sendKeys("Madurai");
		user.sendKeys(Keys.ENTER);
		File src=((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\afridi\\eclipse-workspace\\GithubTest\\screenshot\\capture1.jpg"));
	}
}
