package dropdown_handling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/*
 * print all the options present in day drop down
 */
/*
 * getOptions()
 * -->used to fetch all the options present in a drop down
 * -->return type of this method-->List<WebElement>
 */
public class VerifyAllOptions {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		//step-1==>identify the month drop down
		WebElement dayDD = driver.findElement(By.id("day"));
		//step-2==>create an obj for Select class and pass element ref
		Select sel=new Select(dayDD);
		Thread.sleep(2000);
		List<WebElement> allOptions = sel.getOptions();
		for (WebElement option : allOptions) {
			System.out.println(option.getText());
		}
	}

}
