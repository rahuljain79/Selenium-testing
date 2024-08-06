package java_script_executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisabledElement {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		Thread.sleep(2000);
		//identify the disabled element
		WebElement disabled = driver.findElement(By.xpath
				("//input[@class='form-control']"));
		System.out.println(disabled.isEnabled());//false
		//disabled.sendKeys("MOBILES");ElementNotInteractableException
		//step 1
		JavascriptExecutor js=(JavascriptExecutor) driver;
		//step 2
		js.executeScript("arguments[0].value='MOBILES'", disabled);
	}

}
