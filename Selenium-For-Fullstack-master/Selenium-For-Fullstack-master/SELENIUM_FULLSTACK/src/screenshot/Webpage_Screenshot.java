package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Webpage_Screenshot {
	
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		//webpage ss
		//step 1-->downcast
		TakesScreenshot ts=(TakesScreenshot) driver;
		//step 2-->take ss using getScreenshotAs() and store it temp
		File temp = ts.getScreenshotAs(OutputType.FILE);
		//step 3-->we need to specify the perm location to store the ss.
		File perm=new File("./screenshot/ss1.png");
		//step 4-->copy
		FileHandler.copy(temp, perm);
		//quit
		driver.quit();
	}

}
