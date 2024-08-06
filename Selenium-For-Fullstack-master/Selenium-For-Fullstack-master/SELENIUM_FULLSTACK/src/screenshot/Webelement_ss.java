package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Webelement_ss {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		//web element ss
		//step 1==>identify the webelement
		WebElement link = driver.findElement(By.linkText("Register"));
		File temp = link.getScreenshotAs(OutputType.FILE);
		File perm=new File("./screenshot/register.png");
		FileHandler.copy(temp, perm);
		//quit
		driver.quit();
	}

}
