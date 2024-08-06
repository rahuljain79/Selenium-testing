package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseOf_Name {
	//By.name("name attribute value")
	//used to identify the webelement based on name attribute value
	//WebElement element=driver.fe(By.name("name attribute value"))
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);	
		//identify password textfield and pass "Abc@123"
		WebElement passwordTextfield = driver.findElement(By.name("pass"));
		passwordTextfield.sendKeys("Abc@123");
	}

}
