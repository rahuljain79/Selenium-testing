package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseOf_ID {
	//By.id("id attribute value")
	//it is a locator which is used to identify the webelement
			//based on id attribute value
	//WebElement emailTextField = driver.findElement(By.id("id attribute value"));
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		//identify email text field and pass "abc@gmail.com"
		WebElement emailTextField = driver.findElement(By.id("email"));
		emailTextField.sendKeys("abc@gmail.com");
	}

}
