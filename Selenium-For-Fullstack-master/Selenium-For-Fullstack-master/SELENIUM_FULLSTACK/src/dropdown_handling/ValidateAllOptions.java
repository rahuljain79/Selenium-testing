package dropdown_handling;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/*
 * choose all the options one by one in year dd
 */

public class ValidateAllOptions {
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		//step-1==>identify the month drop down
		WebElement yearDD = driver.findElement(By.id("year"));
		//step-2==>create an obj for Select class and pass element ref
		Select sel=new Select(yearDD);
		//step 3
		List<WebElement> allOptions = sel.getOptions();
		// by index
		
//		for (int i = 0; i < allOptions.size(); i++) {
//			sel.selectByIndex(i);
//		}
		
		//by visible text
//		for (WebElement option : allOptions) {
//			String text = option.getText();
//			sel.selectByVisibleText(text);
//		}
		
		//attribute value
		for (WebElement option : allOptions) {
			String attValue = option.getAttribute("value");
			sel.selectByValue(attValue);
		}
	}

}
