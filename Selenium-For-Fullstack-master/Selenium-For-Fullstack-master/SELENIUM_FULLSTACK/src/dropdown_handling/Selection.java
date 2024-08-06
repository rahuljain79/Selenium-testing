package dropdown_handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/*
 * -->in month drop down
 * 		-->select feb
 * 		-->select july
 * 		-->select dec
 */
public class Selection {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		//step-1==>identify the month drop down
		WebElement monthDD = driver.findElement(By.id("month"));
		//step-2==>create an obj for Select class and pass element ref
		Select sel=new Select(monthDD);
		Thread.sleep(2000);
		//step-3==>use select class method
		sel.selectByIndex(1);//feb
		Thread.sleep(2000);
		sel.selectByValue("7");//july
		Thread.sleep(2000);
		sel.selectByVisibleText("Dec");//dec
		//deselect dec
		sel.deselectByVisibleText("Dec");//UnsupportedOperationException
		
	}

}
