package dropdown_handling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multi_Select {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		//step 1
		WebElement multiDD = driver.findElement(By.id("cars"));
		//step 2
		Select sel=new Select(multiDD);
		//step 3
		//identify single select or multi select
		System.out.println(sel.isMultiple());//true
		//fetch all options
		List<WebElement> allOptions = sel.getOptions();
		for (WebElement option : allOptions) {
			System.out.println(option.getText());
		}
		Thread.sleep(2000);
		//select Free ( 90 ) 
		sel.selectByVisibleText("Free ( 90 ) ");
		//select INR 100 - INR 199 ( 16 ) 
		sel.selectByVisibleText("INR 100 - INR 199 ( 16 ) ");
		//select INR 300 - INR 399 ( 1 ) 
		sel.selectByVisibleText("INR 300 - INR 399 ( 1 ) ");
		Thread.sleep(4000);
		//deselect INR 100 - INR 199 ( 16 ) 
		sel.deselectByIndex(2);
		Thread.sleep(2000);
		//deselect all
		sel.deselectAll();
		
	}

}
