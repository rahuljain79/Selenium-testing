package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeys_Keyboard {
	
	//perform login operation in fb by identifying only one webelement
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//identify email
		WebElement email = driver.findElement(By.id("email"));
		//keyboard actions
		email.sendKeys
		("abc@gmail.com",Keys.TAB,"Abc@123",Keys.TAB,Keys.TAB,Keys.ENTER);
		
	}

}
