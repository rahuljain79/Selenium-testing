package java_script_executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenElement {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		Thread.sleep(2000);
		// identify the hidden element
		WebElement hidden = driver.findElement(By.name("custom_gender"));
		// step 1
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// step 2
		js.executeScript("arguments[0].value='@@@@@@@@@'", hidden);
	}

}
