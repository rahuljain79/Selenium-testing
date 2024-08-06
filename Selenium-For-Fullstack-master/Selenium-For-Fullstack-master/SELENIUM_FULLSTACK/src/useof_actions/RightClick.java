package useof_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/*
 * contextClick();
 * 	-->it is used to perform right click actions
 * 	-->we can able to perform right click operation 
 * 		-->on a single webelement
 * 		-->on a webpage also
 */
public class RightClick {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
//		//right click on webpage
//		Thread.sleep(2000);
		Actions act=new Actions(driver);
//		act.contextClick().perform();
		//right click on a webelement
		WebElement link = driver.findElement(By.linkText("Register"));
		act.contextClick(link).perform();
		
	}

}
