package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		//identify disabled element
		WebElement disabled = driver.findElement(By.xpath
				("//input[@class='form-control']"));
		//verify the element is enabled or disabled
		System.out.println(disabled.isEnabled());//false
	}

}
