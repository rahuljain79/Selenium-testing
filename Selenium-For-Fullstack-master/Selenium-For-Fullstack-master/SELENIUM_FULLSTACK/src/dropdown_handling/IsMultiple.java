package dropdown_handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultiple {
	
	/*
	 * -->isMultiple()
	 * -->It is a non static method present in select class
	 * -->used to identify a dropdown is single select or multi select.
	 * -->return type of this method is boolean
	 * -->if the dropdown is multi-select-->true
	 * -->if the dd is single select--->false
	 */
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		//verify month dropdown is single select or multi-select
		
		//step-1==>identify the month dropdown
		WebElement monthDD = driver.findElement(By.id("month"));
		//step-2==>create an obj for Select class and pass element ref
		Select sel=new Select(monthDD);
		//step-3==>use select class method
		System.out.println(sel.isMultiple());//false-->single select
		
		Thread.sleep(3000);
		driver.get("https://demoapp.skillrary.com/");
		//step-1==>identify dd
		WebElement multiDD = driver.findElement(By.id("cars"));
		//step 2
		Select sel2=new Select(multiDD);
		//stpe 3
		System.out.println(sel2.isMultiple());//true-->multi-select
		//quit
		driver.quit();
	}

}
