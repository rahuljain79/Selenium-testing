package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseOfGetAttribute {
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//getAttribute()
		WebElement email = driver.findElement(By.id("email"));
		//fetch placeholder message
		String placeHolder = email.getAttribute("placeholder");
		System.out.println(placeHolder);
		driver.quit();
	}

}
