package findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinks {
	
	//to print all the links present in DWS welcome page
	
	//By.tagName("tagname")
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		//print all links
		List<WebElement> allLinks = driver.findElements
											(By.tagName("a"));
		//print
		for (WebElement link : allLinks) {
			System.out.println(link.getText());
		}
		//quit
		driver.quit();
		
	}

}
