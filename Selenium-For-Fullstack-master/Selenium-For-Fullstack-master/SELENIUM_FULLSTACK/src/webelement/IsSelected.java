package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		//identify excellent radio button and choose it
		WebElement excellent = driver.findElement(By.name("pollanswers-1"));
		excellent.click();
		//verify excellent radio button is selected or not
		System.out.println(excellent.isSelected());
		
	}

}
