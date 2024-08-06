package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_Displayed {
	
	/*
	 * to verify register link is working properly or not
	 */
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		//identify register link is present or not
		WebElement register = driver.findElement(By.linkText("Register"));
		//System.out.println(register.isDisplayed());
		//validate and click
		if(register.isDisplayed())
		{
			register.click();
		}
		else
		{
			System.out.println("link is not present");
		}
	}

}
