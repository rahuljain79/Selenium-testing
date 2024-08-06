package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseOf_Classname {
	
	//By.className("class attribute value");
	//It is used to identify the webelement based on class attribute value
	//driver.findElement(By.className("class att.value"));
	
	//note
		//when class attribute value contains space we should not use
			//By.className() as a locator
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		//click on register link
		driver.findElement(By.className("ico-register")).click();
		
		//enter data in search store textfield
		driver.findElement(By.className("search-box-text ui-autocomplete-input"))
														.sendKeys("mobiles");
		
	}

}
