package child_window;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * go to SHOPPER STACK PRODUCT PAGE
 * CLICK ON COMPARE BUTTON
 * MAXIMIZE EBAY WINDOW
 * SEARCH FOR IPHONE 15 PRO MAX
 */

public class Script_1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/products_page/14");
		Thread.sleep(20000);
		// click on compare button
		driver.findElement(By.xpath(
"//*[name()='svg' and @class='MuiSvgIcon-root MuiSvgIcon-colorPrimary MuiSvgIcon-fontSizeMedium css-2c7buj']"))
				.click();
		// fetch pwid
		String pwid = driver.getWindowHandle();
		// fetch allwids
		Set<String> allWids = driver.getWindowHandles();
		// switch the conrol to ebay window
		for (String wid : allWids) {
			driver.switchTo().window(wid);
			String cUrl = driver.getCurrentUrl();
			if (cUrl.equals("ebay")) {
				driver.manage().window().maximize();
			}
		}
		// identify the search field and pass iphone
		driver.findElement(By.xpath
		("//input[@class='gh-tb ui-autocomplete-input']"))
		.sendKeys("iphone 15 pro max",Keys.ENTER);
	}

}
