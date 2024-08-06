package useof_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/*
 * scrollToElement(element ref)
 * 	-->it will perform scrolling until the web_element come into view port area.
 * 	-->syntax: act.scrollToElement(element ref).perform();
 */
public class Scrolling {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		//identify subscribe button
		Thread.sleep(2000);
		WebElement subscribe = driver.findElement(By.xpath
				("//button[text()='Subscribe']"));
		Actions act=new Actions(driver);
		act.scrollToElement(subscribe).perform();
		
	}

}
