package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_MultipleData {
	
	//to verify email textfield is accepting different email
		//-->vj@gmail.com
		//-->vj@abc.com
		//-->rocky@cricket.in
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//identify email
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("vj@gmail.com");
		Thread.sleep(1000);
		email.clear();
		email.sendKeys("vj@abc.com");
		Thread.sleep(1000);
		email.clear();
		email.sendKeys("rocky@cricket.in");
	}

}
