package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Useof_GetRect {
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//identify email
		WebElement email = driver.findElement(By.id("email"));
		//getRect()
		Rectangle rect = email.getRect();
		System.out.println(rect.height);
		System.out.println(rect.width);
		System.out.println(rect.x);
		System.out.println(rect.y);
		//quit
		driver.quit();
	}

}
