package useof_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/*
 * navigate to DWS
 * mouse hover on computers link
 * click on notebooks
 */
/*
 * moveToElement(Webelement ref)
 * 	-->used to perform mousehover action on a particular webelement
 * 	-->syntax: act.moveToElement(element ref).perform();
 */
public class MouseHover {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		//identify the computers link
		WebElement computers = driver.findElement(By.xpath
				("(//a[contains(text(),'Computers')])[1]"));
		//step 1-->create an obj for Actions class and pass driver ref
		Actions act=new Actions(driver);
		//step 2-->use Actions class method
		Thread.sleep(2000);
		act.moveToElement(computers).perform();
		//click on notebooks link
		Thread.sleep(2000);
		WebElement notebooks = driver.findElement
				(By.xpath("(//a[contains(text(),'Notebooks')])[1]"));
		act.click(notebooks).perform();
		
	}

}
