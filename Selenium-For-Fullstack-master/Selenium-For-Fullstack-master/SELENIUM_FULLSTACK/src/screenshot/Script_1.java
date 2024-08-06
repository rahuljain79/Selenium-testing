package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

/*
 * go to chrome and navigate to fb login page
 * take ss of login page
 * enter a valid email and take ss of it
 * enter valid password and take a ss of it
 * click on login and take ss of result page.
 */

public class Script_1 {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//take ss of login page
		TakesScreenshot ts=(TakesScreenshot) driver;
		File loginTemp = ts.getScreenshotAs(OutputType.FILE);
		File loginPerm=new File("./screenshot/login.png");
		FileHandler.copy(loginTemp, loginPerm);
		//enter email
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("abc@gmail.com");
		File emailTemp = email.getScreenshotAs(OutputType.FILE);
		File emailPerm=new File("./screenshot/email.png");
		FileHandler.copy(emailTemp, emailPerm);
		//enter pwd
		WebElement pwd = driver.findElement(By.id("pass"));
		pwd.sendKeys("Abc@123");
		File pwdTemp = email.getScreenshotAs(OutputType.FILE);
		File pwdPerm=new File("./screenshot/password.png");
		FileHandler.copy(pwdTemp, pwdPerm);
		//click on login
		driver.findElement(By.name("login")).click();
		Thread.sleep(7000);
		File resultTemp = ts.getScreenshotAs(OutputType.FILE);
		File resultPerm=new File("./screenshot/result.png");
		FileHandler.copy(resultTemp, resultPerm);
	}

}
