package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fb_Login {
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//enter email
		driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']"))
								.sendKeys("abc@gmail.com");
		//enter pwd
		driver.findElement(By.xpath("//input[contains(@type,'pass')]")).sendKeys("Abc@123");
		//click on login button
		driver.findElement(By.xpath("//button[@value='1']")).click();
	}

}
