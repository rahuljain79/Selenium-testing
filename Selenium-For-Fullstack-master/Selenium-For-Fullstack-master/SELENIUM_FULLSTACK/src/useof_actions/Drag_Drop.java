package useof_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/*
 * dragAndDrop(src we,target we)
 * 	-->which is used to perform drag and drop
 * 	-->we need to pass 2 parameters
 * 	-->syntax: act.dragAndDrop().perform();
 */

public class Drag_Drop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get
	("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Thread.sleep(2000);
		// drag and drop
		// identify washington-->src
		WebElement washington = driver.findElement(By.id("box3"));
		// identify united states-->target
		WebElement usa = driver.findElement(By.id("box103"));
		Actions act = new Actions(driver);
		act.dragAndDrop(washington, usa).perform();

		// identify -->src
		WebElement rome = driver.findElement(By.id("box6"));
		// identify united states-->target
		WebElement italy = driver.findElement(By.id("box106"));
		act.dragAndDrop(rome, italy).perform();

	}

}
